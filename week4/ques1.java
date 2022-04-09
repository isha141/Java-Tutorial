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
    public void rectangleArea(int l,int b){}; 
    public void squarearae(int s){};
    public void circularea(double r){};
} 
class Area extends shape{
    public void rectangleArea(int l,int b)
    { 
        double area;
        area=l*b;
        System.out.println("Area of the rectangle is " + area);
    }
    public void squareArea(int s)
    { 
        double area;
        area=s*s;
        System.out.println("Area of the square is " + area);
    }  
    public void circulareArea(double r)
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
        obj.circulareArea(5);
        obj.squareArea(4);
    }
        
}
