package Methods;

public class practice {
	
	int Salary = 200;
	static int EmpID = 100;

	
	public static String Employee() {
		
		System.out.println("This is Employee Method ");
		return "Dev";
	}
	
	public static void main (String[] args) {
		
		practice obj = new practice();
		System.out.println("Im call Employee");
		System.out.println("Employee salary is :"+obj.Salary);
		System.out.println("Employee Id is :"+practice.EmpID);
//		obj.Emplyoee("Dev");
		String role = Employee();
		System.out.println("Role is :" + role);
	
	}
}
