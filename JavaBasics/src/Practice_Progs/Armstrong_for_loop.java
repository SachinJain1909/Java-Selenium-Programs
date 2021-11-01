package Practice_Progs;


public class Armstrong_for_loop {

	static void Armstrog(int num) {
		int constant, remainder, sum=0;
		constant = num;
		while(num>0) {
			remainder = num%10; 
			sum=(remainder*remainder*remainder)+sum; 
			num = num/10;
		}
		if(sum==constant) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}

	}
	public static void main(String[] args) {
		Armstrong_for_loop.Armstrog(134);
	}

}

