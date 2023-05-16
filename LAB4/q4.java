
//Program to check a user entered number is palindrome or not.
import java.util.*;

class q4 {
    public static void main(String args[]) {
        int n, rev = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

    }
}