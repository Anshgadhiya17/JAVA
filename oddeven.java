import java.util.*;

public class oddeven{
	public static void main ( String[] args){
		int odd=0,even=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];

		for(int i=0;i<a.length;i++){
			System.out.println("enter array "+(i+1)+ "element");
			a[i]=sc.nextInt();
			if(a[i]%2==0){
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(" total odd number"+odd);
		System.out.println(" total even number"+even);
	}

}