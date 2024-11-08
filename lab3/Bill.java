import java.util.*;

public class Bill{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
        System.out.println("enter calss:");
        int  n = sc.nextInt();

        if(n<=100)
                System.out.println("Rs : " + (n*200));
        else if(n<=150)
                System.out.println("Rs : " + ((100*200) + (n-100)*0.60 ));

        else if(n<=200){
                System.out.println("Rs : " + ((100*200) + (50*0.50) - (n-150)));
        }
         else{
                System.out.println("Rs : " + ((100*200) + (50*0.50) - (n-200)));
        }

       
}
}