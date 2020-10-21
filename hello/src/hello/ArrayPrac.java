package hello;

public class ArrayPrac {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {100,200,300};
		System.out.println(b.length);
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
