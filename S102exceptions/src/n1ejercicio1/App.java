package n1ejercicio1;

/*
Ejercicio 1. Cree una clase con un main() que genere un 
objeto de la clase Exception dentro de un bloque try.
Proporcione al constructor de Exception un argumento String. 
Capture la excepción dentro de una cláusula catch
e imprima el argumento String. Añada una cláusula finally e 
imprima un mensaje para demostrar que pasó por allí.
 */
public class App {
	
	public static void main(String[]args) {
		try {
			throw new Exception ("Prueba excepción.");
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("Tipo de excepción: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepción, el programa se ha ejecutado hasta el final.");
		}
		
		
	}
	
	
}
