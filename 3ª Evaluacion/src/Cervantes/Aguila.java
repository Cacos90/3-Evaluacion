package Cervantes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Aguila {
	public static void main(String[] args) {
		int contador=0;
		int datos_entrada[]=new int[13714];
		try{
			FileInputStream imagenLectura=new FileInputStream("C:\\\\Users\\\\jorge\\\\Documents\\\\Programacion\\\\3 evaluación\\\\src\\\\Cervantes\\\\Aguila.jpg");
			boolean ar=false;
			int entrada=0;
			while(!ar){
				 entrada= imagenLectura.read();
				if (entrada!=-1){
					datos_entrada[contador]=entrada;
					contador++;
				}
				else {
					ar=true;
				}
			}
			imagenLectura.close();
		}catch(IOException e){
			System.out.println("Error al acceder a la Imagen");
		}
		Aguila.escrituraDeImagen(datos_entrada);
	}
	 static void escrituraDeImagen(int datos_entrada[]){
		try {
			FileOutputStream imagenEscrita=new FileOutputStream("C:/Users/jorge/Documents/Programacion/3 evaluación/src/Cervantes/Aguila_copia.jpg");
			for(int i=0;i<datos_entrada.length;i++){
			imagenEscrita.write(datos_entrada[i]);
			}
			imagenEscrita.close();
		} catch (Exception e) {
			System.out.println("Error al crear el archivo");
		}
		
	}
	 static void escrituraBuffer() throws IOException{
		 String entrada="C:/Users/jorge/Documents/Programacion/3 evaluación/src/Cervantes/Aguila.jpg";
		 String salida="C:/Users/jorge/Documents/Programacion/3 evaluación/src/Cervantes/Aguila_copia.jpg";
		 try {
			FileInputStream streamEntrada=new FileInputStream(entrada);
			FileOutputStream streamSalida=new FileOutputStream(salida);
			BufferedInputStream lectorMejorado=new BufferedInputStream(streamEntrada);
			BufferedOutputStream escritorMejorado=new BufferedOutputStream(streamSalida);
			int byteleido;
			System.out.println("\n\t El archivo esta siendo copiado...");
			while ((byteleido=lectorMejorado.read())!=-1){
				escritorMejorado.write(byteleido);
			}
			lectorMejorado.close();
			escritorMejorado.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("El archivo ha sido copiado con éxito  \n");
	 }

	}
	


