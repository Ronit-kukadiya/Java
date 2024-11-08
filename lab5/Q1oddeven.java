//1. WAP to count number of even or odd number from an array of n numbers.
import java.util.Scanner;
public class Q1oddeven{
   public static void main(String []args){
    int oc=0,ec=0,i=0; 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array Size: " );
    int n=sc.nextInt();
    int a[] =  new int[n];
    for(i=0;i<a.length;i++){
    	System.out.print("enter a number:");  
        a[i] = sc.nextInt();
    }   
    for(i=0;i<a.length;i++){
      if(a[i]%2==0){
      	ec=ec+1;
                   }
      else{
      	oc=oc+1;
          }
    }
    	System.out.print("even count is:"+ec);  
    	System.out.println("odd count is:"+oc);      
  }
}