 import java.util.*;
 public class Factorial{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number; 
  Scanner obj1=new Scanner(System.in);
  System.out.println("enter number: ");
  number = obj1.nextInt();

  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  