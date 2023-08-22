package JavaCollectioninterface;

import java.util.HashSet;


public class hashset_demo3 {

	public static void main(String[] args) {
		HashSet<String> hope = new HashSet<String> ();
		
		hope.add("Java");
		
		
		hope.add("Cucumber");
		
		hope.add("MAven");
		hope.remove("Cucumber");
		hope.clear();
		hope.remove("JAva");
		hope.add("TestNG");
		System.out.println(hope.isEmpty());


		
		System.out.println(hope);
		
		for(String a : hope) {
			
			System.out.println(hope);
		}
		
		
		
	}

}
