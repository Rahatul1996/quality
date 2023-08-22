package JavaCollectioninterface;

import java.util.ArrayList;

public class GenaricArraylist {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Java");
		obj.add("selenium");
		obj.add("Maven");
		obj.add("TestNG");
		obj.add("POI");
		obj.add("QTP");
		String y = obj.get(0);
		System.out.println(y);
		
	}

}
