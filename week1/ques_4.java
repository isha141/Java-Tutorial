// 4. Construct a Program in java to replace all 0's with 1 in a given integer. Given an integer as
// an input, all the 0's in the number has to be replaced with 1.
// For example, consider the following number
// Input: 102405
// Output: 112415
// Input: 56004
// Output: 56114
// Steps to replace all 0's with 1 in a given integer
// • Input the integer from the user.
// • Traverse the integer digit by digit.
// • If a '0' is encountered, replace it by '1'.
// • Print the integer.

import java.util.Scanner;
public class ques_4 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        StringBuffer s=new StringBuffer();
        s.append(sc.nextLine());
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
               s.setCharAt(i, '1');
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(s.charAt(i));
        }
       }
    
}
