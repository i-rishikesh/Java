
//WAP to enter a string then write that string into  a file named as "abc.txt".
//Then read the string from the file and display it on the screen.
import java.io.*;
import java.util.*;

class q1 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(s);
        fw.close();
        FileReader fr = new FileReader("abc.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
