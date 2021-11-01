package Interface;

interface Printable1 {
	void print();
}

interface Showable1 {
	void print();
}
class Interface_4 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Interface_4 obj = new Interface_4();
		obj.print();
	}
}
