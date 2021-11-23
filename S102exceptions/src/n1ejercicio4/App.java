package n1ejercicio4;

/*
 * Ejercicio 4. Cree su propia clase de Exception utilizando 
 * la palabra clave 'extends'. Escriba un constructor para esta 
 * clase que tome un argumento String y lo almacene dentro del 
 * objeto como una referencia de tipo String. Escriba un método 
 * que muestre la cadena de caracteres almacenada. Cree una 
 * cláusula try-catch para probar la nueva excepción.
 */

public class App {

public static void main(String[]args) throws MiException {
		
		try {
			throw new MiException ("Viejo mensaje de excepcion.");
		} catch(MiException e) {
			
			System.out.println("Mensaje de excepcion: " + e.getCadena());
			System.out.println("Excepcion: " + e.getMessage());
			System.out.println("Tipo de excepcion: " + e.getClass());
			
		}        
	}

	
}











