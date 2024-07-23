import java.util.Scanner;
import java.util.Stack;

class Itemes{
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

public class InfixToPreFix {
    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();
        Itemes i1 = new Itemes();

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the infix string:");
        String sa = sc.next().toLowerCase().trim();
        StringBuilder s2 = new StringBuilder(sa);

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '(') {
                s2.setCharAt(i, ')');
            } else if (s2.charAt(i) == ')') {
                s2.setCharAt(i, '(');
            }else continue;
        }
        StringBuilder infix =  new StringBuilder(s2);
        infix =s2.reverse();

        System.out.println(infix);


        StringBuilder  polish = new StringBuilder();
        int rank = 0;
        infix.append(')');
        int j = 0;
        s.push('(');

        while (j < infix.length()) {
            char next = infix.charAt(j);

            while (i1.spf(s.peek()) > i1.ipf(next)) {

                char temp = s.pop();
                polish.append(temp);
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
            System.out.println(polish.reverse());
            sc.close();
        }

    }
}
