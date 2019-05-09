package BBDD;

import java.sql.*;

public class Consultas {

	public static void main(String[] args) {
		try {
			// Asociamos el driver de MySQL
			Class.forName("com.mysql.jdbc.Driver");

			// Creamos un objeto de tipo Connection para poder crear la conexión
			// con el servidor
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/programacion", "root", "");

			// Creamos un objeto Statement que recogerá esa conexión y nos
			// permitirá ejecutar las sentencias SQL
			Statement objetoStatement = conexion.createStatement();

			// Ejecutamos nuestra sentencia SQL

			// Opción 1: Si es una consulta, necesitaremos un objeto de tipo
			// ResultSet donde se almacenará el resultado de la consulta
			String sentencia = "SELECT * FROM colegio";
			ResultSet resultado = objetoStatement.executeQuery(sentencia);

			// Recorremos nuestro ResultSet para recuperar todo lo devuelto por
			// nuestra sentencia

			while (resultado.next()) {
				System.out.println(resultado.getString("DNI") + " "
						+ resultado.getString("Nombre") + " " + resultado.getString("Apellido") + " " +
						+ resultado.getInt("Curso") + " " + resultado.getString("Observaciones"));
			}

			// Opción 2: Si es una modificación, borrado o insertado, utilizamos
			// otra manera de ejecutar la sentencia, porque no devuelve nada
			// y por tanto no necesitaríamos un ResultSet
			String sentenciaInsert = "INSERT INTO colegio (DNI, Nombre, Apellido, Curso, Observaciones) VALUES ('54789465M', 'Manolo', 'Martin', 2,'Segundo Curso')";
			String sentenciaInsert2 = "INSERT INTO colegio (DNI, Nombre, Apellido, Curso, Observaciones) VALUES ('54769875A', 'Fernando', 'Cantero', 2,'Segundo Curso')";
			String sentenciaUpdate = "UPDATE colegio SET NOMBRE='Lara' WHERE DNI='57894156O'";
			String sentenciaDelete = "DELETE FROM colegio WHERE Nombre = 'Bernardo'";

			// Para ejecutar el Insert
			objetoStatement.executeUpdate(sentenciaInsert);
			System.out.println("Registro insertado");

			objetoStatement.executeUpdate(sentenciaInsert2);
			System.out.println("Registro dos insertado");

			// Para ejecutar el Update
			objetoStatement.executeUpdate(sentenciaUpdate);
			System.out.println("Registro modificado");

			// Para ejecutar el Delete
			objetoStatement.executeUpdate(sentenciaDelete);
			System.out.println("Registro borrado");

			// Cerramos las conexiones de la BBDD

			if (resultado != null) { // liberar los ResultSet
				resultado.close();
			}

			if (objetoStatement != null) { // liberar los Statement
				objetoStatement.close();
			}
			if (conexion != null) { // liberar la conexión a la BD
				conexion.close();
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Problema en el registro del driver");
		} catch (SQLException sqle) {
			System.out.println("Problema en la base de Datos");
		} catch (Exception e) {
			System.out.println("Problema en las operaciones");
		}
	}

}
