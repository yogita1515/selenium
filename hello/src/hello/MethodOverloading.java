package hello;

public class MethodOverloading {  //when the method name is same with different types and total no. of parameters 
									//within the same class is called method overloading

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.2f);
		obj.sum(10, 20);
		obj.main();
		

	}
	
	public static void main() {
		System.out.println("This is main method"); 
		
	}
		
	
	public void sum() {
		System.out.println("Hello sum");		
	}
	public void sum(int i) {
		System.out.println(i);
		
	}
	public void sum(float j) {
		System.out.println(j);
	
	}
	public void sum(int k, int l) {
		System.out.println(k+l);
	
	}
	
	

}
