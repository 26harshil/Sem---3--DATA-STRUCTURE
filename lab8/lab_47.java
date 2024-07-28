import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostfix {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String s = sc.next();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                st.push(Character.getNumericValue(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                int op2 = st.pop();
                int op1 = st.pop();
                switch (c) {
                    case '+':
                        val = op1 + op2;
                        st.push(val);
                        break;
                    case '-':
                        val = op1 - op2;
                        st.push(val);
                        break;
                    case '*':
                        val = op1 * op2;
                        st.push(val);
                        break;
                    case '/':
                        val = op1 / op2;
                        st.push(val);
                        break;
                    case '%':
                        val = op1 % op2;
                        st.push(val);
                        break;
                }
            }
        }
        System.out.println("Result: " + st.pop());
    }
}
        
