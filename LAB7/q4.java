
//Q4) Write a program to create an Account class containing acc_no, balance as data
// members and disp() to display the details. Inherit it in Person class with all
// mentioned data members and functions. Person class also has name and
// aadhar_no as extra data members of its own. Override disp() function.
import java.util.*;

class Account {
    int account_no, balance;

    public Account(int a, int b) {
        account_no = a;
        balance = b;
    }

    public void display() {
        System.out.println("Account Number = " + account_no);
        System.out.println("Balance = " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhaar_no;

    public Person(int ac, int b, String n, int ad) {
        super(ac, b);
        name = n;
        aadhaar_no = ad;
    }

    public void display() {
        super.display();
        System.out.println("Name : " + name);
        System.out.println("Aadhaar Number : " + aadhaar_no);
    }
}

class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[5];
        String name;
        int ad, b, ac;
        for (int x = 0; x < 5; x++) {
            System.out.println("Enter Details of person " + (x + 1));
            System.out.println("Enter Name  : ");
            name = sc.next();
            System.out.println("Enter account number : ");
            ac = sc.nextInt();
            System.out.println("Enter balance : ");
            b = sc.nextInt();
            System.out.println("Enter aadhaar number : ");
            ad = sc.nextInt();
            p[x] = new Person(ac, b, name, ad);
        }
        for (int x = 0; x < 5; x++) {
            System.out.println("\n Person : " + (x + 1));
            p[x].display();
        }
    }
}
