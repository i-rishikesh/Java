//Define two package as- General and Marketing. In Generalpackage define a class empployee with data members as empid, empname, salary. In Marketing package
//define a class as sales with data members as salesid, salesname, salesamount. In Marketing package define a class as sales with data members as salesid, salesname,
//salesamount. In Marketing package define a class as sales "which is extending employee class and has a method tallowance()) which will calculate Travelling Allowance as 5% of total earning  
//Write a program to find out total earning of sales person for the given basic salary amount and print along with emp id.
package General;
public class employee
{
int empid;
String empname;
double salary;
public employee(int empid, String empname, double salary)
{
this.empid=empid;
this.empname=empname;
this.salary=salary;
}
public void display()
{
System.out.println("Employee id is "+empid);
System.out.println("Employee name is "+empname);
System.out.println("Employee salary is "+salary);
}
}
package Marketing;
import General.employee;
public class sales extends employee
{
int salesid;
String salesname;
double salesamount;
public sales(int empid, String empname, double salary, int salesid, String salesname, double salesamount)
{
super(empid, empname, salary);
this.salesid=salesid;
this.salesname=salesname;
this.salesamount=salesamount;
}
public void tallowance()
{
double total=salary+salesamount;
double ta=total*0.05;
System.out.println("Total earning of sales person is "+total);
System.out.println("Travelling allowance is "+ta);
}
}
package q1;
import Marketing.sales;
public class q1
{
public static void main(String args[])
{
sales s=new sales(1,"Rahul",10000,2,"Raj",5000);
s.display();
s.tallowance();
}
}
