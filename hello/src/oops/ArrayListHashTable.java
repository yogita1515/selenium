package oops;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListHashTable {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		
		System.out.println("---Size of arraylist-----");
		
		System.out.println(a.size());
		
		a.add(500);
		a.add(600);
		
		System.out.println(a.size());
		
		//Print all arraylist values
		
		System.out.println("--------Print all values-----");
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		//Print all specific arraylist index value
		System.out.println("-----Print all specific arraylist index value----");
		
		System.out.println(a.get(4));
		
		//Restrict arraylist to specific data type
		System.out.println("---Restrict arraylist to specific data type---");
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		a1.add(1000);
		a1.add(1001);
		a1.add(1002);
		
		
	//	a1.add(10.5); Not allowed
		
		System.out.println(a1.get(1));
		
		ArrayList<Double> a2 = new ArrayList<Double>();
		a2.add(10.5);
		
		System.out.println(a2.get(0));
		
		System.out.println("--------HashTable------");
		
		Hashtable h= new Hashtable();
		h.put("A", 100);
		h.put("B", 200);
		h.put("C", 300);
		h.put("D", 400);
		
		System.out.println(h.get("A"));
		
		System.out.println("---Restrict key value with specific data types----");
		Hashtable<Integer, Integer> h1 =new Hashtable<Integer, Integer>();
		
		h1.put(1, 1001);
		h1.put(2, 1002);
		h1.put(3, 1003);
		//h1.put("A", 1004); Not allowed
		
		System.out.println(h1.get(1));
		
		Hashtable<String, Integer> h2 =new Hashtable<String, Integer>();
		
		h2.put("A", 100);
		
		System.out.println(h2.get("A"));
		

	}

}
