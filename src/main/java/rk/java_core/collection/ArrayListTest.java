package rk.java_core.collection;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
			
//			ArrayList<String> al = new ArrayList<String>();
			
			LinkedList<String> al = new LinkedList<String>();
			
			al.add("ranjit");
			al.add("rajesh");
			al.add("Umesh");
			al.remove("rajesh");
			al.add("Rakesh");

			al.add("Rakesh");
			Collections.sort(al);
			
			for(String s: al){
				System.out.println(s);
			}
			
//			Collection c = new Collections();
			
			
			
			
			
		}

}
