
import java.util.*;

public class Lab9_55 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(s.countStudents(students, sandwiches));
    }
}

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        for(int i=0; i<students.length; i++) {
            stu.add(students[i]);
        }
        Queue<Integer> sandwich = new LinkedList<>();
        for(int i=0; i<sandwiches.length; i++) {
            sandwich.add(sandwiches[i]);
        }
        int count = 0;
        while(!stu.isEmpty() && count < stu.size()) {
            if(stu.peek() == sandwich.peek()) {
                stu.remove();
                sandwich.remove();
                count = 0;
            }
            else {
                stu.add(stu.remove());
                count++;
            }
        }
        return count;
    }
}
