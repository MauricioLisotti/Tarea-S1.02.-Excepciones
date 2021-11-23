package n1ejercicio2;

/*
 * Ejercicio 2. Defina una referencia a un objeto e inicial�cela con null.
 * Trate de invocar un m�todo a trav�s de esta referencia. Ahora rodee el 
 * c�digo con una cl�usula try-catch para capturar la excepci�n.
 */

public class App {

	public static void main(String[]args) {
		
		 ExceptionNull exceptionNull1 = null;
		      try {
		          exceptionNull1.getString();
		        } catch (Exception e){
		           System.out.println("Se produjo una excepci�n: " + e.getMessage());
		           System.out.println("Tipo de Exception: "+ e.getClass());
		        }
	}
	
	
}
