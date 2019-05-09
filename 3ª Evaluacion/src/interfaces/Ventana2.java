package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {
 
	private static JPanel contentPane;
	
	
	public Ventana2() {
		setTitle("Chef 4000");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox lenteja = new JCheckBox("Lentejas");
		lenteja.setBounds(22, 75, 83, 25);
		contentPane.add(lenteja);
		
		JCheckBox chorizo = new JCheckBox("Chorizo");
		chorizo.setBounds(22, 103, 77, 25);
		contentPane.add(chorizo);
		
		JCheckBox morcilla = new JCheckBox("Morcilla");
		morcilla.setBounds(106, 103, 83, 25);
		contentPane.add(morcilla);
		
		JRadioButton rdbtnCocido = new JRadioButton("Cocido");
		rdbtnCocido.setBounds(65, 21, 67, 25);
		contentPane.add(rdbtnCocido);
		
		JRadioButton rdbtnLentejas = new JRadioButton("Lentejas");
		rdbtnLentejas.setBounds(136, 21, 83, 25);
		contentPane.add(rdbtnLentejas);
		
		JRadioButton rdbtnJudas = new JRadioButton("Jud\u00EDas");
		rdbtnJudas.setBounds(223, 21, 67, 25);
		contentPane.add(rdbtnJudas);
		
		JCheckBox garbanzos = new JCheckBox("Garbanzos");
		garbanzos.setBounds(106, 75, 89, 25);
		contentPane.add(garbanzos);
		
		JCheckBox cebolla = new JCheckBox("Cebolla");
		cebolla.setBounds(22, 133, 83, 25);
		contentPane.add(cebolla);
		
		JCheckBox zanahoria = new JCheckBox("Zanahoria");
		zanahoria.setBounds(106, 133, 89, 25);
		contentPane.add(zanahoria);
		
		JCheckBox judia = new JCheckBox("Jud\u00EDas");
		judia.setBounds(199, 75, 67, 25);
		contentPane.add(judia);
		
		JCheckBox colorante = new JCheckBox("Colorante");
		colorante.setBounds(199, 103, 83, 25);
		contentPane.add(colorante);
		
		JCheckBox pescado = new JCheckBox("Pescado");
		pescado.setBounds(199, 133, 77, 25);
		contentPane.add(pescado);
		
		JCheckBox laurel = new JCheckBox("Laurel");
		laurel.setBounds(281, 103, 113, 25);
		contentPane.add(laurel);
		
		JCheckBox nuezMoscada = new JCheckBox("Nuez Moscada");
		nuezMoscada.setBounds(281, 75, 113, 25);
		contentPane.add(nuezMoscada);
		
		JCheckBox pimenton = new JCheckBox("Piment\u00F3n");
		pimenton.setBounds(281, 133, 113, 25);
		contentPane.add(pimenton);
		
		JButton botonComprobacion = new JButton("Comprobar");
		botonComprobacion.setBounds(79, 167, 110, 33);
		contentPane.add(botonComprobacion);
		
		JLabel comprobante = new JLabel("");
		comprobante.setBounds(167, 226, 83, 16);
		contentPane.add(comprobante);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		btnSalir.setBounds(209, 167, 104, 33);
		contentPane.add(btnSalir);
		botonComprobacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (rdbtnLentejas.isSelected()){
					if (chorizo.isSelected() && morcilla.isSelected() && garbanzos.isSelected()
							&& zanahoria.isSelected()){
					comprobante.setText("Correcto");
					}
					else {
						comprobante.setText("Incorrecto");
					
					}
						
				}
				if (rdbtnCocido.isSelected()){
					if (lenteja.isSelected() && chorizo.isSelected() && cebolla.isSelected()
							&& zanahoria.isSelected() && pimenton.isSelected()){
						comprobante.setText("Correcto");
					}
					else {
						comprobante.setText("Incorrecto");
					
					}
				}
				
				if (rdbtnJudas.isSelected()){
					if (judia.isSelected() && nuezMoscada.isSelected() && laurel.isSelected()
							&& colorante.isSelected() && chorizo.isSelected() && chorizo.isSelected()
							&& cebolla.isSelected()){
						comprobante.setText("Correcto");
						
					}
					else {
						comprobante.setText("Incorrecto");
					
					}
				}
			}
		});
		
	}
	
	
}
