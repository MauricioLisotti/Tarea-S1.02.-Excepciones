package n1ejercicio1;

/*
Ejercicio 1. Cree una clase con un main() que genere un 
objeto de la clase Exception dentro de un bloque try.
Proporcione al constructor de Exception un argumento String. 
Capture la excepci�n dentro de una cl�usula catch
e imprima el argumento String. A�ada una cl�usula finally e 
imprima un mensaje para demostrar que pas� por all�.
 */
public class App {
	
	public static void main(String[]args) {
		try {
			throw new Exception ("Prueba excepci�n.");
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("Tipo de excepci�n: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepci�n, el programa se ha ejecutado hasta el final.");
		}
		
		
	}
	
	
}
