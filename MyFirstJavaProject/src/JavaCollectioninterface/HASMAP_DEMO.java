package JavaCollectioninterface;

import java.util.HashMap;

public class HASMAP_DEMO {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj = new HashMap<String, Integer>(); 
		
		obj.put("Student1, RollNumber",1);
		obj.put("Student1, RollNumber",2);
		obj.put("Student1, RollNumber",3);
		System.out.println(obj);
		for(int i = 0; i <obj.size(); i ++) {
			
			System.out.println(obj.get("Student1 RollNumber"));
			
			
			
		}

		
		
		
	}

}
