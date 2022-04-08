// 2. Write a program in java to print area and volume. Create a class called Area
// and create a constructor for calculating the area of rectangle, circle, triangle,
// square using method overloading. Create a class called Volume and create a
// constructor for calculating the volume of a sphere, cylinder, cube and a cone.
import java.util.Scanner;  
import java.io.*;
class area{ 
    private int l;
    private int br;
    private double r;
    private double cal;
    private double h;
    private int a;
    area()
    {
      l=0;
      br=0;
      r =0;
      a=0;
    } 
    public  void methods(int l,int b){ 
        this.l=l;
        this.br=b;
        cal=l*b;
        System.out.println("Area of the rectangle is " + cal);
    } 
    public  void methods(double r)
    {
      this.r=r;
      cal=(double)Math.PI*r*r;
      System.out.println("The area of the circle is  " + cal);
    } 
    public void methods(int b,double h)
    {
        this.br=b;
        this.h=h;
        cal=0.5*(b)*(h);
        System.out.println("The area of the triangle is " + cal);
    }
    public void methods(int a)
    {
        this.a=a;
        System.out.println("The area of the square is " + a*a);
    }

}
public class week2_ques2 {
    public static void main(String []args)
    {
     area obj=new area();
     obj.methods(3.46);
     obj.methods(5);
     obj.methods(5,10.4);
     obj.methods(4,5);
    }
}
