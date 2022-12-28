package demo;

public class overloding {

	public static int add(int a,int b) {
		return a+b;
		
		
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		System.out.println(add (20,30));
		System.out.println(add(10,20,30));
		

	}

}
