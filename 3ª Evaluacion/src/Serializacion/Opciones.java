package Serializacion;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Opciones {

	public static void Opcion1(){
		try {
			//objeto que vamos a serializar
			Alumnos alumno= new Alumnos();
			//Volcar el objeto en fichero
			ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("objeto.obj"));
			// escribimos el objeto en fichero
			salida.writeObject(alumno);
			salida.close();
			//volcamos la informacion para poder leerlo
			ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("objeto_copia"));
			//leemos fichero
			Alumnos alumno1=(Alumnos)entrada.readObject(); // Creamos otro objeto para no sobreescribir el anterior
			 System.out.println("objeto " + alumno1.getnombre() + alumno1.getapellidos());
			 entrada.close();
		
		} catch (Exception e) {
			// TODO: handle exception
	}
	}
	public static void Opcion2(){
		ArrayList<Alumnos> clase = new ArrayList<Alumnos>();	
		clase.add(new Alumnos("Carlos", "Costell San Roman"));
		clase.add(new Alumnos("Pedro", "Arana del Blanco"));
		clase.add(new Alumnos("Javier", "Garcia Prieto"));
		clase.add(new Alumnos("Lara", "Fernandez"));
		
		try {
			
			
			//Volcar el objeto en fichero
			ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("array.obj"));
			// escribimos el objeto en fichero
			salida.writeObject(clase);
			salida.close();
			//volcamos la informacion para poder leerlo
			ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("array.obj"));
			//leemos fichero
			ArrayList<Alumnos> clase2=(ArrayList<Alumnos>)entrada.readObject(); // Creamos otro objeto para no sobreescribir el anterior
			 System.out.println(clase2.get(0).getnombre());
			 entrada.close();
		
		} catch (Exception e) {
		}
	}
	public static void Opcion3(){
		
		File nombrefichero=new File("C:\\Users\\jorge\\Documents\\Programacion\\3 evaluación\\objeto.obj");
		 File PruebaDirectorio=new File("C:\\Users\\jorge\\Documents\\Programacion\\3 evaluación");
		 System.out.println("El Objeto existe? "+ nombrefichero.exists());
		 System.out.println("¿El objeto es un Fichero? " + nombrefichero.isDirectory());
		 System.out.println("¿El objeto es un Directorio? " + nombrefichero.isFile());
		 System.out.println("¿Cual es la ruta absoluta? " + nombrefichero.getAbsolutePath());
		 PruebaDirectorio.mkdir();
	}
}