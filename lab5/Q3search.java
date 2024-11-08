//3. WAP to accept n numbers in an array. Now, enter a number and search whether the number
//is present or not in the list of array elements by using linear search.
import java.util.*;

public class Q3search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0, num;
        System.out.println("how many number user wants:");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("enter the number you want to search:");
        num = s.nextInt();
        Q3search l = new Q3search();
        int x = l.search(arr, num);

        if (x == -1) {
            System.out.println("number not found");
        } else {
            System.out.println("number found at" + x);
        }

    }

    int search(int arr[], int x) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}