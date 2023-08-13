//Create a class “Student” that would contain enrolment No, name, and gender and marks as instance variables and count as static variable which stores the count of the
//objects; constructors and display(). Implement constructors to initialize instance variables.
import java.util.Scanner;
public class Class_Demo_1{
    public static void main(String []args)
    {
        Student s1=new Student(101,"nandan",'m',100);
        Student s2=new Student(102,"Ayush",'m',90);
        Student s3=new Student();
        s1.print();
        s2.print();
        s3.print();
    }
}
class Student{
    int EnrolmentNo;
    String name;
    char gender;
    int marks;
    static int count=0;
    
    Student(){
        EnrolmentNo=1;
        name="not specified";
        gender='m';
        marks=0;
        count++;
    }
    Student(int EnrolmentNo,String name,char gender,int marks){
        this.EnrolmentNo=EnrolmentNo;
        this.name=name;
        this.gender=gender;
        this.marks=marks;
        count++;
    }
    void print(){
        System.out.println("EnrolmentNo:"+EnrolmentNo+"\tname:"+name+"\tgender:"+gender+"\tmarks:"+marks+"\tcount:"+count);
    }
}

