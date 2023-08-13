import java.util.*;
public class Triangle{
	public static void main(String[] args){
		double a,b,c;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter a,b,c: ");
		a=obj1.nextDouble();
		b=obj1.nextDouble();
		c=obj1.nextDouble();

		if(a==b && b==c){
				System.out.println("equilateral");
		}
		 else if (a==b || b==c ||c==a){
           		System.out.println("Isosceles Triangle");
       }
       else if(a*a==b*b+c*c|| b*b== a*a+c*c || c*c==a*a+b*b){
       			System.out.println("right-angled Triangle");

       }
       else{
       			System.out.println("scalene Triangle");
       }

	}
}