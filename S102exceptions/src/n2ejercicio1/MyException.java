package n2ejercicio1;
import java.util.InputMismatchException;

public class MyException {

	protected String message;
	
	public MyException(String message) {
		this.message = message;
	}

	public void g() {
		try {			
			throw new InputMismatchException(message);
		} catch(InputMismatchException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public void f() {
		try {
			g();		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception type:"+e.getClass());
		}
	}
}
