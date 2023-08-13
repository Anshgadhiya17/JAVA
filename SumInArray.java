import java.util.Scanner;
public class SumInArray{
    public static void main (String [] args){
        int a[],n,sum=0;
        System.out.println("enter limit :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a= new int[n];
        System.out.println("enter numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0) {
                sum+=a[i];
            }
        }
        System.out.println("sum : "+sum);
    }
}