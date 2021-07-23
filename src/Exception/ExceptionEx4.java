package Exception;

import java.util.Scanner;

// try block containt multiple exception and only one catch block for every exception 
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubh
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number");
			int num = s.nextInt();
			
			System.out.println("this is asmita !!");
			
			System.out.println(10/num);
			
			//String index out of range
			System.out.println("asmita".charAt(10));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("this is  catch block : "+e);
		}

	}

}
