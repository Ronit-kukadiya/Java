import java.util.*;

public class Between{
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a:");
        int  a = sc.nextInt();

        System.out.println("enter b:");
        int  b = sc.nextInt();

        int max=0,min=0;

        if(a<b){
            max = b;
            min =a;
        }
        else{
            max = a;
            min = b;
        }
        int i;
        
         for(i=min;i<=max;i++){
                if(i%2==0 && i%3!=0){
                    System.out.print(i + " ");
                }   
         }
    }
}