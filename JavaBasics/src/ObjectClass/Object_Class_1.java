package ObjectClass;

class Demo{
	void display() {
		System.out.println("I am display()..");
	}
	
}
public class Object_Class_1 extends Demo{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Object_Class_1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		Object_Class_1 s = new Object_Class_1();
		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		Demo d1=new Demo();
		System.out.println(d1);//d1.toString();
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		Demo d2=new Object_Class_1();
		System.out.println(d2);
	}

}
