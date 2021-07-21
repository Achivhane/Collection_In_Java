package arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		//create the arraylist 
		ArrayList al = new ArrayList();
		
		//add the element in arraylist
		
		al.add(10);
		al.add(10.5);
		al.add("divya");
		al.add("asmita");
		al.add(null);
		System.out.println("Add method element"+al);

		//checking the size of arrayList by using size method
		System.out.println("size of array list : "+al.size());
		
		//add the element at the specific index
		al.add(2, "AsmitaDivya");
		System.out.println("element added at the particular index : "+al);
		
		//checking the size of arrayList by using size method
		System.out.println("size of array list : "+al.size());
				
		// removing the element by index
		al.remove(2);
		System.out.println("removing the element by index : "+al);
		
		al.remove("divya");
		System.out.println("removing the element by index : "+al);
		
	}

}
