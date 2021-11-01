package ObjectClass;

public class Object_Class_2 extends Demo{

	static int last_roll = 100;
	int roll_no;

	// Constructor
	Object_Class_2()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		Object_Class_2 s = new Object_Class_2();
		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		System.out.println(s.hashCode());//
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());	
		System.out.println(d1.hashCode());//		
	}
}
