package hello;

public class CallByValueAndCallByReference {
	
	int p=50, q=60;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		int a=10;
		int b=20;
		
		obj.xyz(a, b);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj);
		System.out.println("After swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public void xyz(int x, int y) {
		
		int sum=x+y;
		System.out.println(sum);
		
	}
	
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}

}
