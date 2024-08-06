import java.util.Arrays;
import java.util.Scanner;

public class lab_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1,65,23,89,21,32,12,32, 581,295 };
        Arrays.sort(a);
        System.out.println("enter the element for the search");
        int key = sc.nextInt();

        int left = 0;
        int right = a.length - 1;
        int middle=0;
        while (left <= right) {
             middle = (left + right) / 2;
            if (a[middle] == key) {
                System.out.println("the number  found a t = " + middle);
                return;

            } else {
                if (a[middle] < key) 
                    left = middle + 1;
                 else 
                        right = middle - 1;

                    

                

            }

        }
    }
}
