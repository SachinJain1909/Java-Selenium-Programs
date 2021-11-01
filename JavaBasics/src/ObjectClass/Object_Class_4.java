package ObjectClass;


public class Object_Class_4 extends Object{

	static int last_roll = 100;
	int roll_no;

	Object_Class_4()	// Constructor
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }

	// Driver code
	public static void main(String args[]) {
		Object_Class_4 s = new Object_Class_4();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}

}
