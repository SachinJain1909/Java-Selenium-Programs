package This_Keyword;


class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
		//m();
	}
}


class This_Keyword_4 {

	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
		//methodOne();
	}
	public static void main(String args[]) {
		This_Keyword_4 obj = new This_Keyword_4();
		obj.methodTwo();
		A a = new A();
		a.n();
	}
}
