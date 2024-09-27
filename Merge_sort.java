package sort;

public class Merge_sort {
    public static void main(String[] args) {
        int a[] = { 1, 232, 32595, 15495, 6294, 2, 56223, 295623, 326, 6, 18, 495, 89 };

        mergesort(0, a.length - 1, a);
        for (int temp : a) {
            System.out.print(temp + " ");
        }

    }

    public static void mergesort(int low, int high, int a[]) {
        if (low < high) {
            
            int mid = (low + high) / 2;
            mergesort(low, mid, a);
            mergesort(mid + 1, high, a);
            merge(low, mid, high, a);

        }
    }

    public static void merge(int low, int mid, int high, int a[]) {

        int b[] = new int[high - low + 1];
        int i = 0;
        int h = low;
        int j = mid + 1;
        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i++] = a[h];
                h++;
            } else {
                b[i++] = a[j];
                j++;
            }

        }

        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i++] = a[k];

            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i++] = a[k];

            }

        }
        for (int k = 0; k < b.length; k++) {
            a[k + low] = b[k];

        }

    }

}
