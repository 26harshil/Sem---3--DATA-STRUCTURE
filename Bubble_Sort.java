

public class Bubble_Sort {
    public static void main(String[] args) {
        int a[] = { 7, 3, 85, 99, 95, 23 };
        for (int i = 0; i < a.length; i++){

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}