public class HeapSort {
    public static void main(String[] args) {
        int a[] = { 1, 232, 32595, 15495, 6294, 2, 56223, 295623, 326, 6, 18, 495, 89 };
        heapsort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void heapsort(int arr[]) {
        int n = arr.length;

        // Step 1: Build max heap
        buildmaxheap(arr);

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (maximum) to the end
            swap(arr, 0, i);

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted with node i, n is size of heap
    public static void heapify(int arr[], int n, int i) {
        int maxindex = i;
        int leftchild = 2 * i + 1;
        int rightchild = 2 * i + 2;

        // If left child is larger than root
        if (leftchild < n && arr[leftchild] > arr[maxindex]) {
            maxindex = leftchild;
        }

        // If right child is larger than maxindex
        if (rightchild < n && arr[rightchild] > arr[maxindex]) {
            maxindex = rightchild;
        }

        // If maxindex is not root
        if (maxindex != i) {
            swap(arr, i, maxindex);

            // Recursively heapify the affected subtree
            heapify(arr, n, maxindex);
        }
    }

    // Swap two elements in the array
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Build a max heap from the array
    public static void buildmaxheap(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
}
