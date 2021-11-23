package n3ejercicio3;

public class FailingConstructor {
	
	int ejemplo[]= {1,2};
	
	int getNumero(int ej1) {
		return ejemplo[ej1];
	}
	public FailingConstructor() {
		getNumero(3);
	}

}
