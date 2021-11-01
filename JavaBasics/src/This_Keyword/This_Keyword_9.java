package This_Keyword;

public class This_Keyword_9 {
	 int a;
	    int b;     
	    // Parameterized constructor
	    This_Keyword_9(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    } 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    } 
	    public static void main(String[] args)
	    {
	    	This_Keyword_9 object = new This_Keyword_9(10, 20);
	        object.display();
	        System.out.println(object.a+" "+object.b);//10 20
	        This_Keyword_9 object2 = new This_Keyword_9(102, 201);
	        object2.display();
	        System.out.println(object2.a+" "+object2.b);//102  201
	    }
}
