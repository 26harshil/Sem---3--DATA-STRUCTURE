import java.util.Scanner;

public class DoubleQuea {

    class DQc {
        int[] q;
        int front, rear, size;

        DQc(int size) {
            this.size = size;
            q = new int[size];
            this.front = -1;
            this.rear = -1;
        }

       
        public void dbEnquea_Rear(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Overflow");
                return;
            }
            if (rear == -1) { 
                rear = 0;
                front = 0;
            } else {
                rear = (rear + 1) % size;
            }
            q[rear] = data;
        }

       
        public void dbEnque_Front(int data) {
            if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
                System.out.println("Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            q[front] = data;
        }

     
        public int dbDequ_Rear() {
            if (front == -1) {
                System.out.println("Underflow");
                return -1;
            }
            int data = q[rear];
            if (front == rear) { 
                front = rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
            return data;
        }

      
        public int dbDequea_Front() {
            if (front == -1) {
                System.out.println("Underflow");
                return -1;
            }
            int data = q[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return data;
        }

      
        public void display() {
            if (front == -1) {
                System.out.println("Deque is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(q[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the deque: ");
        int size = scanner.nextInt();
        DoubleQuea doubleQuea = new DoubleQuea();
        DQc deque = doubleQuea.new DQc(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front end");
            System.out.println("2. Insert at rear end");
            System.out.println("3. Delete from front end");
            System.out.println("4. Delete from rear end");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front end: ");
                    int frontData = scanner.nextInt();
                    deque.dbEnque_Front(frontData);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear end: ");
                    int rearData = scanner.nextInt();
                    deque.dbEnquea_Rear(rearData);
                    break;
                case 3:
                    int deletedFront = deque.dbDequea_Front();
                    if (deletedFront != -1) {
                        System.out.println("Deleted element from front: " + deletedFront);
                    }
                    break;
                case 4:
                    int deletedRear = deque.dbDequ_Rear();
                    if (deletedRear != -1) {
                        System.out.println("Deleted element from rear: " + deletedRear);
                    }
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
