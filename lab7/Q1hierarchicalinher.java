//1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.
class A{
	A(){
			System.out.println("from A");		
	}
}
class B extends A{
	B(){
			System.out.println("from B");
	}
}
class C extends A{
	C(){
			System.out.println("from C");
	}
}
public class Q1hierarchicalinher{
	public static void main(String[] args) {
		C c1 = new C();
		B b1 = new B();
	}
}