import java.util.Scanner;
import java.util.Stack;

class Item {
    public int ipf(char c) {

        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 3;
        else if (c == '^')
            return 6;

        else if (c == '(')
            return 9;
        else if (c == ')')
            return 0;
        else
            return 7;

    }

    public int spf(char c) {
        if (c == '+' || c == '-')
            return 2;
        else if (c == '*' || c == '/')
            return 4;
        else if (c == '^')
            return 5;
        else if (c == '(')
            return 0;
        else
            return 8;
    }

    public int ranks(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
            return -1;

        else
            return 1;
    }
}

public class InfixtoPostfix {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Item i1 = new Item();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the infix string");
        String infix = sc.next().toLowerCase().trim();

        String polish = "";
        int rank = 0;
        infix += ')';
        int j = 0;
        s.push('(');

        while (j < infix.length()) {
            char next = infix.charAt(j);

            while (i1.spf(s.peek()) > i1.ipf(next)) {

                char temp = s.pop();
                polish += temp;
                rank += i1.ranks(temp);
                if (rank < 1) {
                    System.out.println("invalid");
                    return;
                }

            }
            if (i1.spf(s.peek()) != i1.ipf(next)) {
                s.push(next);
            } else {
                s.pop();
            }
            j++;
        }if (!s.isEmpty() || rank != 1) {
            System.out.println("invalid");
            return;
        } else {
            System.out.println("valid");
            System.out.println(polish);
            sc.close();
        }

    }
}
