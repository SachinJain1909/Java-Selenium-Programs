package Practice_Progs;

public class Multiplication {

	
	static float Multiply(float a, float b) {
	float z = a*b;
//	System.out.println("Multiplication is : "+ z);
	return z;
	}
	
	public static void main(String[] args) {
		System.out.println("Multiplication is : "+ Multiplication.Multiply(10f, 3f));
//		Multiply(3f, 50f);
	}

}
