
// Find the largest among 3 user entered nos. at the command prompt using
// Java
import java.util.*;

class largest {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        if (a > b && a > c) {
            System.out.println("The largest no. is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest no. is " + b);
        } else {
            System.out.println("The largest no. is " + c);
        }
    }
}
