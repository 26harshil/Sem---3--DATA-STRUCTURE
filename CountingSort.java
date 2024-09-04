public class CountingSort {
    public static void main(String[] args) {
        int a[] = { 3, 6, 4, 1, 3, 4, 1, 4, 2 };
        countingSort(a);

        // Optional: Print the sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int a[]) {
        // Find the maximum value in the array
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Initialize the count array
        int[] demo = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            demo[a[i]]++;
        }

        // Update count array with cumulative counts
        for (int i = 1; i < demo.length; i++) {
            demo[i] += demo[i - 1];
        }

        // Build the output array
        int[] output = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            output[demo[a[i]] - 1] = a[i];
            demo[a[i]]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, a, 0, a.length);
    }
}
