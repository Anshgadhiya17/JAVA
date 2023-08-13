import java.util.*;

public class Maximum{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a First Number : ");
		int a=sc.nextInt();

		System.out.println("Enter a Second Number : ");
		int b=sc.nextInt();

		int ans=large(a,b);

		System.out.println("Largest Number is : "+ans);
	}


	public static int large(int a, int b){

		if (a>b) {
			return a;
		}
		else 
		{
			return b;
		}
	}	
} 	