import java.util.*;

public class binarRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = { 1, 65, 23, 89, 21, 32, 12, 32, 581, 295 };
        Arrays.sort(a);
        System.out.println("enter the element for the search");
        int key = sc.nextInt();

        int left = 0;
        int right = a.length - 1;
        int result = search(a, left, right, key);
        System.out.println(result);

    }

    public static int search(int[] a, int left, int right, int key) {
        int middle = (left + right) / 2;

        if (left <= right) {
            if (a[middle] == key) {
                System.out.println("the element find ayt index " + middle);
                return middle;
            }
            if (a[middle] < key) {
                return search(a, middle + 1,right, key);
            } else {
                return search(a,left,  middle - 1, key);
            }

        }
        return middle;

    }
}
