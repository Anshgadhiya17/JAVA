import java.util.*;

public class Gcd{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a First Number : ");
		int a=sc.nextInt();

		System.out.println("Enter a Second Number : ");
		int b=sc.nextInt();

		int ans=gcd(a,b);

		System.out.println(" GCD of "+a+" and "+b+" = "+ans+" ");
	}

	public static int gcd(int a, int b){

		int min=(a<b)?a:b;

		while(min>0){
			if (a%min==0 && b%min==0) {
				return min;
			}
			min--;
		}
		return 1;
	}	
}