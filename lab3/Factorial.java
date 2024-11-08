import java.util.*;

public class Factorial{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
        System.out.println("enter num:");
        int  n = sc.nextInt();

        int f =1;
         for(int i=1;i<=n;i++){
            f *=i;
         }
         System.out.print("fact is : " + f);
    }
}