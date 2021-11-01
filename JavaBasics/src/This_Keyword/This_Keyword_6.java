package This_Keyword;

class This_Keyword_6 {

	int variable = 5;

	public static void main(String args[]) {
		This_Keyword_6 obj = new This_Keyword_6();
		obj.method(20);
		obj.method();	
		System.out.println(obj.variable);//20 5
	}
	void method(int variable) {
		System.out.println("Value of variable :" + variable);//20
		variable = 10;
		System.out.println("Value of variable :" + variable);//10
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);//40
	}
}

