import java.util.Scanner;

class Stackof {
    int max;
    Character[] s;
    int top = 0;

    public Stackof(int max) {
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

    public void display() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println("Stack element [" + i + "] = " + s[i]);
            }
        }
    }

    public boolean same(String input) {
        int length = input.length();
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            push(input.charAt(i));
        }
        int start = (length % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < length; i++) {
            Character ch = pop();
            if (ch == null || ch != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

public class Stacksofmainrecognize {
    public static void main(String[] args) {
        Stackof st = new Stackof(100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String s1 = sc.next().trim();

        if (st.same(s1)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
