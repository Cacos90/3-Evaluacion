package inicioSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.Normalizer.Form;

import javax.swing.*;
public class Formulario extends JFrame{
	JButton aceptar;
	JTextField caja1;
	JLabel etiqueta;
	JTextField caja2;
	
	
	public Formulario(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Image icono =mipantalla.getImage("C:\\Users\\jorge\\Documents\\Programacion\\3 evaluación\\src\\ganador.png");
		setIconImage(icono);
		setVisible(true);
		setSize(550, 250);
		
		setTitle("Registro");
		
		etiqueta=new JLabel();
		etiqueta.setText("Nombre");
		etiqueta.setBounds(100,  19, 100, 30);
		getContentPane().add(etiqueta);
		
		caja1 = new JTextField();
		caja1.setBounds(200, 10, 150, 30);
		getContentPane().add(caja1);
		caja1.setBackground(Color.blue);
	
		
		
		
		aceptar= new JButton();
		aceptar.setText("Aceptar");
		aceptar.setBounds(220, 100, 100, 30);
		getContentPane().add(aceptar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formulario Form = new Formulario();
		  Form.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}

}
