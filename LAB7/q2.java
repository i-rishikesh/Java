
//Q2) Illustrate the execution of constructors in multi-level inheritance with
// three
// Java classes – plate(length, width), box(length, width, height), wood box
// (length, width, height, thick)
import java.util.*;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
    }

    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
    }

    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thick  = " + height);
    }
}

class q2 {
    public static void main(String args[]) {
        WoodBox wd = new WoodBox(10, 20, 30, 40);
        wd.display();
    }
}