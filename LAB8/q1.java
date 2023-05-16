
// Develop a java program to create an abstract class Figure having abstract method area()
// and data members length and breadth. Derive classes Triangle, Rectangle having
// member function area() and find area of triangle and rectangle by method overriding
// concept. [Note: Subclasses do not contain any data members].
import java.util.*;

abstract class Figure {
    double length, breadth;

    abstract void area();
}

class Triangle extends Figure {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the triangle");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        System.out.println("Area of the triangle is " + (length * breadth) / 2);
    }
}

class Rectangle extends Figure {
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        System.out.println("Area of the rectangle is " + (length * breadth));
    }
}

class q1 {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.area();
        r.area();
    }
}