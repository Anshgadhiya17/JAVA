import java.util.*;
public class Diameter{
	public static void main(String[] args) {
		double area,radius,diameter;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter area : ");
		area=obj1.nextDouble();
		radius=Math.sqrt(area/3.14);
		diameter=2*radius;
		

		System.out.println(diameter);

	}
}