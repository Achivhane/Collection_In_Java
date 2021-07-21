package List_Iterator;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		// creating array list 
		ArrayList<String> al = new ArrayList();
		
		//adding the element in the ArrayList
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("Added Element in the ArrayList : "+al);
		
		// creating the list Iterator 
		java.util.ListIterator<String> li = al.listIterator();
		
		// forward direction
		
		while(li.hasNext())
		{
			System.out.println("list iterator method for forward "+li.next());
		}
		 
		//for backward direction
		while(li.hasPrevious())
		{
			System.out.println("list iterator method for backward :"+li.previous());
		}
	}

}
