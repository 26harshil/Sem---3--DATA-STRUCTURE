import java.util.Scanner;

public class Cq {
    class Qc {
        int[] q;
        int front, rear, size;

        Qc(int size) {
            this.size = size;
            q = new int[size];
            this.front = -1;
            this.rear = -1;
        }

        public void cqinsert(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Overflow");
                return;
            } else {
                rear = (rear + 1) % size;
                q[rear] = data;

                if (front == -1) {
                    front = 0;
                }
            }
        }

        public int cqdelete() {
            if (front == -1) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int y = q[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return y;
        }

        public void display() {
            if (front == -1) {
                System.out.println("Queue is empty");
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
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();
        Cq cq = new Cq();
        Qc queue = cq.new Qc(size);

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int data = scanner.nextInt();
                    queue.cqinsert(data);
                    break;
                case 2:
                    int deleted = queue.cqdelete();
                    if (deleted != -1) {
                        System.out.println("Deleted element: " + deleted);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
