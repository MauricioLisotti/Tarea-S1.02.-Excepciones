package n2ejercicio1bis;

/*
 * Repita el ejercicio anterior, pero dentro de la cláusula catch, 
 * envuelva la excepción 'g()' dentro de una RuntimeException.
 */

public class App {
	public static void main(String[]args) {
		
		MyException myException = new MyException("Exception type");
		myException.f();
		
	}
	
	
}
