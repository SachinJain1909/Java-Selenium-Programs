package Interface;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Interface_3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		Interface_3 obj = new Interface_3();
		obj.print();
		obj.show();
	}
}