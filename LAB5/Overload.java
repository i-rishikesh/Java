
// Q3) Write a program which will overload the area () method and display the
// area of a circle, triangle and square as per user choice and user entered
// dimensions.
import java.util.*;

class OverloadDemo {
    void area(int x) {
        System.out.println("the area of the square is " + Math.pow(x, 2));
    }

    void area(int x, int y) {
        System.out.println("the area of the rectangle is " + x * y);
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z);
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        ob.area(5);
        ob.area(11, 12);
        ob.area(2.5);
    }
}
