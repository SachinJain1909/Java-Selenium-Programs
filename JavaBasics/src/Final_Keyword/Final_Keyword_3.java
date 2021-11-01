package Final_Keyword;

public class Final_Keyword_3 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}

	public static void main(String args[]) {
		Final_Keyword_3 obj = new Final_Keyword_3();
		obj.run();
		System.out.println(obj.salary);
	}
}
