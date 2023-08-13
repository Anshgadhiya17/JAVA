import java.util.*;
public class Time_Conversion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		Time t1=new Time(h,m);
		h=sc.nextInt();
		m=sc.nextInt();
		Time t2=new Time(h,m);
		t1.addtime(t2);
		System.out.println(t1.hh+":"+t1.mm);

		
	}
}
class Time{
	int hh;
	int mm;

	Time(){

	}
	Time(int hh,int mm){
		this.hh=hh;
		this.mm=mm;
	}

	void addtime(Time a){
		this.mm=this.mm+a.mm;
		if(this.mm >60){
			this.hh++;
			this.mm=this.mm-60;
		}
		this.hh=this.hh+a.hh;

	}
}