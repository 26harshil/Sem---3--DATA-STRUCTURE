import java.util.Scanner;
//
public class lab_94 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = { 1, 65, 23, 89, 21, 32, 12, 32, 581, 23, 295 };

    for (int i = 0; i < a.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[min] > a[j]) {
          min = j;
        }
      }
      int temp = a[min];
      a[min] = a[i];

      a[i] = temp;

    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

}
