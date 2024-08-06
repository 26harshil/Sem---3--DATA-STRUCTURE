import java.util.Scanner;

public class lab_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,65,23,89,21,32,12,32,581,23,295};
        System.out.println("enter the element for the search");
        int key = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                System.out.println("the index found at" +i);
                return;
            }
        }
    }
    
}
