package in.collections;

import java.util.ArrayList;

class Employee{
	
}


public class Demo {
	public static void main(String[] args) {
		String[] s=new String[4];
		s[0]="xyz";
		s[1]="ABC";
		s[2]="10";
		s[3]="iugyuh";
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println(s.length);
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("xyz");
		a.add(true);
		a.add('c');
		a.add(90.56);
		a.add(9876543456l);
		a.add(new Employee());
		
		System.out.println(a.size());
		
		
		// Generic
		 
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add("xvc");
		
		
		
		
		
	}
}
