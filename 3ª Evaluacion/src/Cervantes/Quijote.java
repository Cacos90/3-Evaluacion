package Cervantes;

public class Quijote {

	public static void main(String[] args) {
		int contador=0;
		String nombrefichero= "C:\\\\Users\\\\jorge\\\\Documents\\\\Programacion\\\\3 evaluación\\\\src\\\\Cervantes\\\\Quijote.txt";
		String nombrefichero2="C:\\\\Users\\\\jorge\\\\Documents\\\\Programacion\\\\3 evaluación\\\\src\\\\Cervantes\\\\Quijote_lineas.txt";
		Operaciones_fichero.escritura(nombrefichero);
		Operaciones_fichero.escrituraBuffer(nombrefichero2, nombrefichero);
		Operaciones_fichero.lecturaBuffer(nombrefichero2);
		
	}
}
