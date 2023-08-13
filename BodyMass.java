import java.util.*;
public class BodyMass{
	public static void main(String[] args) {
		double height,weight,bm;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter weight in pound : ");
		weight=obj1.nextDouble();
		System.out.println("enter height in inches: ");
		height=obj1.nextDouble();
		weight=weight*0.453592;
		height=height*0.0254;
		bm=weight/(height*height);

		System.out.println(bm);

	}
}