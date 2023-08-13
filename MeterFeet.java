import java.util.*;
public class MeterFeet{
	public static void main(String[] args) {
		double meter,feet;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter meters: ");
		meter=obj1.nextDouble();
		feet=meter*3.28084;
		System.out.println(feet);

	}
}