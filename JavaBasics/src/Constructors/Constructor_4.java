package Constructors;

class Constructor_4 {
	
	int roll;
	double salary;
	
	Constructor_4(int r,double s){
		roll=r;
		salary=s;
	}

	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Constructor_4 c1 = new Constructor_4(101,250045.45);
		Constructor_4 c2 = new Constructor_4(201,550045.45);
		c1.display();
		c2.display();
	}
}
