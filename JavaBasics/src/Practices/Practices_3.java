package Practices;

interface One {
	void Add(int a, int b);
}

class Complete implements One{
	 public void Add(int a, int b) {
		 int z = a+b;
		 System.out.println("Class One is Implemented here and addition is "+z);
	 }
 }

class Complete1 implements One{
	public void Add(int a, int b) {
		int z = a*b;
		System.out.println("Addition is :" + z);
	}
}

class Practices_3 {
	public static void main(String[] args) {
	Complete obj = new Complete();
	obj.Add(10,  20);
	Complete1 ref = new Complete1();
	ref.Add(20, 30);
}
}
