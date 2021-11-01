package Patterns;

public class Pyramid_Pattern {

	
	static void Pyramid(int num) {
		int i;
		for(i =1; i<=num;i++) {
			
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=2; k<=i; k++) {
				System.out.print(k);
			}
			for(int l=1;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pyramid_Pattern.Pyramid(5);
	}

}
