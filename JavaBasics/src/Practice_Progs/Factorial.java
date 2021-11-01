package Practice_Progs;

public class Factorial {

	
	static void Facto(int num) {
		int i, fact = 1;
		for(i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of" +num +" is : "+fact);
	}
	public static void main(String[] args) {
		Factorial.Facto(3);
	}

} 
