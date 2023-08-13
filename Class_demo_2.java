/*Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method
GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate the Candidate class.*/
import java.util.Scanner;
public class Class_demo_2{
    public static void main(String []args)
    {
        Candidate s1=new Candidate();
        s1.GetCandidateDetails();
        s1.DisplayCandidateDetails();
    }
}
class Candidate{
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    void GetCandidateDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Candidate_ID,Candidate_Name,Candidate_Age,Candidate_Weight,Candidate_Height:");
        Candidate_ID=sc.nextInt();
        sc.nextLine();
        Candidate_Name=sc.nextLine();
        Candidate_Age=sc.nextInt();
        Candidate_Weight=sc.nextDouble();
        Candidate_Height=sc.nextDouble();
    }
    void DisplayCandidateDetails(){
        System.out.println("id:"+Candidate_ID+"\tname:"+Candidate_Name+"\tage:"+Candidate_Age+"\tweight:"+Candidate_Weight+"\theight:"+Candidate_Height);
    }
}