package Practice_Progs;

public class Largest_num {

	void Largest(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("A is greater");

		}
		else if(b>a && b>c){
			System.out.println("B is Greater");
		}
		else {
			System.out.println("C is greater"); 
		}
		
	}
	public static void main(String[] args) {
		Largest_num obj = new Largest_num();
		obj.Largest(100, 20000, 520);
	}
}
