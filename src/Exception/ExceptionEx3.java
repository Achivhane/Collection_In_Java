package Exception;

// in one try block, multiple exception occur
// for each exception there is one catch block

import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number");
			int num = s.nextInt();
			System.out.println("this is asmita !!");
			System.out.println(10/num);
			System.out.println("asmita".charAt(10));
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("this is catch block for arithmetic excception "+ae);
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("this is catch block for String Index Out Of Bounds excception "+e);
		}

		System.out.println("The rest of the application");
	}

}
