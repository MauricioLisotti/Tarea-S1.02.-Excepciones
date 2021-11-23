package n2ejercicio1bis;
import java.util.InputMismatchException;

public class MyException {

	protected String message;

	public MyException(String message) {
		this.message = message;
	}
	public void g() {
		try {
			message = "Exception types";
			throw new InputMismatchException(message);
		} catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void f() throws RuntimeException{	
		try {
			g();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception type:"+e.getClass());
		}	
	}
}
