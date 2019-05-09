package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;
	private JTextField caja5;
	private JTextField caja6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setTitle("Numero Random");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		caja1 = new JTextField();
		caja1.setBounds(42, 59, 29, 22);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(84, 59, 29, 22);
		contentPane.add(caja2);
		
		caja3 = new JTextField();
		caja3.setColumns(10);
		caja3.setBounds(125, 59, 29, 22);
		contentPane.add(caja3);
		
		caja4 = new JTextField();
		caja4.setColumns(10);
		caja4.setBounds(166, 59, 29, 22);
		contentPane.add(caja4);
		
		caja5 = new JTextField();
		caja5.setColumns(10);
		caja5.setBounds(207, 59, 29, 22);
		contentPane.add(caja5);
		
		caja6 = new JTextField();
		caja6.setColumns(10);
		caja6.setBounds(271, 59, 35, 22);
		contentPane.add(caja6);
		
		JLabel lblComplementario = new JLabel("Complementario");
		lblComplementario.setBounds(243, 30, 102, 16);
		contentPane.add(lblComplementario);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numero1=0;
				int numero2=0;
				int numero3=0;
				int numero4=0;
				int numero5=0;
				int numero6=0;
				numero1 = (int) (Math.random() * 100) + 1;
				numero2 = (int) (Math.random() * 100) + 1;
				numero3 = (int) (Math.random() * 100) + 1;
				numero4 = (int) (Math.random() * 100) + 1;
				numero5= (int) (Math.random() * 100) + 1;
				numero6 = (int) (Math.random() * 100) + 1;
				caja1.setText(Integer.toString(numero1)); //pasar de int a text a través de un Integer
				caja2.setText(Integer.toString(numero2));
				caja3.setText(Integer.toString(numero3));
				caja4.setText(Integer.toString(numero4));
				caja5.setText(Integer.toString(numero5));
				caja6.setText(Integer.toString(numero6));


			}
		});
		btnNewButton.setBounds(139, 136, 102, 33);
		contentPane.add(btnNewButton);
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		btnSalir.setBounds(253, 136, 104, 33);
		contentPane.add(btnSalir);
	}
}
