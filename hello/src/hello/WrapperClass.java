package hello;

public class WrapperClass {
	
	int k=10;

	public static void main(String[] args) {
		String s= "100";
		
		//String to integer
		int i = Integer.parseInt(s);
		System.out.println(s+20);
		System.out.println(i+20);
		
		//String to double
		String s1= "10.25";
		double d= Double.parseDouble(s1);
		System.out.println(s1+20);
		System.out.println(d+20);
		
		//String to double
		String s2= "true";
		boolean b= Boolean.parseBoolean(s2);
		System.out.println(s2);
		System.out.println(b);
		
		//Int to string
		int j= 100;
		String s3=String.valueOf(i);
		System.out.println(s3+100);
		System.out.println(j+100);
	}

}
