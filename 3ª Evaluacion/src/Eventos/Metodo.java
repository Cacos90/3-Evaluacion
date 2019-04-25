package Eventos;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Metodo extends JFrame implements ActionListener {

	JButton Copiar;
	JLabel etiqueta1, etiqueta2;
	JTextField caja1, caja2;
	
	public void actionPerformed(ActionEvent e) {
		caja2.setText(caja1.getText());
	}
	public  Metodo(){
		setVisible(true);
		setSize(600, 300);
		setLayout(null);
		
		setTitle("Copiado de Texto");
		
		etiqueta1 = new JLabel();
		etiqueta1.setText("Texto a Copiar");
		etiqueta1.setBounds(100, 10, 100, 30);
		getContentPane().add(etiqueta1);

		caja1 = new JTextField();
		caja1.setBounds(100, 50, 150, 30);
		getContentPane().add(caja1);
	
		etiqueta2 = new JLabel();
		etiqueta2.setText("Texto Copiado");
		etiqueta2.setBounds(360, 10, 100, 30);
		getContentPane().add(etiqueta2);
		
		caja2 = new JTextField();
		caja2.setBounds(360, 50, 150, 30);
		getContentPane().add(caja2);
		
		Copiar = new JButton();
		Copiar.setText("Copiar");
		Copiar.setBounds(250, 150, 100, 30);
		getContentPane().add(Copiar);
		Copiar.addActionListener(this);
			
			
	}
}
