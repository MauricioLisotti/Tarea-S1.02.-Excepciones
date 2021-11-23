package n3ejercicio4;

/*
 * Ejercicio 4. Añada un método 'dispose()' a la clase FailingConstructor 
 * y escriba el código necesario para utilizar adecuadamente esta clase.
 */

public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
			failing1.dispose(3);
		} catch (Exception e) {
			System.out.println("1-Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("1-Tipo de excepción: " + e.getClass());
		}
	
		finally {
			System.out.println("Se ha generado una excepción, el programa se ha ejecutado hasta el final.");
		}
	}

}
