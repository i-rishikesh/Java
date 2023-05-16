
//Q5) Write a program in java using inheritance to show how to call the base class
// parameterized constructors from the derived class using super.
import java.util.*;

class Base1 {
    int a, b;

    Base1(int x, int y) {
        a = x;
        b = y;
    }
}

class Derive1 extends Base1 {
    int c;

    Derive1(int x, int y, int z) {
        super(x, y);
        c = z;
        System.out.println(x + " , " + y + " , " + z);
    }
}

class q5 {
    public static void main(String args[]) {
        Derive1 d = new Derive1(1, 2, 3);
    }
}