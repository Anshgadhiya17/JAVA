import java.util.*;
public class TelephoneBill{
	public static void main(String[] args) {
		int calls;
		double bill;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter calls: ");
		calls=obj1.nextInt();
		if(calls<100){
			bill=200;
		}
		else if(calls>100 && calls<=150){
     		calls=calls-100;
     		bill=200+(0.60*calls);
     	}
     	else if(calls>150 && calls<=200){
			calls=calls-150;
			bill=200+(0.60*50)+(0.50*calls);
 		}
		else{
			calls=calls-200;
			bill=200+(0.60*50)+(0.50*50)+(0.40*calls);
		}
		System.out.println(bill);

	}
}
