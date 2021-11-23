package n1ejercicio3;

//Ejercicio 3. Escriba código para generar y capturar una excepción ArrayIndexOutOfBoundsException.

public class App {
	
	public static void main(String[] args) {
	    try {
	      int[] baseDeDatos = {1, 2, 3};
	      System.out.println(baseDeDatos[4]);
	    } catch (Exception e) {
	    	System.out.println("Se ha producido la siguiente excepción: " + e.getMessage());
			System.out.println("Tipo de excepción: " + e.getClass());
	    }
	  }
	

}
