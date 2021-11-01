package Patterns;

public class Right_down_triangle {
	
	static void Triangle(int num) {
		for(int i =1; i<=num;i++){
	
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
	Right_down_triangle.Triangle(5);

	}

}
