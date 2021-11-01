package Patterns;

public class Right_triangle {

	
	static void Triangle(int num) {
		
		for(int i=1; i<=num;i++) {
			
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
	public static void main(String[] args) {
		Right_triangle.Triangle(8);
	}

}
