package Practice_Progs;

public class Leap_Year {

	void Leap(int year) {
		if (year%400==0) {
			System.out.println("Year is Leap");
		}
		else {
			System.out.println("Year is not leap");
		}
	}
	public static void main(String[] args) {
		Leap_Year obj = new Leap_Year();
		obj.Leap(2020);
	}

}
