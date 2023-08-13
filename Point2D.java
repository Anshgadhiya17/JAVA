
import java.util.*;


class Point{
        private int x=0;
        private int y=0;

    void setX(int x){
        this.x=x;
    }
    int getX(){
        return x;
    }
    void setY(int y){
        this.y=y;
    }
    int getY(){
        return y;
    }
    double getdistance(Point p){
        return Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
    }
}    
    public class Point2D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Point p1=new Point();
            int a=sc.nextInt();
            p1.setX(a);
            a=sc.nextInt();
            p1.setY(a);
            
            Point p2=new Point();
            a=sc.nextInt();
            p2.setX(a);
            a=sc.nextInt();
            p2.setY(a);
            System.out.printf("area %10.3f",p1.getdistance(p2));
        }    
    }
