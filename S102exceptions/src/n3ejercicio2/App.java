package n3ejercicio2;

/*
 * Ejercicio 2. Cree una clase denominada 'FailingConstructor' con 
 * un constructor que falle a mitad del proceso de construcci�n y 
 * genere una excepci�n. En 'main()', escriba el c�digo que permita 
 * protegerse apropiadamente frente a ese fallo.
 */


public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("Tipo de excepci�n: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepci�n, el programa se ha ejecutado hasta el final.");
		}
		
	}
	
}
