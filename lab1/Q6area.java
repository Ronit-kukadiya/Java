//6. WAP to calculate Area of Circle.
import java.util.*; 
public class Q6area{
	public static void main(String []args) {
		int r;
		double p=3.14;
		double a;
		System.out.println("enter radius of circle");
		Scanner s=new Scanner(System.in);
        r=s.nextInt();
        a=p*r*r;
        System.out.println("area is:"+(double)a); 
	}
}