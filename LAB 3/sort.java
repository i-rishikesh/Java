
// 
import java.util.*;

class sort {
    public static void main(String args[]) {
        int a[] = new int[10];
        int i;
        int j;
        int temp;
        for (i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is");
        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}