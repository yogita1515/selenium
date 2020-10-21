package hello;

public class LocalAndGlobalVariables {
	
	int i=10;

	public static void main(String[] args) {
		
		int j=90;
		int k=9;
		
		System.out.println(j);
		
		LocalAndGlobalVariables obj=new LocalAndGlobalVariables();
		System.out.println(obj.i);
		obj.sum();
		
	}
	
	public void sum() {
		int l=20;
		int i=89;
		System.out.println(l);
		System.out.println(i);
		
	}

}
