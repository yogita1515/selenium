package hello;

import java.util.Scanner;

 class CalciSwitchCase {
	
	public static void main(String args[])
	{	
		int res,a,b;
		String sym;
		char c='y';
		do {
		
		System.out.println("Please enter 1st value");
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		System.out.println("Please enter 2nd value");
		b=s.nextInt();
		System.out.println("Please enter Symbol (+-*/)");
		sym= s.next();
		
		switch (sym) 
		{
		case "+": res = a+b;
			System.out.println("Addition is" +res);
			break;
		case "-": res = a-b;
		System.out.println("Substraction is" +res);
		break;
		case "*": res = a*b;
		System.out.println("Multiplication is" +res);
		break;
		case "/": res = a/b;
		System.out.println("Division is" +res);
		break;

		default: 
			System.out.println("Invalid input");
			continue;
			
		}
		System.out.println("Do you want to continue? Y/N");	
		c=s.next().charAt(0);
		}while(c=='y' || c== 'Y');
		
		if(c!='y')
		{
			System.out.println("Thanks");
		}
				 
	}
}
