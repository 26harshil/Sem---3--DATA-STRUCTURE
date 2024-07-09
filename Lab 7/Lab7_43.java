import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef
{

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // your code goes here
        Stack < Character > s = new Stack < Character > ();
        String n = sc.next().trim();
        StringBuilder str = new StringBuilder(n);

        for (int i = 0; i < n.length(); i++) {

            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                if (i == 0) {
                    continue;
                }
                int j = 0;
                while (j != i) {
                    s.push(str.charAt(i));
                    s.add(0,str.charAt(i));
                    j++;
                    s.pop();
                }

            }
        }


    }
}
