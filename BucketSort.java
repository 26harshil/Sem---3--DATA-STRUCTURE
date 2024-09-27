import java.util.ArrayList;

public class BucketSort {

    // Insertion sort to sort a bucket

    public static void bucketSort(float[] A) {
        int n = A.length;

        // Step 1: Create an array of empty buckets (lists)
        ArrayList<Float>[] B = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            B[i] = new ArrayList<>();
        }

        // Step 2: Insert elements into the respective buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * A[i]); // Assuming A[i] is in the range [0, 1)
            B[bucketIndex].add(A[i]);
        }

        // Step 3: Sort each bucket using insertion sort
        for (int i = 0; i < n; i++) {
            insertionSort(B[i]);
        }

        // Step 4: Concatenate all the sorted buckets
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < B[i].size(); j++) {
                A[index++] = B[i].get(j);
            }
        }
    }

    private static void insertionSort(ArrayList<Float> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            float key = bucket.get(i);
            int j = i - 1;

            // Move elements of bucket[0..i-1], that are greater than key, to one position
            // ahead
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j = j - 1;
            }
            bucket.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        float[] A = { 0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f };
        System.out.println("Original array:");
        for (float num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform bucket sort
        bucketSort(A);

        // Print sorted array
        System.out.println("Sorted array:");
        for (float num : A) {
            System.out.print(num + " ");
        }
    }
}
