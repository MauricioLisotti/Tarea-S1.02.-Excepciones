package n3ejercicio3;

/*
 * Ejercicio 3. Añada una clase con un método 'dispose()' en el 
 * ejercicio anterior. Modifique 'FailingConstructor' para que el 
 * constructor cree uno de estos objetos eliminables como un objeto 
 * miembro, después de lo cual el constructor puede generar una 
 * excepción y crear un segundo objeto miembro eliminable. Escriba 
 * el código necesario para protegerse adecuadamente contra los fallos 
 * y verifique en 'main()' que están cubiertas todas las posibles 
 * situaciones de fallo.
 */

public class App {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor failing1 = new FailingConstructor();
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("Tipo de excepción: " + e.getClass());
		}
	
		Dispose dispose1= new Dispose();
		
		try {
			dispose1.dispose(4); 
		} catch (Exception e) {
			System.out.println("Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("Tipo de excepción: " + e.getClass());
		}
		finally {
			System.out.println("Se ha generado una excepción, el programa se ha ejecutado hasta el final.");
		}
	}

}
