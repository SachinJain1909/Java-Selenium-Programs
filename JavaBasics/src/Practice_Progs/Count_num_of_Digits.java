package Practice_Progs;

public class Count_num_of_Digits {

	
	 static void Count(int num) {
		 int i;
		 for(i=0; num!=0; num=num/10, i++) {
//			 count = count+i;
		 }
		 System.out.println("Count is : "+ i);
	 }
	public static void main(String[] args) {
	 
		Count_num_of_Digits.Count(0);
	}

}
