// 2.Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(),
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased()
// methods. WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
class EventListener{
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
public class Q2interface{
	public static void main(String[] args){
		
	}
}