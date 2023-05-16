// define two package as - General and marketing.In general package define a class ,employee with data member as empid(projected)
// and empname(projected).In marketing package define a class ,sales which is extending from employee class and has a method tallowance()
// which calculate Travelling allowance as 5% of toal earning.write the program to find out total earning of a sales person for the given basic salary amount and print along with empid

package general;

public class employee {
    protected int empid;
    private String empname;
    double basic;
    public double total_earning;
    double earning;

    public void set(int id, String name) {
        empid = id;
        empname = name;
    }

    public void display() {
        System.out.println("Employee id is " + empid);
        System.out.println("Employee name is " + empname);
    }

    public void earning() {
        total_earning = basic + (80 % 100 * basic) + (15 % basic);
        System.out.println("Total earning is " + total_earning);
        System.out.println("Total earning is ");

    }
}
