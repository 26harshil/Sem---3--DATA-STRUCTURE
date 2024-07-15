import java.util.Scanner;

class Linkeof {
    Node first;
    int size = 0;

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
        size++;
    }

    public void insertInOrderList(int data) {
        Node newNode = new Node(data);
        if (first == null || first.data >= newNode.data) {
            newNode.link = first;
            first = newNode;
            size++;
            return;
        }

        Node pred = first;
        while (pred.link != null && pred.link.data < newNode.data) {
            pred = pred.link;
        }

        newNode.link = pred.link;
        pred.link = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
        size++;
    }

    public void makeCircular() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = first;
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = first;
        int count=0;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
            count++;
        } while (temp != first);
        System.out.println("(back to first)");
        System.out.println("the number of a node is "+ count);
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkeof list = new Linkeof();
        int choice, data;

        while (true) {
            System.out.println("\n1. Insert at first");
            System.out.println("2. Insert in order");
            System.out.println("3. Insert at last");
            System.out.println("4. Make circular");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    data = scanner.nextInt();
                    list.insertAtFirst(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert in order: ");
                    data = scanner.nextInt();
                    list.insertInOrderList(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert at last: ");
                    data = scanner.nextInt();
                    list.insertAtLast(data);
                    break;
                case 4:
                    list.makeCircular();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
