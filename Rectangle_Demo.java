

public class Rectangle_Demo{
    int length;
    int width;
    static int count=0;

    Rectangle(){
        length=10;
        width=20;
        count++;
    }
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
        count++;
    }
    Rectangle(Rectangle r){
        length=r.length;
        width=r.width;
        count++;
    }

    public void PrintArea(){
        System.out.println(length*width);
    }
    public  void CountObject(){
        System.out.println("Number of object craeted till now "+count);
    }
}

 class RectDemo{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.PrintArea();
        Rectangle r2=new Rectangle(20,20);
        r2.PrintArea();
        Rectangle r3=new Rectangle(r2);
        r3.PrintArea();
        r3.CountObject();
        
    }
}



