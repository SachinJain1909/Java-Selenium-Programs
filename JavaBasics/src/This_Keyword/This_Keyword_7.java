package This_Keyword;

class This_Keyword_7 {
	//Global Variable or non static GV or Instance GV
	int variable = 5;
	public static void main(String args[]) {
		This_Keyword_7 obj = new This_Keyword_7();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);//5
		System.out.println("Value of Local variable :" + variable);//10
	}
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);//5
		System.out.println("Value of Local variable :" + variable);//40
	}
}
