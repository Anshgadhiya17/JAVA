import java.util.*;

public class NumberInArray{
	public static void main ( String[] args){
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];

		for(int i=0;i<a.length;i++){
			System.out.println("enter array element");
			a[i]=sc.nextInt();
			
			
		}
		System.out.println("which number do you want to find");
		int b=sc.nextInt();
		boolean c=false;

		for(int i=0;i<a.length;i++){
			if(a[i]==b){
				System.out.println("given number index is" +i);
				c=true;
				break;
			}
			
		}
		if(c!=true ){
			System.out.println("invelid input");
		}
		
	}

}