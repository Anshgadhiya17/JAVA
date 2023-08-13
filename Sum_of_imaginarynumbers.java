import java.util.*;
public class Sum_of_imaginarynumbers{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num:");
		int real=sc.nextInt();
		int img=sc.nextInt();
		Sum n1=new Sum(real,img);

		System.out.println("enter second num:");
		real=sc.nextInt();
		img=sc.nextInt();
		Sum n2=new Sum(real,img);

		Sum n3=new Sum();
		n3.Sum(n1,n2);

		System.out.println(n3.real+"+"+n3.img+"i");


	}
}
  class Sum{
  	int real,img;

  	Sum(){

  	}

  	Sum(int real,int img){
  		this.real=real;
  		this.img=img;
  	}

  	public void Sum(Sum n1,Sum n2){
  		this.real=n1.real+n2.real;
  		this.img=n1.img+n2.img;
  	}

}


