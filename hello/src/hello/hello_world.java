package hello;

import java.util.Scanner;

 class hello_world {
	
	public static void main(String args[])
	{	
		int a,b,res;
		String sym;
		char c='y';
		
		do {
		
		System.out.println("Please enter 1st value");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Please enter 2nd value");
		b=sc.nextInt();
		System.out.println("Please enter Symbol");
		sym=sc.next();
		
		switch (sym) {
		case "+": res=a+b;	
		System.out.println("Addition is "+res);
		break;
		case "-" : res=a-b;
		System.out.println("Substraction is "+res);
		break;
		case "*" : res=a*b;
		System.out.println("Multiplication is "+res);
		break;
		case "/" : res=a/b;
		System.out.println("Division is "+res);
		break;

		default:
			System.out.println("Please enter valid symbol");
			continue;
		}
		System.out.println("Do you want to continue? Y/N");
		c=sc.next().charAt(0);
		}
		while(c=='y' || c== 'Y');
		
		if(c!='y' || c!='Y')
		{
			System.out.println("Thanks");
		}
		
				 
	}
}

 

 