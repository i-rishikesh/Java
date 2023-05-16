
// Find the no. of occurrence of each element in a user entered list of nos.
//Find the no. of occurrence of each element in a user entered list of nos.

import java.util.*;

class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter number of elements ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to find its occurrence:");
        int ele = sc.nextInt();
        int occ = 0;

        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                occ++;
            }
        }
        System.out.println(ele + " occurred " + occ + " times ");

    }
}
