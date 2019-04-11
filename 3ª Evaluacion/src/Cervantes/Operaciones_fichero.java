package Cervantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Operaciones_fichero {

	public static void lecturaCaracter(String nombrefichero) {
		FileReader fichero = null;

		try {

			fichero = new FileReader(nombrefichero);
			int caracteres = fichero.read();
			while (caracteres != -1) {
				System.out.print((char) caracteres);
				caracteres = fichero.read();
			}
			fichero.close();
		} catch (Exception e) {
			System.out.println("Error en Fichero");
		}
	}

	public static void escritura(String nombrefichero) {
		FileWriter escrito = null;
		String lineas = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que viv�a un hidalgo de los de lanza en astillero, adarga antigua, roc�n flaco y galgo corredor. Una olla de algo m�s vaca que carnero, salpic�n las m�s noches, duelos y quebrantos los s�bados, lentejas los viernes, alg�n palomino de a�adidura los domingos, consum�an las tres partes de su hacienda. El resto della conclu�an sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, los d�as de entre semana se honraba con su vellori de lo m�s fino. Ten�a en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que as� ensillaba el roc�n como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta a�os, era de complexi�n recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir que ten�a el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia en los autores que deste caso escriben), aunque por conjeturas veros�miles se deja entender que se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narraci�n d�l no se salga un punto de la verdad.";

		try {
			escrito = new FileWriter(nombrefichero);
			for (int i = 0; i < lineas.length(); i++) {
				escrito.write(lineas.charAt(i));
			}
			escrito.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void escrituraBuffer(String nombrefichero2,String nombrefichero) {
		FileWriter escrito = null;
		FileReader fichero = null;
		BufferedWriter br= null;
		
		try {
			
			escrito = new FileWriter(nombrefichero2);
			br=new BufferedWriter(escrito);
			fichero = new FileReader(nombrefichero);
			int caracteres = 0;
			char caract = '0';
			while (caracteres != -1) {
				caracteres = fichero.read();
				
				caract = (char) caracteres;
				if (caract == '.' || caract == ',' || caract == ';') {
					br.newLine();
					
				}else if (caracteres!=-1){	
					br.write(caract);
				}

			}
			br.flush();
			fichero.close();
			escrito.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	public static void lecturaBuffer(String nombrefichero2){
		try {
			FileReader lectura =new FileReader(nombrefichero2);
			BufferedReader texto = new BufferedReader(lectura);
			nombrefichero2 = texto.readLine();
			lectura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nombrefichero2);
	}
}