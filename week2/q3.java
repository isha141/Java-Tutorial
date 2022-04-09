// Write a java program to create a class Employee with following members
// • employeeName
// • employeeId
// • basicsalary
// • displayInfo () method which will display details of Employee
// Create SalaryCalculator class as child class of Employee with following
// members
// • hra
// • da
// • pf
// • grossSalary
// • grossCal () method that will calculate gross salary of an employee
// • showSalarySlip() method that will display salary slip of an employee

// package lab_work.week2.lab_work.week2;
import java.util.Scanner; 
import java.math.BigDecimal;
import java.text.DecimalFormat;
class employee{
    private String name;
    private int id;
    public double  salary; 
    employee()
    {
        System.out.println("ENter name is ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter id ");
        id=sc.nextInt();
        System.out.println("Enter basic salary ");
        salary=sc.nextDouble();
    }
    public void  displayInfo()
    {
        System.out.println("Name is " +name);
        System.out.println("Employee id is " + id);
        System.out.printf("Salary is %.3f\n" , salary );
    } 
} 
class SalaryCalculator extends employee{ 
    private double  hra;
    private double da;
    private double pf;
    private double grossSalary; 
    public void get_data()
    { 
    hra=(0.05)*salary;
    da=(0.03)*salary;
    pf=(0.05)*salary;
    }
    public void grosscal()
    { 
      grossSalary= salary+hra+pf+da;
    } 
    public void showSalarySlip()
    {
    System.out.printf("HRA is : %f\n" , hra);
    System.out.printf(" Special allowance  is : %f\n", da);
    System.out.printf(" Provident fund contribution is :%f\n",pf);
    System.out.printf("Net Gross Salary is : %f\n" , grossSalary);
    }

}

public class q3 {  
    public static void main(String []args)
    { 
        SalaryCalculator obj=new SalaryCalculator();
        obj.get_data();
        obj.displayInfo();
        obj.grosscal();
        obj.showSalarySlip();
    }
}
