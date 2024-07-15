import java.util.Scanner;

class Linked {
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

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
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

    public void insertAtAnyIndex(int data, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        if (idx == 0) {
            newNode.link = first;
            first = newNode;
        } else {
            Node prec = first;
            for (int i = 1; i < idx; i++) {
                prec = prec.link;
            }
            newNode.link = prec.link;
            prec.link = newNode;
        }
        size++;
    }

    public void deleteAtAnyIndex(int idx) {
        if (first == null || idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            first = first.link;
        } else {
            Node prec = first;
            for (int i = 1; i < idx; i++) {
                prec = prec.link;
            }
            prec.link = prec.link.link;
        }
        size--;
    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("Underflow");
            return;
        }
        first = first.link;
        size--;
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("Underflow");
            return;
        }
        if (first.link == null) {
            first = null;
        } else {
            Node curr = first;
            while (curr.link.link != null) {
                curr = curr.link;
            }
            curr.link = null;
        }
        size--;
    }

    public Linked copyOfLinkedList() {
        Linked newLinked = new Linked();
        if (first == null) {
            return newLinked;
        }
        Node temp = first;
        while (temp != null) {
            newLinked.insertAtLast(temp.data);
            temp = temp.link;
        }
        return newLinked;
    }

    public boolean isSame(Linked other) {
        Node temp1 = this.first;
        Node temp2 = other.first;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.link;
            temp2 = temp2.link;
        }

        return temp1 == null && temp2 == null;
    }

    public void display() {
        if (first == null) {
            System.out.println("The linked list is empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class CopyOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked l1 = new Linked();
        Linked l2 = new Linked();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLinked List Operations Menu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert in Order");
            System.out.println("3. Insert at Last");
            System.out.println("4. Insert at Any Index");
            System.out.println("5. Delete at Any Index");
            System.out.println("6. Delete First");
            System.out.println("7. Delete Last");
            System.out.println("8. Display List");
            System.out.println("9. Check if Two Linked Lists are Same");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    int dataAtFirst = sc.nextInt();
                    l1.insertAtFirst(dataAtFirst);
                    break;
                case 2:
                    System.out.print("Enter data to insert in order: ");
                    int dataInOrder = sc.nextInt();
                    l1.insertInOrderList(dataInOrder);
                    break;
                case 3:
                    System.out.print("Enter data to insert at last: ");
                    int dataAtLast = sc.nextInt();
                    l1.insertAtLast(dataAtLast);
                    break;
                case 4:
                    System.out.print("Enter data to insert: ");
                    int dataAtAnyIndex = sc.nextInt();
                    System.out.print("Enter index to insert at: ");
                    int indexAtAnyIndex = sc.nextInt();
                    l1.insertAtAnyIndex(dataAtAnyIndex, indexAtAnyIndex);
                    break;
                case 5:
                    System.out.print("Enter index to delete: ");
                    int indexToDelete = sc.nextInt();
                    l1.deleteAtAnyIndex(indexToDelete);
                    break;
                case 6:
                    l1.deleteFirst();
                    break;
                case 7:
                    l1.deleteLast();
                    break;
                case 8:
                    l1.display();
                    break;
                case 9:
                    System.out.println("Enter elements for the second linked list:");
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter data: ");
                        int data = sc.nextInt();
                        l2.insertAtLast(data);
                    }
                    if (l1.isSame(l2)) {
                        System.out.println("Both linked lists are the same.");
                    } else {
                        System.out.println("The linked lists are not the same.");
                    }
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
