package Interface;

interface i1{
	//variable ---> by default ----> public static final
	//method ---> by default ----> public abstract
	//no constructor
}

interface Drawable { 	//Interface declaration: by first user  
	public abstract void draw();	//by default---->public abstract
}

class Rectangle1 implements Drawable {	// Implementation: by second user
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class Interface_1 {	// Using interface: by third user
	
	public static void main(String args[]) {
		Rectangle1 r1=new Rectangle1();
		r1.draw();	//drawing rectangle
		Circle c1=new Circle();
		c1.draw();	//drawing circle
		Drawable d = new Circle();	// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();	//drawing circle
	}
}
