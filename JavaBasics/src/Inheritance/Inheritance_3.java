package Inheritance;

class fourwheeler {		//parent class
	//default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}

class car extends fourwheeler {		//child class of four-wheeler and parent of Maruti
	//default constructor with default super()
	public void type() {
		System.out.println("I'm a car");
	}
}

class maruti extends car {		//child class of car class
	//default constructor with default super()
	public void company() {
		System.out.println("I'm maruti");
	}
}
public class Inheritance_3 {
	public static void main(String[] args) {
		maruti fr = new maruti(); // object of child class
		fr.wheels();
		fr.type();
		fr.company();
	}
}