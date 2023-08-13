import java.util.*;
public class Perfect{
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		int a,i,sum=0;
		System.out.println("enter a: ");
		a=obj1.nextInt();
		for(i=1;i<a;i++){
			if(a%i==0){
				sum=sum+i;
			}
         }
         if(sum==a){
         	System.out.println("perfect");
         }
          else{
         	System.out.println("not perfect");
         }
       }
	 }