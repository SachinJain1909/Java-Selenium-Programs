package ObjectClass;

class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
	}
}
public class Object_Class_3 extends Demo123{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Object_Class_3()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
	public int hashCode() {
		return roll_no;
	}
	// Driver code
	public static void main(String args[]) {
		Object_Class_3 s = new Object_Class_3();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());//100
		s.display();//
		
		Demo123 d2=new Demo123();
		System.out.println(d2.hashCode());		
	}

}
