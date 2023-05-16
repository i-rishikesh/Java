
// Q1) A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs
// 60/cubic ft.
// Implement it in Java to calculate the cost of plastic as per the dimensions
// given by the user where 3D inherits from 2D.
import java.util.Scanner;

class two {
    double length, breadth;

    two(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class three extends two {
    double height;

    three(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, breadth and height of the plastic (in feet): ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        two sheet = new two(l, b);
        three box = new three(l, b, h);

        double sheetCost = sheet.area() * 40;
        double boxCost = box.volume() * 60;

        System.out.println("Cost of plastic sheet: Rs " + sheetCost);
        System.out.println("Cost of plastic box: Rs " + boxCost);
    }
}