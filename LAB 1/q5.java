
//Program to check a user entered number is prime or not.
import java.util.*;

class q5 {
    public static void main(String arg[]) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}