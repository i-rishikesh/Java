
//Q3) Write a program in java to define a class Shape which has data member area 
// and a member function showArea(). Derive two classes Circle and Rectangle
// from Shape class. Add appropriate data members and member functions to
// calculate and display the area of Circle and Rectangle.
import java.util.*;

class Shape {
    double area;

    public void area() {
        System.out.println(" Area Of different Shapes : ");
    }

}

class Circle extends Shape {
    double r, ar;

    public Circle(double r) {
        this.r = r;
    }

    public void area() {
        super.area();
        ar = (22 * r * r) / 7.0;
    }

    public void display() {
        System.out.println(" Area of Circle = " + ar);
    }

}

class Rectangle extends Shape {
    double l, b, area;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        area = l * b;
    }

    public void display() {
        System.out.println(" Area of Rectangle = " + area);
    }
}

class q3 {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        c.area();
        c.display();

        Rectangle r = new Rectangle(4, 3);
        r.area();
        r.display();
    }

}