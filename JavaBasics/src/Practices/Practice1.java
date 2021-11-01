package Practices;

public class Practice1 {
	
	static void Patterns(int num) {
		for (int i=1; i<=num; i++) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =1; i<=num;i++) {
			for(int j=num-1; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Practice1.Patterns(5);
	}

}
class A {
	
	public static void main(String[] args) {
		Practice1.Patterns(2);
	}
}
