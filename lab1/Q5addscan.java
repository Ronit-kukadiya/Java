//5. WAP to print addition of 2 numbers (with Scanner)
import java.util.*; 
public class Q5addscan{
	public static void main(String []args) {
		int t,u,v;
		Scanner s=new Scanner(System.in);
        t=s.nextInt();
        v=s.nextInt();
        u=t+v;
        System.out.println("sum is:"+u); 
	}
}