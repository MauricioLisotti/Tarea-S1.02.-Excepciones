package n1ejercicio2;

/*
 * Ejercicio 2. Defina una referencia a un objeto e inicialícela con null.
 * Trate de invocar un método a través de esta referencia. Ahora rodee el 
 * código con una cláusula try-catch para capturar la excepción.
 */

public class App {

	public static void main(String[]args) {
		
		 ExceptionNull exceptionNull1 = null;
		      try {
		          exceptionNull1.getString();
		        } catch (Exception e){
		           System.out.println("Se produjo una excepción: " + e.getMessage());
		           System.out.println("Tipo de Exception: "+ e.getClass());
		        }
	}
	
	
}
