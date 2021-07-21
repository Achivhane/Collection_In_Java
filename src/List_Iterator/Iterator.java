package List_Iterator;

import java.util.ArrayList;
import java.util.HashSet;

public class Iterator {

	public static void main(String[] args) {
		// creating array list 
		ArrayList<String> al = new ArrayList();
		//adding the element in the ArrayList
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("C");
		
		System.out.println("Added Element in the ArrayList : "+al);
		
		// creating the  Iterator 
	
		java.util.Iterator<String> i = al.iterator();
	
		while(i.hasNext())
		{
			System.out.println("list iterator method for forward "+i.next());
		}
		
	}

}
