package Exception;

// in this example we are performing try - catch - finally
public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("this will handle the exception occur in the try block");
		}finally {
			System.out.println("this block will execute regardless of exception occur or not ih=n the try and catch block");
		}

	}

}
