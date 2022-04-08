// 5. Using the switch statement, write a menu-driven program to calculate the maturity
// amount of a bank deposit.
// The user is given the following options:
// (i) Term Deposit
// (ii) Recurring Deposit
// For option (i) accept Principal (p), rate of interest (r) and time period in years (n). Calculate
// the maturity amount using the formula A = p[1 + r / 100]n.
// For option (ii) accept monthly installment (p), rate of interest (r) and time period in months
// (n). Calculate the maturity amount using the formula
// A = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
// For an incorrect option, an appropriate error message should be displayed.
// [ Use Scanner Class to take input ] 
import java.util.Scanner;
public class ques5 { 
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int ch; 
        long p;
        long r;
        int t;
        long res=0;
        System.out.println("1 for term deposit");
        System.out.println("2 for recurring deposit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
            System.out.println("Enter the principal ,rate and time ");
            p=sc.nextLong();
            r=sc.nextInt();
            t=sc.nextInt(); 
            res=p *(1 + r / 100)* t;
            System.out.println(res);
            case 2: 
            System.out.println("Enter the principal ,rate and time ");
            p=sc.nextLong();
            r=sc.nextInt();
            t=sc.nextInt(); 
            res=p * t+ p * t*(t + 1) / 2 * r / 100 * 1 / 12;
            System.out.println(res);
        }
    }
}
