package n3ejercicio3;

public class Dispose {
	
	public int[] dispose(int numero) throws Exception {
		
		if (numero > 2) {
			throw new Exception("La longitud de array no puede ser mayor a 2.");
		} else {
			int[] newArray = new int[numero];
			return newArray;
		}
	}
}
