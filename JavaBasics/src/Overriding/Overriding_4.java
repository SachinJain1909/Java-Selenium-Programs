package Overriding;


class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding_4 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Overriding_4 obj = new Overriding_4();
		obj.myMethod();
	}
}
