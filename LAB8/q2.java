
// Write a program in Java having a class called Address with 2 methods called
// getAddress() and setAddress(). The Address class will have three child classes named
// HomeAddress, OfficeAddress and SchoolAddress having same functions as Address
// class.use dynamic method dispatch concept to override the derived class methods and
// display the address of home, office and school accordingly.
import java.util.*;

class Address {
    void getAddress() {
        System.out.println("This is the address of the parent class");
    }

    void setAddress() {
        System.out.println("This is the address of the parent class");
    }
}

class HomeAddress extends Address {
    void getAddress() {
        System.out.println("This is the address of the home");
    }

    void setAddress() {
        System.out.println("This is the address of the home");
    }
}

class OfficeAddress extends Address {
    void getAddress() {
        System.out.println("This is the address of the office");
    }

    void setAddress() {
        System.out.println("This is the address of the office");
    }
}

class SchoolAddress extends Address {
    void getAddress() {
        System.out.println("This is the address of the school");
    }

    void setAddress() {
        System.out.println("This is the address of the school");
    }
}

class q2 {
    public static void main(String args[]) {
        HomeAddress h = new HomeAddress();
        OfficeAddress o = new OfficeAddress();
        SchoolAddress s = new SchoolAddress();
        h.getAddress();
        h.setAddress();
        o.getAddress();
        o.setAddress();
        s.getAddress();
        s.setAddress();
        HomeAddress r;
        r = h;
        r.getAddress();
        r.setAddress();
        // r = o;r.getAddress();r.setAddress();x
        // r = s;r.getAddress();r.setAddress();

    }
}