package Array_demo1;

public class interview_Question {

	public static void main(String[] args) {
	Integer [] anyname= (100, 100, 200, 500, 234342);
	
	Set<Integer> st= new HashSet<Integer>();
	
	for(Integer name1 : anyname) {
		
		if(st.add(name1)==false) {
			
			System.out.println("Duplicate Value is "+ name1);
			
			
		}
	}
	

	}

}
