package rk.java_core.collection;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("name", "Ranjit");
		map.put("city", "Gurgaon");
		map.put("mobile", "994522554");
		
		for(Map.Entry<String, String> mset: map.entrySet()) {
			System.out.println(mset.getKey() +"-"+ mset.getValue());
		}
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		for(String s: map.keySet()) {
			System.out.println(map.get(s));
		}
		System.out.println(map.keySet());

	}

}
