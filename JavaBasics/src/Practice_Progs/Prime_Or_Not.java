package Practice_Progs;

public class Prime_Or_Not {

	static void Prime(int num) {
		int i, count =0;
		
		for(i=1;i<=num;i++) {
		
			if(num%i==0) {
			count++;
			}
		}
		
		if(count==2) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
		

	public static void main(String[] args) {
		Prime_Or_Not.Prime(12);
	}
}
