package inicioSwing;

import java.awt.BorderLayout;

import javax.swing.*;

public class CreandoFrames extends JFrame { //importante 
	//poner la herencia a JFrame o no podremos usar los metodos necesarios
	
	public CreandoFrames(){
		//setSize(500,250); Para darle un tamaño determinado al marco o frame
		//setLocation(500,300); para darle una localizacion determinada al marco
		setBounds(500,250,500,600); // Localización y tamaño en una misma
		setResizable(true); //Puedes redimensionarlo(estandar) false (para no poder ampliarlo o minimizarlo)
		//setExtendedState(MAXIMIZED_HORIZ);
		setTitle("Mi Primer Marco");
		setLayout(new BorderLayout());
		JPanel lamina2 =new JPanel();
		add(lamina2, BorderLayout.NORTH);
		add(new JButton("Sur"), BorderLayout.SOUTH); 
		lamina2.add(new JCheckBox("Final")); 
		lamina2.add(new JCheckBox("Inicio")); 
		
		



	}

}
