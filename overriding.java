package demo;

class Parent{
	void show() {
		System.out.println("MANS");
	}
	void show1() {
		System.out.println("ANIMALS ");
	}
}
class Child extends Parent{
	
	void show() {
		System.out.println("GOOD GUYS");
	}
	void show1() {
		System.out.println("DANGEROUS ANIMALS");
	}
}
public class overriding {

	public static void main(String args[]) {
		Child cobj = new Child();
		cobj.show1();
		Parent pobj= new Parent();
		pobj.show1();
	}
}
