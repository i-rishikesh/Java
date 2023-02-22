
// Write a program to overload subtract method with various parameters
// in a class in Java
import java.util.*;

class subtract {

    int subtract(int x, int y) {
        return (x - y);
    }

    int subtract(int x, int y, int z) {
        return (x + y + z);
    }

    double subtract(double x, double y) {
        return (x - y);
    }

    public static void main(String args[]) {
        subtract sc = new subtract();
        System.out.println(sc.subtract(9, 10));
        System.out.println(sc.subtract(9, 20, 30));
        System.out.println(sc.subtract(10.5, 25.5));
    }
}