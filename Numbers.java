import java.util.*;
public class Numbers{
	public static void main(String[] args) {
		int a,b,i;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter a,b: ");
		a=obj1.nextInt();
		b=obj1.nextInt();
        i=a+1;
        while(i<b){
        	if(i%2==0 && i%3!=0){
        		System.out.println(i);
        	}
        	i++;
        }


	}
}