import java.util.Scanner;

class Stackbrac {
    private char[] stackArray;
    private int top;

    public Stackbrac(int capacity) {
        stackArray = new char[capacity];
        top = -1;
    }

    public void push(char item) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = item;
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public char peek() {
        if (top == -1) {
            return '\0';
        } else {
            return stackArray[top];
        }
    }

    public static int checkBracket(String s) {
        Stackbrac stack = new Stackbrac(s.length());

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

public class Lab7_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bracket strings:");

        int numInputs = sc.nextInt();
        sc.nextLine();

        while (numInputs > 0) {
            System.out.println("Enter a bracket string:");
            String input = sc.nextLine().trim();
            System.out.println(Stackbrac.checkBracket(input));
            numInputs--;
        }

        sc.close();
    }
}
