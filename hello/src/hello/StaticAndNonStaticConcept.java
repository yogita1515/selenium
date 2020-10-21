package hello;

public class StaticAndNonStaticConcept {
	
	int i=10;
	static int j=20;

	public static void main(String[] args) {
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		//how to call static methods and vars?
		//1- by direct
		//2- Using class name
		
		
		//Non static method can only call by using object
		System.out.println(obj.i);
		obj.xyz();
		
		//call static methods and vars
		
		System.out.println(j);
		pqr();
		StaticAndNonStaticConcept.pqr();
		
		obj.pqr(); //Can we access static method by using object? Yes
		

	}
	
	public void xyz() { //static method
		System.out.println("This is non static method");
		
	}
	
	public static void pqr() { //non static method
		System.out.println("This is static method");
		
	}

}
