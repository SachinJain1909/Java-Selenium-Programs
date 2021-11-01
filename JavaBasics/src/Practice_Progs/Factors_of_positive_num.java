package Practice_Progs;

public class Factors_of_positive_num {

	void Factors(int num) {
		int i;
		System.out.print("Factor of " +num + " is");
		for(i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(" "+i);
			}	
		}
	}
	public static void main(String[] args) {
	Factors_of_positive_num obj = new Factors_of_positive_num();
	obj.Factors(50);
	}

}
