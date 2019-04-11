package Ficheros;

import java.io.*;

public class ejercicioLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrefichero= "C:\\Users\\jorge\\Documents\\Programacion\\3 evaluación\\src\\Ficheros\\fichero1.txt";
		FileReader fichero=null;
		FileWriter escrito=null;
		String lineas=" Esto es una prueba de escritura ";
		System.out.println("");
		int Avocal=0;
		int Evocal=0;
		int Ivocal=0;
		int Ovocal=0;
		int Uvocal=0; 
		
		try {

			escrito=new FileWriter(nombrefichero,true);
			for(int i=0; i<lineas.length();i++){
				escrito.write(lineas.charAt(i));
			}
			escrito.write("\r\n");
			escrito.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
			 fichero = new FileReader(nombrefichero);
			int caracteres =fichero.read();
			while(caracteres!=-1){
				System.out.print((char)caracteres);
				
					if (caracteres=='a')
						Avocal ++;
					if (caracteres=='e')
						Evocal ++;
					if (caracteres=='i')
						Ivocal ++;
					if (caracteres=='o')
						Ovocal ++;
					if (caracteres=='u')
						Uvocal ++;
						
				caracteres=fichero.read();
			}
			fichero.close();
		} catch (Exception e) {
			System.out.println("Error en Fichero");
		}
		
		System.out.println("En nuestro fichero hay las siguientes vocales:");
		System.out.println("a: " + Avocal);
		System.out.println("e: " + Evocal);
		System.out.println("i: " + Ivocal);
		System.out.println("o: " + Ovocal);
		System.out.println("u: " + Uvocal);

		



		

	}
}
