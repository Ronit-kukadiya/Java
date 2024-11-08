//7.Define Time class with hour and minute as data member. Also define addition method to add //two-time objects.
import java.util.*;
class Time{
	int hh;
	int mm;  

    Time(){
      hh=0;
      mm=0;
    }

    Time(int hh, int mm){
   	this.hh=hh;
   	this.mm=mm;
    }

    void addTime(Time t, Time t1){      
   	    this.hh=t1.hh+t.hh;
   	    this.mm=t1.mm+t.mm;
   	    while(mm>60){
   	    	this.mm=this.mm-60;
   	    	this.hh=this.hh+1;
   	    }
    }
}   

public class Q7Time{
	public static void main(String[] a1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter time 1's hour:");
		int h=sc.nextInt();
		System.out.print("enter time 1's minute:");
		int m=sc.nextInt();
		Time t1=new Time(h,m);
		System.out.print("enter time 2's hour:");
		h=sc.nextInt();
		System.out.print("enter time 2's minute:");
		m=sc.nextInt();
		Time t2=new Time(h,m);
		Time t3=new Time();
		t3.addTime(t1,t2);
		System.out.print(t3.hh+":"+t3.mm);
	}
}