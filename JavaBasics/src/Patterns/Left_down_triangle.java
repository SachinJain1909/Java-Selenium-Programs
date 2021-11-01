package Patterns;

public class Left_down_triangle {

	static void Triangle(int num) {
		
		for(int i =1; i<=num;i++){
			
			for(int j=num;j>=i;j--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
	Left_down_triangle.Triangle(8);
	}
}
