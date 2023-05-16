
// Q1) Write a class file – box with three data members (length, width, height)
// and a method volume() . Also implement the application class Demo
// where an object of the box class is created with user entered dimensions
// and volume is printed.
import java.util.*;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double w = sc.nextDouble();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        System.out.println("Enter the length: ");
        double l = sc.nextDouble();
        Box mybox1 = new Box(w, h, l);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

    }
}