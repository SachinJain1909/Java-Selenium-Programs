package Practice_Progs;

public class FOR_LOOP {

	void Loop() {
		int i;
		for(i=1; i<=5; i++) {
			System.out.println(i+". Hello Wolrd");	//Printing 1 to 5 and Hello world 5 times
			System.out.println(i);		//Only for 1 to 5 printing
		}
	}
	public static void main(String[] args) {
		FOR_LOOP obj = new FOR_LOOP();
		obj.Loop();
	}
}
