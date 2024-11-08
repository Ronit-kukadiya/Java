import java.util.*;

class Shape{
	int radius;
}

class Circle extends Shape{
	Circle(int radius){
		this.radius=radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
}

class Triangle extends Shape{
	int b; 
	Triangle(int radius,int b){
		this.radius=radius;
		this.b=b;
	}
	public double getArea(){
		return 0.5*radius*b;
	}
 }

class Square extends Shape{
	Square(int radius){
		this.radius=radius;
	}
     public double getArea(){
		return radius*radius;
	}
}

public class Q2shape{
	public static void main(String args[]){
		Circle c1=new Circle(10);
		System.out.println(c1.getArea());
		Triangle t1=new Triangle(10,20);
		System.out.println(t1.getArea());
		Square s1=new Square(10);
		System.out.println(s1.getArea());
	}
}
