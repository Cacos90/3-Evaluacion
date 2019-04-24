package Formulario;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MetodoForm extends JFrame{
	JButton aceptar, cerrar;
	JTextField caja1, caja2, caja3;
	JLabel etiqueta, etiqueta2, contrasena;
	JPasswordField contrasenna;
	
	public  MetodoForm(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Image icono =mipantalla.getImage("C:\\Users\\jorge\\Documents\\Programacion\\3 evaluación\\src\\ganador.png");
		setIconImage(icono);
		setVisible(true);
		setSize(550, 260);
		setLayout(null);
		
		setTitle("Registro");
		
		etiqueta = new JLabel();
		etiqueta.setText("Nombre");
		etiqueta.setBounds(100, 10, 100, 30);
		getContentPane().add(etiqueta);

		caja1 = new JTextField();
		caja1.setBounds(200, 10, 150, 30);
		getContentPane().add(caja1);
		
		
		etiqueta2 = new JLabel();
		etiqueta2.setText("Apellidos");
		etiqueta2.setBounds(100, 50, 100, 30);
		getContentPane().add(etiqueta2);

		caja2 = new JTextField();
		caja2.setBounds(200, 50, 150, 30);
		getContentPane().add(caja2);
		
		contrasena = new JLabel();
		contrasena.setText("Contraseña");
		contrasena.setBounds(100, 100, 100, 30);
		getContentPane().add(contrasena);
		
		contrasenna = new JPasswordField();
		contrasenna.setBounds(200, 100, 150, 30);
		getContentPane().add(contrasenna);

		aceptar = new JButton();
		aceptar.setText("Aceptar");
		aceptar.setBounds(100, 150, 100, 30);
		getContentPane().add(aceptar);
		aceptar.setBackground(Color.lightGray);
		
		cerrar = new JButton();
		cerrar.setText("Cancelar");
		cerrar.setBounds(300, 150, 100, 30);
		getContentPane().add(cerrar);
		cerrar.setBackground(Color.lightGray);

		
	}
		
		
	}

