import java.util.Scanner;

class Linkeof {
    
    int size = 0;

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }

    }
    Node first = null;
    Node last = null;   

    public void insertATLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = first;
            first.link = first;
            last.link = first;

            return;
        } else {

            Node temp = first;

            newNode.link = first;
            while (temp.link != first) {

                temp = temp.link;
                     }
            last = temp;
            last.link  = newNode;
          System.out.println(temp.data);
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = first;
            first.link = first;
            return;
        } 

            Node temp = first;

            while (temp.link != first) {
                temp = temp.link;
            }
            temp.link = newNode;
            newNode.link = first;
            first = newNode;
        
    }

    // public void insertInOrderList(int data) {
    // Node newNode = new Node(data);
    // if (first == null || first.data >= newNode.data) {
    // newNode.link = first;
    // first = newNode;
    // size++;
    // return;
    // }

    // Node pred = first;
    // while (pred.link != null && pred.link.data < newNode.data) {
    // pred = pred.link;
    // }

    // newNode.link = pred.link;
    // pred.link = newNode;
    // size++;
    // }

    public void makeCircular() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        last = temp;
        last.link = first;
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = first;
        int count = 0;
            while (temp.link != first) {
                System.out.print(temp.data + " -> ");
                count++;
                temp = temp.link;
                    
            } 
            
       
            System.out.println(temp.data+ " -> (back to first)");
            System.out.println("the number of a node is " + count);

           
   
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkeof list = new Linkeof();

        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(999);


        list.display();
    }
}
