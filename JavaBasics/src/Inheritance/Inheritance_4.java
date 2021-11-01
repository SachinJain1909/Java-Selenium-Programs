package Inheritance;

class vehicle { 		//parent class
	public void wheels() {
		System.out.println("I have wheels");
	}
}

class Bike extends vehicle {		//first child class of vehicle class
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}

class Car1 extends vehicle {		//second child class of vehicle class
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}

class Scooter extends vehicle {		//third child class of vehicle class
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Inheritance_4 {
	public static void main(String[] args) {
		Scooter sc = new Scooter(); // object of scooter class
		sc.wheels();
		sc.countwls();
		
		Car1 c = new Car1(); // object of car class
		c.wheels();
		c.countwlc();
		
		Bike b = new Bike();// object of bike class
		b.wheels();
		b.countwl();
	}
}
