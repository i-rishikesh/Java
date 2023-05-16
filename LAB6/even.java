
// Accept 10 numbers from command line and check how many of
// them are even and how many odd.
import java.util.*;

class even {
    public static void main(String args[]) {
        int a[] = new int[10];
        int i;
        int even = 0;
        int odd = 0;
        for (i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers are " + even);
        System.out.println("Odd numbers are " + odd);
    }
}