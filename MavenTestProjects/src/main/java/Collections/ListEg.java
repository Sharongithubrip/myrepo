package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEg {
	
	static List obj=new ArrayList();
	public static void add() {
		
		
		obj.add("apple");
		obj.add("orange");
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove(0); //remove index
		
		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		
		obj1.add('a');
		obj1.add("banana");
		obj1.add(12);
		obj1.add(12);
		System.out.println(obj1);
		
		System.out.println(obj1.contains(12));
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		
		ArrayList <String> obj3= new ArrayList <String>(); //generic collections
		obj3.add("Sharon");
		obj3.add("banana");
		
		System.out.println(obj3);
		System.out.println(obj3.size());
		
		
	}

	public static void main(String[] args) {
		
		ListEg.add();
		

	}

}
