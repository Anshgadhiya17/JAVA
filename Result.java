import java.util.*;
public class Result{
	public static void main(String[] args) {
		int m1,m2,m3,m4,m5;
		double p;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter m1,m2,m3,m4,m5 :");
		m1=obj1.nextInt();
		m2=obj1.nextInt();
		m3=obj1.nextInt();
		m4=obj1.nextInt();
		m5=obj1.nextInt();
		p=(double)(m1+m2+m3+m4+m5)/5.0;
		System.out.println(p);
		if(p<35){
			System.out.println("fail");

		}
		else if(p>=35 && p<45){
			System.out.println("pass");

		}
		else if(p>=45 && p<60){
			System.out.println("second class");

		}
		else if(p>=60 && p<70){
			System.out.println("first class");

		}
		else if(p>=70 && p<100){
			System.out.println("distinction");

		}
		
	}
}