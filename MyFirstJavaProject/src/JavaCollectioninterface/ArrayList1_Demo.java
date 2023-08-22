package JavaCollectioninterface;

import java.util.ArrayList;

public class ArrayList1_Demo {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("JAhan");
		obj.add(243324);
		obj.add(12.76);
		System.out.println(obj);
		System.out.println(obj.get(0));
		for(int i = 0; i<obj.size();i++) {
			
			System.out.println(obj.get(i));
			
		}
	
	
		

	}

}
