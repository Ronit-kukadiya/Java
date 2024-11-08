// 4. Declare a class called book having author_name as private data member. Extend book class to have two sub classes called book_publication & paper_publication. Each of
// these classes have private member called title. Write a program to show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of
// given author. Use command line arguments for inputting data.s.
class Book{
	private String aName;

	void setaname(String aName){
		this.aName=aName;
	}
	String getaName(){
		return aName;
	}
	void display(){

	}
}
class B_publi extends Book{
	private String title;
	void settitle(String title){
		this.title=title;
	}
	String gettitle(){
		return title;
	}
	void display(){
		System.out.print("book details"+getaName()+" "+title);
	}
}

class P_publi extends Book{
	private String title;
	void settitle(String title){
		this.title=title;
	}
	String gettitle(){
		return title;
	}
	void display(){
		System.out.print("paper details"+getaName()+" "+title);
	}
}

public class Q4book{
	public static void main(String[] arg){
		Book b1=new Book();
		if(arg[0].equals("book")){
			B_publi b2=new B_publi();
			b2.settitle(arg[1]);
			b1=b2;
		}
		else if(arg[0].equals("paper")){
			P_publi b3=new P_publi();
			b3.settitle(arg[1]);
			b1=b3;
		}
		b1.setaname(arg[2]);
		b1.display();
	}
}