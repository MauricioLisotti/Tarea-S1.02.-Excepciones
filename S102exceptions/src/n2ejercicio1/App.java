package n2ejercicio1;

/*
 * Cree una clase con dos m�todos, 'f()' y 'g()'. En 'g()', 
 * genere una excepci�n de un nuevo tipo. En 'f()' invoque 
 * a 'g()', capture su excepci�n y, en la cl�usula catch, 
 * genere una excepci�n diferente (de un segundo tipo, tambi�n 
 * nueve). Compruebe el c�digo en 'main()'.
 */

public class App {
	public static void main(String[]args) {
		
		MyException myException = new MyException("Exception type");
		myException.f();
		
	}
	
	
}
