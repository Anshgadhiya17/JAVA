import java.util.*;
public class Calculater{
	public static void main(String[] args) {
		double a,b;
		char ch;
		Scanner obj1=new Scanner(System.in); 
		System.out.println("enter a: ");
		a=obj1.nextDouble();
		System.out.println("enter b: ");
		b=obj1.nextDouble();
		System.out.println("enter your choice = +,-,*,/: ");
		ch=obj1.next().charAt(0);
		switch(ch){
			case'+':{
				System.out.println(a+b);
				break;
			}
			case'-':{
				System.out.println(a-b);
				break;
			}
		    case'*':{
				System.out.println(a*b);
				break;
			}
			case'/':{
				System.out.println(a/b);
				break;
			}
		}

	}
}