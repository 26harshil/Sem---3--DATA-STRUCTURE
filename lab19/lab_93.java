//insertion sort
public class lab_93 {
    public static void main(String[] args) {
        int a[] = { 1, 65, 23, 89, 21, 32 };
           //1 65 23  89 21 32 
        int i = 1;

        while (i < a.length) {

            int key = a[i];
            int j = i - 1;
              
            while (j>=0 && a[j]>key) {
                a[j+1] = a[j];
                j--;
                // System.out.print(a[j]+" ");
                // System.out.print(" "+a[j+1]);
                
            }
            System.out.println();
            
            
            a[j+1]= key;
                i++;

        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }

    }

}
