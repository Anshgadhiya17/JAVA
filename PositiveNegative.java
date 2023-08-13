import java.util.*;
public class PositiveNegative{
	public static void main(String[] args) {
		int a;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter number : ");
		a=obj1.nextInt();
		if(a>=0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	}
}