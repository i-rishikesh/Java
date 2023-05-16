
// Write a Java program to illustrate try..catch. finally block.
import java.util.*;

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 elements");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        try {
            System.out.println("Enter the index of the array element you want to access");
            int n = sc.nextInt();
            System.out.println("The array element at index " + n + " = " + a[n]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}