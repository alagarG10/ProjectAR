package org.header;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SampleHeader {
	public static void main(String[] args) {
		
		List<LinkedHashMap<String,String>> l = new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String,String> m1 = new LinkedHashMap<>();
		m1.put("Name", "Alagar");
		m1.put("Email", "alagarrajaganesan@outlook.com");
		m1.put("City", "Tiruppur");
		
		LinkedHashMap<String,String> m2 = new LinkedHashMap<>();
		m2.put("Name", "Brightson");
		m2.put("Email", "brightsonraja@gmail.com");
		m2.put("City", "Bangalore");
		
		LinkedHashMap<String,String> m3 = new LinkedHashMap<>();
		m3.put("Name", "Vinoth");
		m3.put("Email", "vinotyson@gmail.com");
		m3.put("City", "Coimbatore");
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		
		LinkedHashMap<String, String> linkedHashMap = l.get(2);
		String string = m3.get("Email");
		String string2 = m3.get("Name");
		String string3 = m3.get("City");
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
	
	}
}