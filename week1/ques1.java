
/*1. Write a java program that takes strings s1, s2 and find the following
I. Index of a variable
II. Character at an index
III. Convert the string into upper case and lower case
IV. Compare both stings.
V. Substring of s1 */
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {

        String s1;
        String s2;
        System.out.println("Enter the string ");
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        System.out.println("Enter the string 2"); 
        s2=sc.next();
        System.out.println("Variable in string 1 "+ s1.charAt(3));
        System.out.println("Variable in string 2 "+ s2.charAt(3));
        System.out.println("index of the variable in string 2 "+ s2.indexOf('a'));
        System.out.println("index of the variable in string 1 "+ s1.indexOf('a'));
        s1.toUpperCase();
        s2.toUpperCase();
        System.out.println("The string 1 in Upper case "+s1);
        System.out.println("The string 1 in Upper case "+ s1);
        System.out.println(s1.equals(s2));
           }
    
}
