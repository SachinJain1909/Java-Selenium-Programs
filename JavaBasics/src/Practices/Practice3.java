package Practices;

public class Practice3 {
	public static void main(String[] args) {
		int[] a = new int [5];
		a[0]=10;
		a[1]=12;
		a[2]=15;
		a[3]=16;
		a[4]=155;
	
		System.out.println(a[0]);
		System.out.println("Length of an Array is : " +a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("****************************");
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda","Lamborgini" };
		int ab[]= {10, 20, 30, 40, 50};
		
		System.out.println(ab[1]);
		System.out.println(cars[4]);
		
	}

}
