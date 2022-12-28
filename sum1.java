package demo;

import java.util.*;

class demo{
	
	
	
	public int sum(int A, int B) {
		
		int sum;
		sum=A+B;
		return sum;
	}
	
	
}
public class sum1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c;
		
		demo d = new demo();
		c=d.sum(a,b);
		
		System.out.println(c);
		
		

		
		
		

	}

}
