package xyz;

public class Trail {
	void m() {
		System.out.println("Hi");
	}
	
	public String toString() {
		return "Good Morning !!!";
	}
	
	public String toString(int a) {
		return "Good Morning !!!";
	}
	
	public static void main(String[] args) {
		Trail t=new Trail();
		t.m();
		System.out.println( t.toString());
	}
}
