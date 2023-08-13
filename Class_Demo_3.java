/*Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. Also create a method GetAccountDetails()
and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class.*/
import java.util.Scanner;
public class Class_Demo_3{
    public static void main(String []args)
    {
        Bank_Account s1= new Bank_Account();
        s1.GetAccountDetails();
        s1.DisplayCandidateDetails();
    }
}
    class Bank_Account{
        int Account_No;
        String User_Name;
        String Email;
        String Account_Type;
        double Account_Balance;
        
        void GetAccountDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Account_No,User_Name,Email,Account_Type,Account_Balance:");
            Account_No=sc.nextInt();
            sc.nextLine();
            User_Name=sc.nextLine();
            sc.nextLine();
            Email=sc.nextLine();
            sc.nextLine();
            Account_Type=sc.nextLine();
            Account_Balance=sc.nextDouble();
        }
        void DisplayCandidateDetails(){
            System.out.println("number:"+Account_No+"\nname:"+User_Name+"\nemail:"+Email+"\nAccount_Type:"+Account_Type+"\nAccount_Balance:"+Account_Balance);
        }
    }
