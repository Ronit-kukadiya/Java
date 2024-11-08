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
public class Q1singlelevelinher{
	public static void main(String[] args) {
		B b1 = new B();
	}
}