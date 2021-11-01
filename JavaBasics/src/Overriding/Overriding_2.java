package Overriding;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		super.move(); // invokes the super class method
		System.out.println("Dogs can walk and run");
	}
}
public class Overriding_2 {

	public static void main(String args[]) {
		Dog2 b = new Dog2(); // Animal reference but Dog object
		b.move(); // runs the method in Dog class
	}
}