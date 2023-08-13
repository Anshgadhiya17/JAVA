import java.util.*;
public class Prime{
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		int a,i,count=0;
		System.out.println("enter a: ");
		a=obj1.nextInt();
		for(i=1;i<=a;i++){
        if(a%i==0){
        	count++;
		}
		
	 }
	 if(count==2){
	 	System.out.println("prime");
	 }
	 else{
	 	System.out.println("not prime");
	 }

	}
}