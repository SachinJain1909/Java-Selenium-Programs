package Methods;

public class StaticsAndNon {

	int a = 10;
	static int b = 20;
	 
	public static void main(String[] args) {
		int c = 30;
		StaticsAndNon ref = new StaticsAndNon();
		
		System.out.println("Static Global Variable is A :"+ ref.a);
		System.out.println("Non Static Global Variable is "+ StaticsAndNon.b);
		System.out.println("Local Variable is C :" + c);
	}
	
}
