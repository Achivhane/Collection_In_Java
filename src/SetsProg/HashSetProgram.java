package SetsProg;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Z");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("C");
		
		System.out.println("Added Element in the hs : "+hs);

	}

}
