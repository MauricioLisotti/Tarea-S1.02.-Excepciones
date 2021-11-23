package n3ejercicio4;

public class FailingConstructor{
	
	int ejemplo[]= {1,2};
	
	int getNumero(int ej1) {
		return ejemplo[ej1];
	}
	public FailingConstructor() {
	}
	
	public int[] dispose(int numero) throws Exception {
		
		if (numero > 2) {
			throw new Exception("La longitud de array tiene que ser 2.");
		} else {
			int[] newArray = new int[numero];
			return newArray;
		}
	}

}
