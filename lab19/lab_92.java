import java.util.Scanner;

public class lab_92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 65, 23, 89, 21, 32, 12, 32, 581, 23, 295 };
        System.out.println("enter the element for the search");
    
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1; j<a.length-1 ; j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;

                }
            }
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
