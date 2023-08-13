import java.util.*;
public class AddFunction{
	public static void main(String[] args) {
		int a,b,c;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter a,b: ");
		a=obj1.nextInt();
		b=obj1.nextInt();
		c=add(a,b);
		System.out.println(c);

	}
	public static int add(int a, int b){
	return a+b;
	
	}
}
