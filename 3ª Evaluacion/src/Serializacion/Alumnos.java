/*- Realiza una clase alumno que tenga dos miembros de tipo String "nombre", y 
	 * "Apellido", los cuales podr�n ser accedidos por sus subclases o clases del mismo
	 *  paquete. Realiza tambi�n una clase principal que genere un objeto de �sta clase.

		- Dentro de la clase alumno, crea los getters y setters correspondientes.
		 Crea tambi�n un constructor copia. 

- 		En el programa principal, crea un duplicado del objeto alumno mediante el
 		constructor copia, y muestra por pantalla los valores de los miembros de ambos objetos, para comprobar que se ha copiado correctamente.

-		 En la clase principal, asigna el objeto que acabamos de crear, al objeto 
		que creamos al principio. Modifica el miembro "nombre" del primer objeto, 
		y saca por pantalla el valor del miembro "nombre" del segundo objeto, y 
		tambi�n del primero. Devuelve por pantalla si son iguales o distintos.
	 * 
	 */
	
package Serializacion;

import java.io.Serializable;

/**
 * @author Carlos Costell San Roman
 * @version 1.0.
 * @see <https://eva.educamos.com/sasr/eva/mod/page/view.php?id=16478>
 */

public class Alumnos implements Serializable {
	
	protected String nombre="Carlos";  //Atributos o miembros
	protected String apellidos="Costell San Roman";
	private static int numalumnos=0;
	private static int notamedia=0;
	/**
	 * Constructor estandar que cada vez que se cree un objeto 
	 * incrementar� en uno el  contador de alumnos.
	 */
	public Alumnos(){ 	       //Constructores
		numalumnos++;
	}
	/**
	 * 
	 * @param nom entrara un String por pantalla que recoger� el nombre del alumno
	 * @param apell entrara un String por pantalla que recoger� los apellidos del alumno
	 * Y cada vez que creemos un objeto incrementar� en 1 el numero de alumnos
	 */
	public Alumnos(String nom, String apell){
		nombre=nom;
		apellidos=apell;
		numalumnos ++;
	}
	/**
	 * 
	 * @param alumno constructor donde recoger� un objeto llamado alumnos donde tendr� como
	 * par�metros el nombre y el apellido
	 */
	public Alumnos(Alumnos alumno){
		this.nombre=alumno.getnombre();
		this.apellidos=alumno.getapellidos();
		numalumnos ++;
		
	}
	/**
	 * 
	 * @return nombre del alumno.
	 */
	public String getnombre(){       //Metodos
		return nombre;
	}
	/**
	 * 
	 * @param recoge el nombre del  alumno.
	 */
	public void setnombre(String alfa){
		nombre=alfa;
	
	}
	/**
	 * 
	 * @return los apellidos del alumno
	 */
	public String getapellidos(){
		return apellidos;
		
	}
	/**
	 * 
	 * @param beta recoge los apellidos del alumno
	 */
	public void  setapellidos(String beta){
		apellidos=beta;
	}
	/**
	 * 
	 * @return un contador que  cuenta el n� de alumnos en total
	 */
	public int getnumalumnos(){
		return numalumnos;
	}
	/**
	 * incrementar es un m�todo que al llamarlo incrementa en 1 la nota media
	 */
	public void incrementar(){
		notamedia++;
	}
	/**
	 * Llama el m�todo incrementar
	 * @return el total de la nota media
	 */
	public int resultado(){
		
		this.incrementar();
		incrementar();
		return notamedia;
		}
	}

