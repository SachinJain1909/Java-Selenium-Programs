package Inheritance;

class Grandfather {		//super class/ parent class / base class
	Grandfather() {
		System.out.println("I am Class Grandfather constrctuor...");
	}

	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}

class Father extends Grandfather {		//subclass / child class / derived class
	Father(double d) {
		super();// if we don't write this then java compiler will write by default super()
		System.out.println("I am Class Father constrctuor...");
	}

	void myCar() {
		System.out.println("I am car of Father");
	}
}

class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor...");
	}

	void myBike() {
		System.out.println("I am bike of child");
	}
}

public class Inheritance_6 {
	public static void main(String[] args) {
		System.out.println("*******************************************");
		Child1 c1 = new Child1(21);// home, car & bike
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Father f1 = new Child1(10);// home, car but bike will not be visible/accessible to father
		f1.myHome();
		f1.myCar();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1 = new Child1(20);// home but car & bike will not be visible/accessible to Grandfather
		g1.myHome();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g2 = new Father(12.36);// home but car , bike will not be visible/accessible to father
		g2.myHome();
	}

}
