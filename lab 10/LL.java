
public class LL {
    Node top;
    public int sizeoflink;
    LL(){
        sizeoflink=0;
    }

    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
            sizeoflink++;
        }
    }

    // at first
    public void InsertAtFirst(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;

        }
        newNode.link = top;
        top = newNode;
       
    }

    public void InsertAtLast(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            return;
        }
        Node currNode = top;
        while (currNode.link != null) {
            currNode = currNode.link;

        }
        currNode.link = newNode;
    
    }

    public void deleteAtFirst() {
        if (top == null) {
            System.out.println("lisnked list underflow");
            return;
        } else {
            top = top.link;
            sizeoflink--;
        }
    }

    public void deleteAtLast() {
        if (top == null) {
            System.out.println("lisnked list underflow");
            return;
        }sizeoflink--;
        if (top.link == null) {
            top = null;
            return;
        }else{
            Node secondlast = top;
            Node last = top.link;
            while (last.link != null) {
                last = last.link;
                secondlast = secondlast.link;
            }
            secondlast.link = null;
        }
       sizeoflink--;

    }

    public void printlist() {
        if (top == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = top;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.link;

        }
        System.out.println("null");

    }
    public void getsize(){
        System.out.println("the size is ="+sizeoflink);
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtFirst(3);
        list.InsertAtFirst(4);
        list.InsertAtLast(56);
        list.InsertAtFirst(98);
        list.deleteAtFirst();
        list.deleteAtLast();
        // list.deleteAtLast();
        list.printlist();
        list.getsize();
    }

}