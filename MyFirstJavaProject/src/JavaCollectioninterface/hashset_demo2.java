package JavaCollectioninterface;

import java.util.HashSet;

public class hashset_demo2 {

	public static void main(String[] args) {
		HashSet<String> hope = new HashSet<String>();
		
		hope.add("JAva"); 
		hope.clear();
		hope.add("Selenium"); 

		hope.add("Cucumber"); 

		hope.add("MAven"); 
		hope.remove ("Cucumber");
		hope.remove ("JAva");
		hope.add ("TestNG");
		
		System.out.println(hope.isEmpty());
		
		for(String a: hope) {  
			
			System.out.println(a);
		}

		
			
	}

}
