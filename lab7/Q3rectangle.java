import java.util.*;
class Rectangle{
	int height;
	int width;
	static int count;

	Rectangle(){
		int height;
		int width;
		count++;

	}
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
		count++;
	}
		Rectangle(Rectangle r){
			height=r.height;
			width=r.width;
			count++;
		}
		public void area(){
			System.out.println("count is = "+count);
			System.out.println("Area is ="+(height*width));
			count++;
		}
}
public class Q3rectangle{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.height=20;
		r1.width=10;
		r1.area();
		Rectangle r2=new Rectangle(30,10);
		r2.area();
		Rectangle r3=new Rectangle(r2);
		r3.area();
	}
}