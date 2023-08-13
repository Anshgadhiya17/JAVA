import java.util.*;

public class SimpleInterest{
	public static void main(String[] args) {
		double p,r,n,si;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter p,r,n: ");
		p=obj1.nextDouble();
		r=obj1.nextDouble();
		n=obj1.nextDouble();
		si=SI(p,r,n);
		System.out.println("interest is "+si);
	}
	public static double SI(double p, double r,double n){
		return (p*r*n)/100;
	}
}