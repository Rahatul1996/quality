package walmart;

public class returnmethod1 {

	public static void main(String[] args) {
		returnmethod1 h = new returnmethod1 ();
		h.you(200000,53453543 );
		returnmethod1.cat();  

	}

	public int you(int a, int b) {
		
		
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public static String cat() {
		
				String myfirstname = "Mohammad";
				String mylastname = " Jahan";
				String myfullname = myfirstname+mylastname;
				System.out.println(myfullname);
				return myfullname;
	}
	
