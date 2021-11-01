package Constructors;

class ConsstructosHere {

	int i=10;
	ConsstructosHere(){
		System.out.println("Running Class B constructor..");
		i=23;
	}
}

public class Constructor_1 {
	
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");
		ConsstructosHere b1=new ConsstructosHere();
		System.out.println("Class B global varibale i = "+b1.i);
		System.out.println("======================================");
		ConsstructosHere b2=new ConsstructosHere();
		System.out.println("Class B global varibale i = "+b2.i);
		System.out.println("Main() of Class Cons5 is ends here...");
	}
}


