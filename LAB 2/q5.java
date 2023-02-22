
//  Q5)Write a program to calculate area according to user input, whether it is
// circle, square or triangle (Menu Driven).
import java.util.*;

class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the radius");
                double r = sc.nextDouble();
                double area = 3.14 * r * r;
                System.out.println("Area of circle is " + area);
                break;
            case 2:
                System.out.println("Enter the side");
                int s = sc.nextInt();
                area = s * s;
                System.out.println("Area of square is " + area);
                break;
            case 3:
                System.out.println("Enter the base");
                double base = sc.nextDouble();
                System.out.println("Enter the height");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of triangle is " + area);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
