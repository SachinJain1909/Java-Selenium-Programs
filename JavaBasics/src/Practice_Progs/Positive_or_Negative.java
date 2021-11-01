package Practice_Progs;

public class Positive_or_Negative {
	
	void PosOrNeg(int num) {
		if(num>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

	public static void main(String[] args) {
		Positive_or_Negative obj = new Positive_or_Negative();
		obj.PosOrNeg(-5580);

	}

}
