import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Stack;

public class Codechef {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test > 0){
            
            int n = sc.nextInt();
            String str = sc.next();

            Stack<Character> s = new Stack<>();

            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < str.length() ; i++){

                if("aeiou".indexOf(str.charAt(i)) > -1){
                    while(!s.isEmpty()){
                        ans.append(s.pop());
                    }
                    ans.append(str.charAt(i));
                   
                    for(char c : ans.toString().toCharArray()){
                        s.push(c);
                    }
                    ans.setLength(0);
                }else{
                    s.push(str.charAt(i));
                }
            }

            while (!s.isEmpty()){
                ans.append(s.pop());
            }

            System.out.println(ans.reverse().toString());
            test--;
        }

    }
}
