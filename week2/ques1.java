// 1.Printing an array into Zigzag fashion. Suppose you were given an
// array of integers, and you are told to sort the integers in a zigzag
// pattern. In general, in a zigzag pattern, the first integer is less than the
// second integer, which is greater than the third integer, which is less than
// the fourth integer, and so on. Hence, the converted array should be in
// the form of e1 < e2 > e3 < e4 > e5 < e6.
// Test cases:
// Input 1:
// 7
// 4 3 7 8 6 2 1
// Output 1:
// 3 7 4 8 2 6 1
// Input 2:
// 4
// 1 4 3 2
// Output 2:
// 1 4 2 3
// package lab_work.week2;
import java.util.Scanner;
public class zig_zag {
    static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void sort(int []a,int n)
    {
        for(int i=0;i<n-2;i++)
        {
            if(a[i]>a[i+1] || a[i+1]<a[i+2])
            swap(a,i,i+1);
        }
    }
    public static void main(String []args)
    { 
        int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array ");
    n=sc.nextInt(); 
    int []a=new int [n]; 
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    sort(a,n);
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
    }
    
}
