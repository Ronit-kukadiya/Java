//2. Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method
//GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate the Candidate class.
import java.util.*;
public class Q2Candidate
{
    public static void main(String [] args)
    {
        Candidate c1=new Candidate();
        c1.GetCandidateDetails();
        c1.DisplayCandidateDetails();
      
        Candidate c2=new Candidate();
        c2.GetCandidateDetails(); 
        c2.DisplayCandidateDetails();

    }
}

class Candidate
{
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    int Candidate_Weight;
    int Candidate_Height;

    void GetCandidateDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID: ");
        Candidate_ID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        Candidate_Name=sc.nextLine();
        System.out.println("Enter Age: ");
        Candidate_Age=sc.nextInt();
        System.out.println("Enter Weight: ");
        Candidate_Weight=sc.nextInt();
        System.out.println("Enter Height: ");
        Candidate_Height=sc.nextInt();
    }

    void DisplayCandidateDetails()
    {
        System.out.println("Candidate Details: ");
        System.out.println("Candidate ID: "+Candidate_ID+"   Candidate Name: "+Candidate_Name+"   Candidate Age: "+Candidate_Age+"   Candidate Weight: "+Candidate_Weight+"   Candidate Height: "+Candidate_Height);

    }
}