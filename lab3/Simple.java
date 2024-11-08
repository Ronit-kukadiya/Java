import java.util.*;
import static java.lang.System.out;

public class Simple{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		print("enter a:");
		int a = sc.nextInt();

		print("enter b:");
		int b = sc.nextInt();

		print("enter Symbol Mul : 1 , Div: 2 , Add:3 , Sub: 4 ");
		int n = sc.nextInt();

	    switch(n){
	    	case 1 : println(a*b);
	    	         break;
	    	case 2 : println(a/b);
	    	         break;
	    	case 3 : println(a+b);
	    	         break;
	    	case 4 : println(a-b);
	    	         break;
	    	default : println("not opareter");
	    	          break;
	    }
	}
}