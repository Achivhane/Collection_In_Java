package arrayList;
//created the class emp and stud in which i have declared two variable and 
//created test1 i have created the arrayList and 
//add the values of emp class variable and stud class variable and add some more element in the ArrayList
//After executing the program it will give the hash code for emp and stud class element and all other element will print as it is


import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add(new Emp(11, "ASMITA"));
		al.add(new Stud(22, "Pinki")); 
		al.add(10);
		al.add("asmita");
		al.add(null);
		
		System.out.println(al);
		
		//to print the emp and stud class variable value  we can use for each loop
		
		//type checking
		for(Object o : al)
		{
			if(o instanceof Emp)
			{
				//emp e = (type casting ) o
				Emp e =(Emp)o;
				System.out.println(e.eid+" "+e.eName);
			}
			if(o instanceof Stud)
			{
				 Stud s=(Stud)o;
				 System.out.println(s.sId+" "+s.sName);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			if(o instanceof String)
			{
				System.out.println(o);
			}
			if(o==null)
			{
				System.out.println(o);
			}
		}

	}

}
