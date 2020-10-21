package oops;

public class TestCars {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); //static polymorphism or compiletime polymorphism
		b.stop();
		b.theftsafety();
		b.refuel();
		b.engine();
		
		System.out.println("**********");
		
		
		//Top casting
		Cars c= new BMW();// Dynamic polymorphism or runtime polymorphism
		c.start();
		c.stop();
		c.refuel();
	}

}
