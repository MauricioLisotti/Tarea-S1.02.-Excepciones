package n1ejercicio4;

public class MiException extends Exception{
	
	
	String cadena;
	
	public MiException(String cadena) {
		this.cadena = cadena;
	}
	
	public String getCadena() {
		cadena= "Nuevo mensaje de excepcion.";
		return cadena;
	}	
}
