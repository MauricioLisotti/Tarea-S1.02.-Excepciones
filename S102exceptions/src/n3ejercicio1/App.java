package n3ejercicio1;

/*
 * Ejercicio 1. Demuestre que un constructor de una clase 
 * derivada no puede capturar excepciones generadas por su 
 * constructor de la clase base.
 */


public class App {
	
	public App() throws Exception{
		throw new Exception();
	}
	

}
