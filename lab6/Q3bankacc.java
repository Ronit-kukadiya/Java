//3. Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. //Also create a method GetAccountDetails()
//and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class.
import java.util.*;
public class Q3bankacc{

    public static void main(String [] args){

        Bank_Account c1=new Bank_Account();
        c1.GetaccountDetails();
        c1.DisplayaccountDetails();
      
        Bank_Account c2=new Bank_Account();
        c2.GetaccountDetails(); 
        c2.DisplayaccountDetails();

    }
}

class Bank_Account
{
    int account_no;
    String user_name;
    int account_balance;
    Sstring Account_Type;
    int Candidate_Height;

    void GetaccountDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account_no: ");
        account_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter user_name: ");
        user_name=sc.nextLine();
        System.out.println("Enter account_balance: ");
        account_balance=sc.nextInt();
        System.out.println("Enter account_type: ");
        account_type=sc.nextInt();
        System.out.println("Enter Height: ");
        Candidate_Height=sc.nextInt();
    }

    void DisplayaccountDetails()
    {
        System.out.println("Candidate Details: ");
        System.out.println("Candidate ID: "+account_no+"   Candidate Name: "+user_name+"   Candidate Age: "+account_balance+"   Candidate Weight: "+account_type+"   Candidate Height: "+Candidate_Height);

    }
}