package AplicacionBBDD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import org.omg.CORBA.PUBLIC_MEMBER;

import BBDD.Consultas;

import java.util.Calendar;

public class Ventana extends JFrame {

	private JPanel Comprobante;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEdad;
	private JTextField textmatricula;
	private JTextField textDNI;
	private JLabel jlabControl;
	private JSpinner spinFecha;

	public Ventana() {
		setTitle("Registro Alumnado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Comprobante = new JPanel();
		Comprobante.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Comprobante);
		Comprobante.setLayout(null);

		JLabel lblIntroducaElNombre = new JLabel("Nombre");
		lblIntroducaElNombre.setBounds(12, 48, 61, 16);
		Comprobante.add(lblIntroducaElNombre);

		textNombre = new JTextField();
		textNombre.setBounds(66, 45, 116, 22);
		Comprobante.add(textNombre);
		textNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(12, 80, 61, 16);
		Comprobante.add(lblApellido);

		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(66, 77, 116, 22);
		Comprobante.add(textApellido);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(12, 109, 61, 16);
		Comprobante.add(lblFecha);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(12, 141, 61, 16);
		Comprobante.add(lblEdad);

		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(66, 138, 116, 22);
		Comprobante.add(textEdad);

		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(12, 171, 61, 16);
		Comprobante.add(lblMatricula);

		JSpinner spinFecha = new JSpinner();
		spinFecha.setModel(new SpinnerDateModel(new java.util.Date(
				1557266400000L), null, null, Calendar.DAY_OF_YEAR));
		spinFecha.setBounds(66, 109, 116, 22);
		Comprobante.add(spinFecha);

		textmatricula = new JTextField();
		textmatricula.setColumns(10);
		textmatricula.setBounds(66, 168, 116, 22);
		Comprobante.add(textmatricula);

		JLabel jlabControl = new JLabel("");
		jlabControl.setBounds(40, 209, 166, 33);
		Comprobante.add(jlabControl);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consulta();
			}
		});
		btnConsultar.setBounds(248, 19, 97, 25);
		Comprobante.add(btnConsultar);

		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertar();
			}
		});
		btnInsertar.setBounds(248, 58, 97, 25);
		Comprobante.add(btnInsertar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modificacion();
			}
		});
		btnModificar.setBounds(248, 96, 97, 25);
		Comprobante.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnEliminar.setBounds(248, 137, 97, 25);
		Comprobante.add(btnEliminar);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(12, 19, 61, 16);
		Comprobante.add(lblDni);

		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(66, 16, 116, 22);
		Comprobante.add(textDNI);

	}

	public void Consulta() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/programacion", "root", "");
			Statement objetoStatement = conexion.createStatement();
			String sentencia = "SELECT * FROM registro";
			ResultSet resultado = objetoStatement.executeQuery(sentencia);
			while (resultado.next()) {
				if (textDNI.getText().equals(resultado.getString("DNI"))) {
					textApellido.setText(resultado.getString("Apellido"));
					textNombre.setText(resultado.getString("Nombre"));
					textEdad.setText(Integer.toString(resultado.getInt("Edad")));
					textmatricula.setText(Double.toString(resultado
							.getDouble("Matricula")));
					spinFecha.setValue(resultado.getDate("fecha"));
					jlabControl.setText("Correcto");
				} else {
					jlabControl.setText("Incorrecto");
				}
				if (resultado != null) { // liberar los ResultSet
					resultado.close();
				}

				if (objetoStatement != null) { // liberar los Statement
					objetoStatement.close();
				}
				if (conexion != null) { // liberar la conexión a la BD
					conexion.close();
				}

			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Problema en el registro del driver");
		} catch (SQLException sqle) {
			System.out.println("Problema en la base de Datos");
		} catch (Exception e) {
			System.out.println("Problema en las operaciones");
		}
	}

	public void insertar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/programacion", "root", "");
			Statement objetoStatement = conexion.createStatement();
			String sentencia = "SELECT * FROM registro";

			ResultSet resultado = objetoStatement.executeQuery(sentencia);

			String dni = textDNI.getText();
			String nombre = textNombre.getText();
			String apellido = textApellido.getText();
			int edad = Integer.parseInt(textEdad.getText());
			double matricula = Double.parseDouble(textmatricula.getText());
			// Date fecha=Date.parse(spinFecha.getValue());

			while (resultado.next()) {
				System.out.println(resultado.getString("DNI") + " "
						+ resultado.getString("Nombre") + " "
						+ resultado.getString("Apellido") + " "
						+ +resultado.getInt("Edad") + " "
						+ resultado.getString("Matricula"));
			}
			String sentenciaInsert = "INSERT INTO registro (DNI, Nombre, Apellido, Edad, Matricula) VALUES  ('"
					+ dni
					+ "','"
					+ nombre
					+ "','"
					+ apellido
					+ "',"
					+ edad
					+ "," + matricula + ")";
			System.out.println(sentenciaInsert);
			objetoStatement.executeUpdate(sentenciaInsert);

			jlabControl.setText("Insertado Correctamente");
			if (resultado != null) { // liberar los ResultSet
				resultado.close();
			}

			if (objetoStatement != null) { // liberar los Statement
				objetoStatement.close();
			}
			if (conexion != null) { // liberar la conexión a la BD
				conexion.close();
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Problema en el registro del driver");
		} catch (SQLException sqle) {
			System.out.println("Problema en la base de Datos");
		} catch (Exception e) {
			System.out.println("Problema en las operaciones");
		}
	}

	public void modificacion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/programacion", "root", "");
			Statement objetoStatement = conexion.createStatement();
			String sentencia = "SELECT * FROM registro";
			ResultSet resultado = objetoStatement.executeQuery(sentencia);

			String dni = textDNI.getText();
			// String nombre=textNombre.getText();
			// String apellido=textApellido.getText();
			// int edad=Integer.parseInt(textEdad.getText());
			double matricula = Double.parseDouble(textmatricula.getText());
			while (resultado.next()) {
				System.out.println(resultado.getString("DNI") + " "
						+ resultado.getString("Matricula"));
			}
			String sentenciaUpdate = "UPDATE registro SET Matricula="
					+ matricula + "  WHERE DNI='" + dni + "'";
			System.out.println(sentenciaUpdate);
			objetoStatement.executeUpdate(sentenciaUpdate);
			jlabControl.setText("Modificado Correctamente");
			if (resultado != null) { // liberar los ResultSet
				resultado.close();
			}

			if (objetoStatement != null) { // liberar los Statement
				objetoStatement.close();
			}
			if (conexion != null) { // liberar la conexión a la BD
				conexion.close();
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Problema en el registro del driver");
		} catch (SQLException sqle) {
			System.out.println("Problema en la base de Datos");
		} catch (Exception e) {
			System.out.println("Problema en las operaciones");
		}
	}

	public void eliminar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/programacion", "root", "");
			Statement objetoStatement = conexion.createStatement();
			String sentencia = "SELECT * FROM registro";
			ResultSet resultado = objetoStatement.executeQuery(sentencia);

			String dni = textDNI.getText();
			while (resultado.next()) {
				System.out.println(resultado.getString("DNI"));
			}
			String sentenciaDelete = "DELETE FROM registro WHERE DNI = '" + dni
					+ "' ";
			System.out.println(sentenciaDelete);
			objetoStatement.executeUpdate(sentenciaDelete);
			jlabControl.setText("Eliminado Correctamente");
			if (resultado != null) { // liberar los ResultSet
				resultado.close();
			}

			if (objetoStatement != null) { // liberar los Statement
				objetoStatement.close();
			}
			if (conexion != null) { // liberar la conexión a la BD
				conexion.close();
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Problema en el registro del driver");
		} catch (SQLException sqle) {
			System.out.println("Problema en la base de Datos");
		} catch (Exception en) {
			System.out.println("Problema en las operaciones");
		}
	}

}
