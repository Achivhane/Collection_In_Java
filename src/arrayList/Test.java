package arrayList;

//exporting the ArrayList package
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// creating the ArrayList 
		ArrayList al = new ArrayList();
		// adding the elements in the ArrayList 
		al.add(10);
		al.add("asmita");
		al.add(10); //duplication allowed
		al.add(null); //null insertion is allowed
		al.add(8.5);
		//removing the 3 index value 
		al.remove(2);
		
		
		System.out.println(al);

	}

}
