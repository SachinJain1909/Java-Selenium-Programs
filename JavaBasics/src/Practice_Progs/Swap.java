package Practice_Progs;

public class Swap {

	
	void Swapping(int a, int b) {
		System.out.println("Before Swap value of a is "+a+" & b is " + b);
		int temp = a;
		 a = b;
		 b = temp;			
		 System.out.println("After Swap value of a is "+a+" & b is " + b);		 
	}
	public static void main(String[] args) {
		Swap obj = new Swap();
		obj.Swapping(10, 20);
		

	}

}
