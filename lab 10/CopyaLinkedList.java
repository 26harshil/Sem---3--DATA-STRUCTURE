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

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);

        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;
        return;

    }

    public void insertATLast(int data) {

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

    public void InsertAtAnyindex(int data) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the index do you want to insert");
        int idx = sc.nextInt();
        Node newnode = new Node(data);

        if (first == null) {
            System.out.println("stackUnderflow");
            return;
        } else {
            Node prec = first;
            Node curr = first.link;

            for (int i = 0; i < idx; i++) {
                prec = prec.link;
                curr = curr.link;

            }
            prec.link = newnode;
            newnode.link = curr;
            return;

        }
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

    public void deleteFirst() {
        if (first == null) {
            System.out.println("stackUnderflow");
            return;
        }
        Node temp = first.link;

        first = temp;

    }

    public Linked theCopyOfLInkedList() {
        Linked newLinked = new Linked();

        if (first == null) {
            newLinked = null;
            return newLinked;

        }
        if (first == null) {
            System.out.println("underflow");

        } else {
            Node temp = first;
            while (temp != null) {
                newLinked.insertATLast(temp.data);
                temp = temp.link;
            }
        }
        return newLinked;
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



    public class CopyOfLinkedlist {
        public static void main(String[] args) {
            Linked l1 = new Linked();
            Linked l2;
            l1.insertAtFirst(1);
            l1.insertAtFirst(2);
            l1.insertAtFirst(3);
            l1.insertAtFirst(4);
            l1.insertAtFirst(5);
            l1.display();

            l2 = l1.theCopyOfLInkedList();
            l2.display();

        }
    }
}
