 package Interface;

interface Bank {
	float rateOfInterest();//by default ----> public abstract
}
class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}
class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}
class Interface_2 {
	public static void main(String[] args) {
		SBI s1=new SBI();
		System.out.println("SBI ROI: " + s1.rateOfInterest());
		PNB p1=new PNB();
		System.out.println("PNB ROI: " + p1.rateOfInterest());
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}

}
