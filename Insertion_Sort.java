package sort;

public class Insertion_Sort {
    public static void main(String[] args) {
        int a[] = { 5, 2, 9, 1, 5, 6 };

        for (int i = 1; i < a.length; i++) {
            
            int curr = a[i];
            int j = i - 1;
            while (j >= 0 && curr < a[j]) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = curr;
        }
        // c=a[1]2; c==2;
        // j=0;
        // 2<5
        // a[j+1](a[1]=curr)

        // [2,5,9,1,5,6]

        // c=a[2]9
        // j=1;
        // 9<5
        // exit loop with a[2]=9
        // [2,5,9,1,5,6]

        // 2nd it
        // c==a[3]1
        // j=2
        // while loop

        // 1<9
        // a[3]-->(1) = a[2]-->(9)
        // a[3]=1;
        // j=2[2,5,1,9,5,6]

        // 1<5
        // a[3]=a[2]
        // a[2]=1
        // j=

        //

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
