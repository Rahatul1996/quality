package walmart;

public class parameterclass {

	public static void main(String[] args) {
		parameterclass tom = new parameterclass();
		tom.test1 (43535, 234432);
		tom.test1 (39, 59);
		tom.test1 (699, 8978998);
		tom.test2("mohammad", " jahan");

	}

	private void test1(int a, int b) {//non- static method
		int c = a+b; 
		System.out.println(c);
		
	}
	public void test2 (string a, string b) (//Non- Static Method
		string d = a+b;
		System.out.println(d);
			)

}
