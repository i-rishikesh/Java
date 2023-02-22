
import java.util.*;

class q4 {
    static int count = 0;

    public q4() {
        count++;
    }

    public void display() {
        System.out.println("Objects created till now = " + count);
    }

    public static void main(String args[]) {
        q4 ob1 = new q4();
        q4 ob2 = new q4();
        q4 ob3 = new q4();
        ob3.display();
        q4 ob4 = new q4();
        ob3.display();
        q4 ob5 = new q4();
        q4 ob6 = new q4();
        ob6.display();

    }
}