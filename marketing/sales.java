// define two package as - General and marketing.In general package define a class ,employee with data member as empid(projected)
// and empname(projected).In marketing package define a class ,sales which is extending from employee class and has a method tallowance()
// which calculate Travelling allowance as 5% of toal earning.write the program to find out total earning of a sales person for the given basic salary amount and print along with empid
package marketing;

import general.employee;

public class sales extends employee {
    public void tallowance() {
        total_earning = total_earning + (5 % 100 * total_earning);
        System.out.println("Total earning is " + total_earning);
    }
}