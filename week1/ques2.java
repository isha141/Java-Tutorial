import java.util.Scanner;
public class QUES_2 { 
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string ");
        Scanner sc=new Scanner (System.in);
        s=sc.nextLine();
        int n=s.length(); 

        int v=0;
        int d=0;
        int a=0;
        int sp=0; 
        int w=0;
        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)>='a' && s.charAt(i)<='z')
           {
               if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
               v=v+1;
               else
               a=a+1;
           }
           else if(s.charAt(i)>='1' &&s.charAt(i)<='9')
               d=d+1;
           else if(s.charAt(i)==' ' && s.charAt(i-1)!=' ')
               w=w+1;
           else
               sp=sp+1;
        } 
        if(s.charAt(n-1)!=' ')
        w+=1;
        System.out.println("The number of vowel "+ v);
        System.out.println("The numvber of digit "+ d);
        System.out.println("The number of alphabet "+ a);
        System.out.println("The number of word "+ w); 
        System.out.println("The number of  special charcter "+ sp); 
        }
        }
