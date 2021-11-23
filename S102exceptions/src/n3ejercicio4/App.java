package n3ejercicio4;

/*
 * Ejercicio 4. A�ada un m�todo 'dispose()' a la clase FailingConstructor 
 * y escriba el c�digo necesario para utilizar adecuadamente esta clase.
 */

public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
			failing1.dispose(3);
		} catch (Exception e) {
			System.out.println("1-Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("1-Tipo de excepci�n: " + e.getClass());
		}
	
		finally {
			System.out.println("Se ha generado una excepci�n, el programa se ha ejecutado hasta el final.");
		}
	}

}
