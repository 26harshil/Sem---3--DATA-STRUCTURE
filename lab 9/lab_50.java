public class Q1 {
    static class Que {
        int[] q;
        int f = -1;
        int r = -1;
        int size = 0;

        Que(int size) {
            this.q = new int[size];
            this.size = size;
        }

        public void enquea(int data) {
            if (r >= size) {
                System.out.println("overflow");
                return;
            } else {
                r++;
                q[r] = data;
                if (f == -1) {
                    f = 0;
                    return;
                }
            }

        }


        public int deques() {
            if (f == -1 && f == r) {
                System.out.println("Quea is underflow");
                return 0;
            } else {
                int y = 0;
                y = q[f];
                f++;
                return y;
            }
        }

        public void display() {
            if (f == -1) {
                System.out.println("Quea is underflow");
                return;
            }
            int temp = f;
            while (temp != r + 1) {
                System.out.print(q[temp] + " ");
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        Que q1 = new Que(5);
        q1.enquea(1);
        q1.enquea(2);
        q1.enquea(3);
        q1.enquea(4);

        q1.display();
        System.out.println("the element is" + q1.deques());

        q1.display();


    }
}
