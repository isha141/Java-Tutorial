// 3. Write a program to declare a square matrix A[ ][ ] of order MxM where ‘M’ is the number
// of rows and the number of columns, such that M must be greater than 2 and less than 10.
// Accept the value of M as user input. Display an appropriate message for an invalid input.
// Allow the user to input integers into this matrix. Perform the following tasks:
// (a) Display the original matrix.
// (b) Rotate the matrix 90° clockwise as shown below:
// (c) Find the sum of the elements of the four corners of the matrix.
// Test your program for the following data and some random data:
// Example 1
// INPUT :
// M = 3
// OUTPUT :
// ORIGINAL MATRIX
// MATRIX AFTER ROTATION
// Sum of the corner elements = 20
import java.util.Scanner;
public class ques3 { 
    public static void main(String []args)
    {
int m; 
System.out.println("Enter the size of ana matrix ");
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
if(m<=2 || m>=10 )
System.out.println("Invalid input ");
int [][]a=new int [m][m];
for(int i=0;i<m;i++)
{
   for(int j=0;j<m;j++)
   {
       a[i][j]=sc.nextInt();
   }
}
System.out.println("Display the original matrix ");
for(int i=0;i<m;i++)
{
   for(int j=0;j<m;j++)
   {
      System.out.print(a[i][j]+" ");
   }
   System.out.println();
}
    System.out.println("Rotate the original matrix by 90 degree ");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<=i;j++)
        { 
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
    } 
    for(int i=0;i<m;i++)
    {
        int k=0; 
        int l=m-1;
        while(k<=l)
        {
          int temp=a[i][k];
          a[i][k]=a[i][l];
          a[i][l]=temp;
          k++;
          l--;
        }
    }
System.out.println("Display the original matrix ");
for(int i=0;i<m;i++)
{
   for(int j=0;j<m;j++)
   {
    System.out.print(a[i][j]+" ");
   }
   System.out.println();
} 
int sum=0;
sum=a[0][0]+a[0][m-1]+a[m-1][0]+a[m-1][m-1];
System.out.println("sum of all the four corners is "+ sum); 
  }
  }
