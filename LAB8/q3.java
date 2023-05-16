
// Write a program in java to create a class complex having data members real and
// imaginary and member functions add(complex c2)-- used to add two complex numbers
// and display()-- used to display result of added complex numbers. Use appropriate
// constructor and methods.
import java.util.*;

class complex {
    int real, imaginary;

    complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(complex c2) {
        int real = this.real + c2.real;
        int imaginary = this.imaginary + c2.imaginary;
        System.out.println("The sum of the complex numbers is " + real + "+" + imaginary + "i");
    }

    void display() {
        System.out.println("The complex number is " + real + "+" + imaginary + "i");
    }
}

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of the first complex number");
        int real = sc.nextInt();
        int imaginary = sc.nextInt();
        complex c1 = new complex(real, imaginary);
        System.out.println("Enter the real and imaginary part of the second complex number");
        real = sc.nextInt();
        imaginary = sc.nextInt();
        complex c2 = new complex(real, imaginary);
        c1.add(c2);
        c1.display();
        c2.display();
    }
}