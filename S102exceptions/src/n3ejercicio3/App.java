package n3ejercicio3;

/*
 * Ejercicio 3. A�ada una clase con un m�todo 'dispose()' en el 
 * ejercicio anterior. Modifique 'FailingConstructor' para que el 
 * constructor cree uno de estos objetos eliminables como un objeto 
 * miembro, despu�s de lo cual el constructor puede generar una 
 * excepci�n y crear un segundo objeto miembro eliminable. Escriba 
 * el c�digo necesario para protegerse adecuadamente contra los fallos 
 * y verifique en 'main()' que est�n cubiertas todas las posibles 
 * situaciones de fallo.
 */

public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("Tipo de excepci�n: " + e.getClass());
		}
	
		Dispose dispose1= new Dispose();
		
		try {
			dispose1.dispose(4); 
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("Tipo de excepci�n: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepci�n, el programa se ha ejecutado hasta el final.");
		}
	}

}
