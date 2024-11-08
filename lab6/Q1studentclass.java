//1.Create a class “Student” that would contain enrolment No, name, and gender and marks as instance variables and count as static variable which stores the count of the
//objects; constructors and display(). Implement constructors to initialize instance variables.
import java.util.*;
public class Q1studentclass
{
    public static void main(String [] args)
    {
        Student s1=new Student(1,"darshan",'M',69);
        s1.Display();
        Student s2=new Student(2,"dolly",'F',96);
        s2.Display();
    }
    
}

class Student
{
    int anno;
    String name;
    char gender;
    int mark;
    static int count;

    Student(int a,String n,char g,int m)
    {
        anno=a;
        name=n;
        gender=g;
        mark=m;
        count++;    
    }

    public void Display()
    {
        System.out.println(anno+" "+name+" "+gender+" "+mark+" "+count);  
    }
    
}