public class Quicksort {
    public static void quiksort(int a[], int low, int high) {
        if (low < high) {
            int piidx = partiton(a, low, high);

            quiksort(a, low, piidx - 1);
            quiksort(a, piidx + 1, high);
        }

    }

    public static int partiton(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(a[j]<pivot){
                i++;
                //swap
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp = a[i];
        a[i]=pivot;
        a[high]=temp;

        return i;
    }

    public static void main(String[] args) {
        int a[] = { 5, 2, 9, 1, 5, 6 };
        int n = a.length;
        quiksort(a, 0, n - 1);
        for (int i = 0; i < a.length; i++) {
           System.out.print(a[i]+" ");
        }

    }

}
