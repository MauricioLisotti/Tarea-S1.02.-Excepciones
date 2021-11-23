package n2ejercicio1;

/*
 * Cree una clase con dos métodos, 'f()' y 'g()'. En 'g()', 
 * genere una excepción de un nuevo tipo. En 'f()' invoque 
 * a 'g()', capture su excepción y, en la cláusula catch, 
 * genere una excepción diferente (de un segundo tipo, también 
 * nueve). Compruebe el código en 'main()'.
 */

public class App {
	public static void main(String[]args) {
		
		MyException myException = new MyException("Exception type");
		myException.f();
		
	}
	
	
}
