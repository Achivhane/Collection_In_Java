package LinkedList;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {
		//create the linked list 
		LinkedList ll = new LinkedList();
		// add elements to the linked list
	
		ll.add('a');
		ll.add('b');
		ll.add('c');
		ll.add('d');
		ll.add('e');
		ll.add('f');
		ll.add('g');
		ll.add('h');
		System.out.println("add the element in the linked list : "+ll);
		
		 // remove elements from the linked list
		ll.remove(2);
//		ll.remove("asmita");
		System.out.println("Linked list after removing the element : "+ll);
		
		
		 // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("RemoveFirst and RemoveLast element from linked list : "+ll);
	      
	   // get and set a value
	      Object o = ll.get(2);
	      System.out.println("get the element of index 2 : "+o);
	      ll.set(3, "Asmita");
	      System.out.println("set the element at 3 index : "+ll);
	      

	}

}
