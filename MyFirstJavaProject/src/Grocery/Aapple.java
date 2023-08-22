package Grocery;

import inheretence_demo.classA;

public class Aapple extends classA{

	public static void main(String[] args) {

		double a = 10; 
		double b = 29.65; 
		double c = a+b;
		double d = a-b;
		double e = a*b;		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		Aapple joy = new Aapple();
		joy.happy1();
		Aapple.happy3();
	}

}
