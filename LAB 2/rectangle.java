
// Q4) Write a program in Java to define a class Rectangle having data
// member: length and breadth; to calculate the area and perimeter of
// the rectangle. Use member functions to read, calculate and display.
import java.util.*;

class rectangle {
    int length;
    int breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
    }

    void calculate() {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }

    void display() {
        System.out.println("Length of rectangle is " + length);
        System.out.println("Breadth of rectangle is " + breadth);
    }

    public static void main(String args[]) {
        rectangle r = new rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}