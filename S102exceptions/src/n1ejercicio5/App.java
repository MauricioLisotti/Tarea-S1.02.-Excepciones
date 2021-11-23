package n1ejercicio5;
import java.util.Scanner;

/*
 * Ejercicio 5. Defina un comportamiento de tipo reanudaci�n 
 * utilizando un bucle 'while' que se repita hasta que se deje
 * de generar una excepci�n.
 */


public class App {
    static Scanner entradaEscaner = new Scanner(System.in);

	public static void main(String[]args) {
		
		boolean verificacion = true;
		
		while(verificacion) {        
			try {                
				int numero = 0;
				System.out.print("Ingrese un n�mero: ");
		        numero=entradaEscaner.nextInt();
				System.out.println("El numero ingresado es: " + numero + ".");
				verificacion = false;
			} catch(Exception e) {
				System.out.println(e.getMessage()); 
				System.out.println("Tipo de Exception:"+e.getClass());
			}            
		}        
	}
}
