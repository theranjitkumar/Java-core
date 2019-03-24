package rk.java_core.collection;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
			
			ArrayList<String> al = new ArrayList<String>();
			al.add("ranjit");
			al.add("rajesh");
			al.add("Umesh");
			al.add("Rakesh");
			al.remove("Rakesh");
			Collections.sort(al);
			Iterator itr = al.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

	

}
