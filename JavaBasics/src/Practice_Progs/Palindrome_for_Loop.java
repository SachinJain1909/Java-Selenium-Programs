package Practice_Progs;

public class Palindrome_for_Loop {

	
	static void Palindrome(int num) {
		int sum =0, remainder, constant;
		constant = num;
		while(num>0) {
			remainder = num%10;  //121/10 12/10 /1 
			num=num/10; //0
			sum= (sum*10)+remainder; //121
			
		}
		if(sum==constant) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	}
	public static void main(String[] args) {
		Palindrome_for_Loop.Palindrome(212);
	
	}

}
