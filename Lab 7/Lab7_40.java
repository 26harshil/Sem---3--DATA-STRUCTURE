import java.util.Arrays;
import java.util.Scanner;

class Stacksclass {

    int max;
    Character[] s;
    int top = 0;

    public Stacksclass(int max) {
        this.max = max;
        s = new Character[max];
    }

    public void push(Character data) {
        if (top >= max) {
            System.out.println("Stack overflow");
        } else {
            s[top] = data;
            top++;
        }
    }

    public Character pop() {
        if (top <= 0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            top--;
            return s[top];
        }
    }

    public Character peep(int i) {
        if (i < 0 || i >= top) {
            System.out.println("Invalid peep index");
            return null;
        } else {
            return s[top - i - 1];
        }
    }
}

class Lab7_40 {
    public static void main(String[] args) {
        Stacksclass s1 = new Stacksclass(6);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String a = sc.next();

        int counta = 0;
        int countb = 0;
 boolean flag=true;
        for (int i = 0; i < a.length(); i++) {
            s1.push(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {

            if (s1.peep(i) == 'a') {
                counta++;
            } else if (s1.peep(i) == 'b') {
                countb++;
            } else {
               
                flag=false;
                break;
            
            }
        }
        if(flag==true){
            if (counta > 1 && countb > 1) {
                if (counta == countb) {
                    System.out.println("the string is valid for your input");
                }
            }
        }
         else if(flag==false) {
            System.out.println("it is a invalid string");
        }else{
            System.out.println("your string is not a good");
        }

    }

}
