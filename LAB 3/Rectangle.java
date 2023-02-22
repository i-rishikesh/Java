
// Write a program in Java to define a class Rectangle having data
// member: length and breadth; to calculate the area and perimeter of
// the rectangle. Use constructor to initialize the data members. Use
// member functions to calculate and display.
import java.util.*;

class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        area = length * breadth;
    }

    public void perimeter() {
        perimeter = 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();
        Rectangle ob = new Rectangle(l, b);
        ob.area();
        ob.perimeter();
        ob.display();
    }
}
