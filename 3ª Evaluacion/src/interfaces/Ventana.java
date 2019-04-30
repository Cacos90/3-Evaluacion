package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField caja2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Al Rev\u00E9s");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexoPrincipal = new JLabel("Texo principal");
		lblTexoPrincipal.setBounds(57, 65, 92, 16);
		contentPane.add(lblTexoPrincipal);
		
		Caja1 = new JTextField();
		Caja1.setBounds(42, 93, 116, 22);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		JLabel lblTextoCopiado = new JLabel("Texto al rev\u00E9s");
		lblTextoCopiado.setBounds(278, 65, 82, 16);
		contentPane.add(lblTextoCopiado);
		
		caja2 = new JTextField();
		caja2.setBounds(272, 93, 116, 22);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto="";
				String texto2=Caja1.getText();
				for (int x=Caja1.getText().length()-1; x>=0;x--) {
					
					texto=texto+texto2.charAt(x);
				}
				caja2.setText(texto);
			}
			});
	
		button.setBounds(183, 47, 41, 39);
		contentPane.add(button);
		
		JButton Boton2 = new JButton("<");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto="";
				String texto2=caja2.getText();
				for (int x=caja2.getText().length()-1; x>=0;x--) {
					
					texto=texto+texto2.charAt(x);
				}
				Caja1.setText(texto);
			}
		});
		Boton2.setBounds(183, 110, 41, 39);
		contentPane.add(Boton2);
	}
}
