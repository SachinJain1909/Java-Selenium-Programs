package Interface;

interface Animal0 {	//Interface
	int age=20;		//by default public static final
	public void animalSound(); //interface method (does not have a body)
	public void sleep(); //interface method (does not have a body)
}

class Pig7 implements Animal0 {		//Pig "implements" the Animal interface
	public void animalSound() {
		System.out.println("The pig says: wee wee");	//The body of animalSound() is provided here
	}
	
	public void sleep() {
		System.out.println("Zzz");	// The body of sleep() is provided here
	}
}
class Interface_6 {
	public static void main(String[] args) {
		Pig7 myPig = new Pig7(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		System.out.println(Animal0.age);
		//Animal0.age=200; 
	}
}