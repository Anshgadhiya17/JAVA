import java.util.*;
public class Largest{
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter a,b,c:");
		a=obj1.nextInt();
		b=obj1.nextInt();
		c=obj1.nextInt();
		max = (a>b)?(a>c? a:c):(b>c ? b:c);
		System.out.println("largest number is: "+max);
		
	}
}