
// Write a program to demonstrate the constructor overloading.
import java.util.*;

class q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        q8 ob1 = new q8(a, b, c);
        q8 ob2 = new q8(a, b);
        q8 ob3 = new q8(a);
        q8 ob4 = new q8();
    }

    public q8(int a, int b, int c) {
        System.out.println("Three numbers are " + a + " " + b + " " + c);
    }

    public q8(int a, int b) {
        System.out.println("Two numbers are " + a + " " + b);
    }

    public q8(int a) {
        System.out.println("One number is " + a);
    }

    public q8() {
        System.out.println("No numbers");
    }
}