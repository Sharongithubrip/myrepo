package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj1=new ArrayList();
		ArrayList<String> obj2=new ArrayList();
		HashSet<String> obj3=new HashSet();
		obj3.add("apple");
		obj3.add("apple");
		System.out.println(obj3);
		
		obj2.add("sharon");
		
		
		obj1.add("a");
		obj1.add("banana");
		obj1.add("12");
		obj1.add("12");
		//obj1.add(null);
		obj1.add("Naveen");
		
		obj1.addAll(obj2);
		System.out.println("Merging"+obj1);
		
		System.out.println("for each loop");
		for (String s:obj1) {
			
			System.out.println(s);
			
		}
		
		obj1.set(2, "sharon"); //replace and set element
		
		Collections.sort(obj1); //sorting
		System.out.println("after sorting: "+obj1);
		
		for(int i=0;i<obj1.size();i++) {
			
			System.out.println(obj1.get(i));
		}
		System.out.println(obj1);
		System.out.println(obj1.get(1)); //get via index
	}
	
	
	
	
	

}
