package Practices;

interface I1{ 
	void JAVA();
	
}
class Practice2 implements I1 {
	public void JAVA() {
		System.out.println("Interface Method Overriden here");
	}
	
	public static void main(String[] args) {
		Practice2 obj = new Practice2();
		obj.JAVA();
	}
}