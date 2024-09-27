import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    
	    int T = sc.nextInt();
	    
	    while(T > 0){
	        int len = sc.nextInt();
	        String s = sc.nextLine();
	        
	        Stack<Character> S = new Stack<>();
	        StringBuilder result = new StringBuilder();
	        
	        for(int i = 0; i < len; i++){
	            char ch = s.charAt(i);
	            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
	                S.push(ch);
	            } else {
	                while(!S.isEmpty()){
	                    result.append(S.pop());
	                }
	                result.append(ch);
	            }
	        }
	        
	        while(!S.isEmpty()){
	            result.append(S.pop());
	        }
	        
	        System.out.println(result.toString());
	        T--;
	    }
	    
	    sc.close();
	}

	}
}
