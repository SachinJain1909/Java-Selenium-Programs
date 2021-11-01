package Constructor_Overloading;

public class Constructor_Overloading_1 {
	
	Constructor_Overloading_1() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	Constructor_Overloading_1(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters and vlaue is :" + a);
	}
	Constructor_Overloading_1(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters and values is : "+ b);
	}
	Constructor_Overloading_1(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters and values is : "+ a +" "+b+" "+c);
	}	
	Constructor_Overloading_1(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters and values is : "+ a +" "+ b +" "+c);
	}
	public static void main(String args[]) {
		Constructor_Overloading_1 pc5 = new Constructor_Overloading_1();
		Constructor_Overloading_1 pc1 = new Constructor_Overloading_1(12);
		Constructor_Overloading_1 pc2 = new Constructor_Overloading_1(13.34);
		Constructor_Overloading_1 pc3 = new Constructor_Overloading_1(10,13.34,45);
		Constructor_Overloading_1 pc4 = new Constructor_Overloading_1(13.34,23,87);
	}
}
/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */

