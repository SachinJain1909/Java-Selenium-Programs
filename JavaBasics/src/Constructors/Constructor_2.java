package Constructors;

public class Constructor_2 {

		int age;
		double salary;
		
		Constructor_2(){  //explicit default constructors---> no para and empty body
		}
	
		public static void main(String[] args) {
			Constructor_2 c1=new Constructor_2();
			System.out.println(c1.age);//0
			System.out.println(c1.salary);//0.0

		}
	}
