package n3ejercicio2;

public class FailingConstructor {
	
	int ejemplo[]= {1,2};
	
	int getNumero(int ej1) {
		return ejemplo[ej1];
	}
	public FailingConstructor() {
		getNumero(3);
	}

}
