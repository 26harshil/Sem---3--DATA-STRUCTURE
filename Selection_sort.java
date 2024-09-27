
public class Selection_sort {

    public static void main(String[] args) {
        int a[] = { 7, 3, 3, 7, 85, 99, 95, 23 };

        for (int i = 0; i < a.length - 1; i++) {
            
            int temp = i;
            for (int j = i + 1; j < a.length; j++) {

                if (a[temp] > a[j]) {
                    temp = j;
                }

            }
            int var = a[temp];
            a[temp] = a[i];
            a[i] = var;

            // int var = 3;
            // a[1] = a[0](7);
            // a[0] = 3;

            // //v = 1

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}