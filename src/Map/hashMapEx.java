package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapEx {

	public static void main(String[] args) {
		//creating the HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
			//Adding the element in the HashMap
		
		hm.put(1, "Asmita");
		hm.put(2, "Asmi");
		hm.put(3, "Asmit");
		
		System.out.println("Added Element in the hm : "+hm);
		
		//remove
		hm.remove(3);
		System.out.println("Added Element in the hm : "+hm);
		
		//contain or not
		System.out.println("Element is exist in the hm : "+hm.containsKey(2));
		System.out.println("Element is not exist in the hm : "+hm.containsKey(3));
		//iterator
		
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		 while(i.hasNext())
		 {
			 System.out.println("hashMap : "+i.next());
		 }
		
	}

}
