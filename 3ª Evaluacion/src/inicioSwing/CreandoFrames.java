package inicioSwing;

import javax.swing.*;

public class CreandoFrames extends JFrame { //importante 
	//poner la herencia a JFrame o no podremos usar los metodos necesarios

	public CreandoFrames(){
		//setSize(500,250); Para darle un tama�o determinado al marco o frame
		//setLocation(500,300); para darle una localizacion determinada al marco
		setBounds(500,250,500,600); // Localizaci�n y tama�o en una misma
		setResizable(true); //Puedes redimensionarlo(estandar) false (para no poder ampliarlo o minimizarlo)
		//setExtendedState(MAXIMIZED_HORIZ);
		setTitle("Mi Primer Marco");
		
		
	}

}
