package Practice_Progs;

public class Quotient_Remainder {

	static void Division(int a, int b) {
		int Quotient = a/b;
		int Remainder = a%b;
		System.out.println("Quotient is : "+ Quotient);
		System.out.println("Remainder is : "+ Remainder);
	
	}
	public static void main(String[] args) {
		Quotient_Remainder.Division(11, 3);
	}
}
