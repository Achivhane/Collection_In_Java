package Exception;
// In the example we handle the exception using try - catch block & try - finally block
//try block -- in try block, exception may or may not be occur
//Catch block--in catch block, we write the code to handle the exception which occur in try block

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is catch block which is used to handle the exception occur in the try block");
		}

		//if there is no exception in the try block it will execute the try block
		try {
			System.out.println("Here try block will execute as there is no exception : "+10/2);
			
		} catch (Exception e) {
			System.out.println("This is catch block which is used to handle the exception occur in the try block");
		}
		
		//try and finally block 
		//try block contain exception 
		try {
			System.out.println("In try block, there is some exception "+10/0);
			
		} finally {
			System.out.println("finally block will execute regardless of exception occur or not");
		}
	
		
		//try and finally block
		//try block do not contain any exception
		try {
			System.out.println("there is not exception occur in the try block : "+10/2);
		} finally {
			System.out.println("finally block will execute regardless of exception occur or not");
		}
	}

}
