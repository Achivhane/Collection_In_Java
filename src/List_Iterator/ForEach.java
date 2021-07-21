package List_Iterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForEach {

	public static void main(String[] args) {
		// creating array list 
		ArrayList<String> al = new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("Added Element in the ArrayList : "+al);
		
		//for each iterator
		for(Object o : al)
		{
			System.out.println("ForEach Iterator for ArrayList : "+o);
		}
		
		//Creating the Linked List 
		
		LinkedList<Integer> ll = new LinkedList();
		
		//adding the element in the Linked List 
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		System.out.println("Added element in the LinkedList : "+ll);
		
		//For Each iterator 
		for(Object o : ll)
		{
			System.out.println("For Each Iterator for Linked List : "+ o);
		}
		

	}

}
