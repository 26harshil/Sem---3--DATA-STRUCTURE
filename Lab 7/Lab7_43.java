import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        throws java.lang.Exception

        Stack < Character > s = new Stack < > ();

        {
            // your code goes here
            String n = sc.next();
            StringBuilder sb = new StringBuilder(n);
           
            for (int i = 0; i < n.length(); i++) {

               if (n.charAt(i) == 'a' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'e' || n.charAt(i) == 'u') {
                    
                   for(int k=0; k<i; k++){
                       
                       s.appand(sb);
                   }
             
                    
                    
                }else{
                    s.push(sb);
                }


            }

        }

    }
}
}
