package Practices;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice_4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Sachin");
		al.add("Mohini");
		al.add("12345");
		al.add(12345);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(2, "Mom");
		System.out.println(al);
		
		System.out.println(al.get(3));
		
//		System.out.println("**********");
//		for(int i=0; i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		
		System.out.println("*********");
		
		Iterator i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
