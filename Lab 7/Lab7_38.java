import java.util.Scanner;

class Stackof {
    Scanner sc = new Scanner(System.in);
    int max;
    int[] s;
    int top = 0;

    public Stackof(int max) {
        this.max = max;
        s = new int[max];
    }

    public void push(int data) {
        if (top >= max) {
            System.out.println("Stack overflow");
        } else {
            s[top] = data;
            top++;
        }
    }

    public int pop() {
        if (top <= 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            top--;
            return s[top];
        }
    }

    public int peep() {
        System.out.println("Enter index to peep:");
        int idx = sc.nextInt();
        if (top - idx <= 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return s[top - idx - 1];
        }
    }

    public void change() {
        System.out.println("Enter index to change:");
        int idx = sc.nextInt();
        System.out.println("Enter new value:");
        int x = sc.nextInt();
        if (top - idx <= 0) {
            System.out.println("Stack underflow");
        } else {
            s[top - idx - 1] = x;
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
}

public class StacksOpre {
    public static void main(String[] args) {
        Stackof stack = new Stackof(5);
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Change");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to push:");
                    int value = sc.nextInt();
                    stack.push(value);
                    stack.display();
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != 0) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    stack.display();
                    break;
                case 3:
                    int peepedValue = stack.peep();
                    if (peepedValue != 0) {
                        System.out.println("Peeped value: " + peepedValue);
                    }
                    stack.display();
                    break;
                case 4:
                    stack.change();
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
