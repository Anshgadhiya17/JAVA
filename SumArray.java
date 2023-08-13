// sum of elements which are divided by 3 or 5

import java.util.*;

public class SumArray{
	public static void main ( String[] args){
		int sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];

		for(int i=0;i<a.length;i++){
			System.out.println("enter array element");
			a[i]=sc.nextInt();
			if(a[i]%3==0 || a[i]%5==0){
				sum = sum + a[i];

			}
			
		}
		System.out.println(" sum ="+sum);
		
	}

}