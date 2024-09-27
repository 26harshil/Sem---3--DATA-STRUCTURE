public class ShellSort {
    public static void main(String[] args) {
        int a[] = { 1, 232, 32595, 15495, 6294, 2, 56223, 295623, 326, 6, 18, 495, 89 };
        int n = a.length;
        shellsort(a, n);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void shellsort(int a[], int n) {

        for (int gap = n / 2; gap >= 1; gap = gap / 2) {

            for (int j = gap; j < n; j++) {

                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (a[i + gap] >= a[i]) {
                        break;
                    } else {
                        swap(a, i + gap, i);
                    }
                }
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
