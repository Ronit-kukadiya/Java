import java.util.*;

public class Revers{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
        System.out.println("enter num:");
        int  n = sc.nextInt();

        int ld =0;
         for(int i=1;n!=0;i++){
            ld = n%10;
            System.out.print(ld);
            n /= 10;
         }
          
    }
}