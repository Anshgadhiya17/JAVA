import java.util.*;
public class VowelCons{
	public static void main(String[] args) {
		char ch;
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter letter:");
		ch=obj1.next().charAt(0);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("vowel");
		}
		else{
			System.out.println("consonant");
		}
	}
}