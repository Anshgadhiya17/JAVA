import java.util.*;

public class Fibonacci{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n=sc.nextInt();

		for ( int i=0 ; i<n ; i++ ) {
			System.out.println(" "+fibo(i));
		}
	}


	public static int fibo(int n){

		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}

		return fibo(n-1)+fibo(n-2);
		
		}
}	