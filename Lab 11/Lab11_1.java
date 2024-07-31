
import java.util.*;

class Linked {
    Node first;
    int size = 0;

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
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;

        }
        temp.link = newnode;

    }

    public void deleteAtAnyIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index do you want to delete");
        int idx = sc.nextInt();
        if (first == null) {
            System.out.println("stackUnderflow");
            return;
        } else if (idx == 0) {
            first = first.link;
            return;

        } else {
            Node prec = first;
            Node curr = first.link;
            for (int i = 1; i < idx; i++) {
                prec = prec.link;
                curr = curr.link;
            }
            prec.link = curr.link;
        }

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
            System.out.print(temp.data + "<-");
            temp = temp.link;

        }
        System.out.println("null");
    }

}

class Lab11_1 {
    public static void main(String[] args) {
        Linked l1 = new Linked();
        
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);
        l1.push(6);
        l1.display();

    }
}
