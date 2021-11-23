package n3ejercicio2;

/*
 * Ejercicio 2. Cree una clase denominada 'FailingConstructor' con 
 * un constructor que falle a mitad del proceso de construcción y 
 * genere una excepción. En 'main()', escriba el código que permita 
 * protegerse apropiadamente frente a ese fallo.
 */


public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("Tipo de excepción: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepción, el programa se ha ejecutado hasta el final.");
		}
		
	}
	
}
