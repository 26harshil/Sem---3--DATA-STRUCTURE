import java.util.Scanner;

class Linkeof {
    int size = 0;
    int count = 0;

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

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;
            first.link = first;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }

        count++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;
            first.link = first; // Point to itself
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }

        count++;
    }

    public void insertAtAnyIndex(int data, int idx) {
        Node newNode = new Node(data);

        if (idx < 0 || idx > count) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            if (first == null) {
                first = newNode;
                last = newNode;
                first.link = first;
            } else {
                newNode.link = first;
                last.link = newNode;
                first = newNode;
            }
        } else {
            Node temp = first;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.link;
            }

            newNode.link = temp.link;
            temp.link = newNode;
            if (newNode.link == first) {
                last = newNode;
            }
        }

        count++;
    }

    public void deleteAtFirst() {
        if (first == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            System.out.println("The linked list is empty now");
            return;
        }

        Node temp = first.link;
        first = temp;
        last.link = first;

        count--;
    }

    public void deleteAtLast() {
        if (first == null) {
            System.out.println("The linked list is empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            System.out.println("The linked list is empty now");
            return;
        }
        Node temp = first;
        while (temp.link != last) {
            temp = temp.link;
        }
        last = temp;
        last.link = first;

        count--;
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = first;
        int count = 0;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
            count++;
        } while (temp != first);

        System.out.println(" (back to first)");
        System.out.println("The number of nodes is " + count);
    }
}

public class CircularLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linkeof list = new Linkeof();
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at Any Index");
            System.out.println("4. Delete at First");
            System.out.println("5. Delete at Last");
            System.out.println("6. Display List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    int dataFirst = scanner.nextInt();
                    list.insertAtFirst(dataFirst);
                    break;
                case 2:
                    System.out.print("Enter data to insert at last: ");
                    int dataLast = scanner.nextInt();
                    list.insertAtLast(dataLast);
                    break;
                case 3:
                    System.out.print("Enter data to insert at any index: ");
                    int dataIndex = scanner.nextInt();
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    list.insertAtAnyIndex(dataIndex, index);
                    break;
                case 4:
                    list.deleteAtFirst();
                    break;
                case 5:
                    list.deleteAtLast();
                    break;
                case 6:
                    list.display();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
