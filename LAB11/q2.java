
//WAP to cpoy the content of one file into another file.
import java.io.*;
import java.util.*;

class q2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to be copied");
        String s = sc.nextLine();
        FileReader fr = new FileReader(s);
        FileWriter fw = new FileWriter("xyz.txt");
        int i;
        while ((i = fr.read()) != -1) {
            fw.write((char) i);
        }
        fr.close();
        fw.close();
    }
}