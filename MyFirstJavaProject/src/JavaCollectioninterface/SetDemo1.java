package JavaCollectioninterface;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		HashSet obj = new HashSet (); 
		
		obj.add ("Sugar");
		obj.add (100);
		obj.add ("rice");
		obj.add ("Sugar");
		obj.add ("Sugar");
		obj.add (100);
		obj.add (100);
		System.out.println(obj);
		for(int i= 0; i <obj.size(); i ++) {
			
			System.out.println(obj); 
		}
		





	}

}
