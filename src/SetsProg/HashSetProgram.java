package SetsProg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {
		//creating the HashSet 
		HashSet<String> hs = new HashSet<String>();
		
		//Adding the element in the HashSet
		hs.add("Z");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("C");
		
		System.out.println("Added Element in the hs : "+hs);
		
		//iterators over the HashSet using Iterator
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println("Element : "+i.next());
		}

	}

}
