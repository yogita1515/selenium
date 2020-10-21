package hello;

public class Array {
	
	
	
	public static void main(String[] args) {

			Array obj=new Array();
			obj.test();
			int c1=obj.xyz();
			System.out.println(c1);
			int dv1=obj.div(30, 10);
			System.out.println(dv1);
			String s1=obj.pqr();
			System.out.println(s1);
	}
	
	public void test() {
		System.out.println("test method, no ip but op");
		
	}
	
	public int xyz() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	public int div(int x,int y) {
		int z=x/y;
		return z;
	}
	
	public String pqr() {
		String s= "hello";
		return s;
	}
	
	

}
