// 1.The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a program that demonstrates how to establish this class hierarchy.Declare
// one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects. Override the toString() method of object to return a
// string with the name of vegetable and its color.
class vegetable{
	String name;
	String color;
}
class potato extends vegetable{
	potato(String name,String color){
		this.name=name ;
		this.color=color;
	}
	public String toString(){
		return name+" "+color;
	}
}																		
class brinjal extends vegetable{
	brinjal(String name,String color){
		this.name=name ;
		this.color=color;
	}
	public String toString(){
		return name+" "+color;
	}
}
class tomato extends vegetable{
	tomato(String name,String color){
		this.name=name ;
		this.color=color;
	}		
	public String toString(){
		return name+" "+color;
	}
}
public class Q1vegetable{
	public static void main(String[] args){
		potato p1=new potato("potato","skin");
		System.out.println(p1);
		brinjal b1=new brinjal("brinjal","purple");
		System.out.println(b1);
		tomato t1=new tomato("tomato","red");
		System.out.println(t1);
	}
}