package n1ejercicio3;

//Ejercicio 3. Escriba c�digo para generar y capturar una excepci�n ArrayIndexOutOfBoundsException.

public class App {
	
	public static void main(String[] args) {
	    try {
	      int[] baseDeDatos = {1, 2, 3};
	      System.out.println(baseDeDatos[4]);
	    } catch (Exception e) {
	    	System.out.println("Se ha producido la siguiente excepci�n: " + e.getMessage());
			System.out.println("Tipo de excepci�n: " + e.getClass());
	    }
	  }
	

}
