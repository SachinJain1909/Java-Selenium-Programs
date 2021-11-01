package Abstract_Class;


abstract class Animal {	//Abstract class
	
	public abstract void animalSound();	// Abstract method (does not have a body)
	public void sleep() {	// Regular method
		System.out.println("Zzz");
	}
}

class Pig extends Animal {	// Subclass (inherit from Animal)
	public void animalSound() {
		System.out.println("The pig says: wee wee");	// The body of animalSound() is provided here
	}
}

class Dog8 extends Animal {	//Subclass (inherit from Animal)
	public void animalSound() {
		System.out.println("The dog says: bow bow");			// The body of animalSound() is provided here
	}
}
class Abstract_1 {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		Dog8 d1=new Dog8();
		d1.animalSound();
		d1.sleep();
	}
}