package Method_Overloading;

public class Method_Overloading_4 {
	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		Method_Overloading_4.main(12);
		Method_Overloading_4.main('c');
		Method_Overloading_4.main(1236);
	}
}
