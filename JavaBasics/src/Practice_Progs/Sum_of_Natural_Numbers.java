package Practice_Progs;

public class Sum_of_Natural_Numbers {

	void Sum(int num) {
		int i, sum=0;
		for(i=1; i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of Natural number is : "+ sum);

	}
	public static void main(String[] args) {
	
		Sum_of_Natural_Numbers obj = new Sum_of_Natural_Numbers();
		obj.Sum(1000);
	}

}
