package arrayList;

import java.util.ArrayList;

//Array is type safe but collection is not type safe 
//ArrayList contains different type of data so it generates 2 problem 1.type checking 2. type casting
// type checking and type casting here
public class Test3 {

	public static void main(String[] args) {
  //probide the type safe to the collection by using Generics
		
		ArrayList<Emp> al =new ArrayList<Emp>();
		al.add(new Emp(11, "Asmitaa"));
		al.add(new Emp(1122, "Asmi"));
		for(Emp e:al)
		{
			System.out.println(e.eid+"  "+e.eName);
		}
		
		//getting the particular index element 
		Emp e = al.get(1);
		System.out.println("getting the particularelement according to index 1 :"+e.eid+" "+e.eName);
//		Emp e1 = al.get(2);
//		System.out.println("getting the particularelement according to index  "+e1.eid+" "+e1.eName);
		//output : it will throw the exception
		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
		Emp e1 = al.get(0);
		System.out.println("getting the particularelement according to index 0 : "+e1.eid+" "+e1.eName);
	}

}
