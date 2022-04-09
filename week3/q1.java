// 1.Write a java program to calculate the area of a rectangle, a square and
// a circle. Create an abstract class 'Shape' with three abstract methods
// namely rectangleArea() taking two parameters, squareArea() and
// circleArea() taking one parameter each.
// Now create another class ‘Area’ containing all the three methods
// rectangleArea(),squareArea() and circleArea() for printing the area of
// rectangle, square and circle respectively. Create an object of class Area
// and call all the three methods.
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.math.BigDecimal;
abstract class shape{
    abstract void rectangleArea(int l,int b); 
    abstract void squareArea(int s);
    abstract void circularArea(double r);
} 
class Area extends shape{
    void rectangleArea(int l,int b)
    { 
        double area;
        area=l*b;
        System.out.println("Area of the rectangle is " + area);
    }
     void squareArea(int s)
    { 
        double area;
        area=s*s;
        System.out.println("Area of the square is " + area);
    }  
     void circularArea(double r)
    { 
        double area;
        area=Math.PI*r*r;
        System.out.printf("Area of the circular is %.3f\n",area);
    }
}
public class task3_q1 { 
    public static void main(String []args)
    {
        Area obj=new Area();
        obj.rectangleArea(10, 20);
        obj.circularArea(5);
        obj.squareArea(4);
    }
        
}
