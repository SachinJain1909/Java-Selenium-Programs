package Interface;

interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
}
class Interface_5 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		Interface_5 obj = new Interface_5();
		obj.print();
		obj.show();
		Printable2 obj2 = new Interface_5();
		obj2.print();
	}
}