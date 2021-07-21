package arrayList;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		//adding the element in the ArrayList 
		
		al.add(new Emp(11, "ASMITA"));
		al.add(new Stud(22, "Pinki")); 
		al.add(10);
		al.add("asmita");
		al.add("Asmitaa");
		al.add(null);
		
		//for type casting and type checking
		Object o = al.get(0);
	
			if (o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.eid+" "+e.eName);
			}
			if(o instanceof Stud)
			{
				Stud s=(Stud)o;
				System.out.println(s.sId+" "+s.sName);
			}
		

	}

}
