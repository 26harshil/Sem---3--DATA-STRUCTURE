import java.util.*;

class Quea {
    Node first;
    int size=0;

    class Node {

        int data;
        Node link;


        public Node(int data) {
            this.data = data;
            this.link = null;
             size++;
        }
    }

    public void push(int data) {
        Node newnode = new Node(data);

        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;
        return;

    }
    public void pop() {
        if (first == null) {
            System.out.println("stackUnderflow");
            return;
        }

        Node currnode = first;
        Node lastnode = first.link;
        while (lastnode.link != null) {
            lastnode = lastnode.link;
            currnode = currnode.link;

        }
        currnode.link = null;

    }
    public void display() {
        if (first == null) {
            System.out.println("the linked list underflow");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.link;

        }
        System.out.println("null");
    }

}
public class Lab11_2 {
    public static void main(String []args){
        Quea q1 = new Quea();
        
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(5);
        q1.push(6);
        q1.display();
        q1.pop();
        q1.display();

    }
}
