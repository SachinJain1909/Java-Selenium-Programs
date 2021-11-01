package This_Keyword;

class This_Keyword_5 {
	void m() {
		System.out.println(this);// prints same reference ID
	}
	
	public static void main(String args[]) {
		This_Keyword_5 obj = new This_Keyword_5();
		
		System.out.println(obj);// prints the reference ID
		obj.m();
	}
}

