import java.util.*;
public class AddFunction2{
	public static void main(String[] args) {
		int a,b,c;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter a,b: ");
		a=obj1.nextInt();
		b=obj1.nextInt();
		AddFunction2 a1=new AddFunction2();
		c=a1.add(a,b);
		System.out.println(c);

	}
	public int add(int a, int b){
	return a+b;
	
	}
}