public class Quea {

    int r = -1;
    int f = -1;
    int n = 0;
    int[] q;

    Quea(int size) {
        this.n = size;
        this.q = new int[size];
    }

    public void display() {
        if (f == -1) {
            System.out.println("underflow");
            return;
        } else {
            for (int i = f; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
        }
    }

    public void cqinsert(int data) {
        if (r >= n)
            r = 0;
        else
            r++;

        if (r == f) {
            System.out.println("overflow");
            return;
        }
        q[r] = data;
        if (f == -1) {
            f = 0;
            return;
        }
    }

    public int cqdelete() {
        if (f == -1) {
            System.out.println("undrflow");
            return 0;
        }
        int y = q[f];
        if (f == r) {
            f = r = 0;
            return y;
        }
        if (f == n) {
            f = 0;
        } else {
            f++;

        }
        return q[f];
    }

    public static void main(String[] args) {
        Quea q1 = new Quea(5);
        q1.cqinsert(1);
        q1.cqinsert(2);
        q1.cqinsert(3);
        q1.cqinsert(4);
        q1.cqinsert(5);
        q1.display();
        q1.cqdelete();
        q1.cqdelete();
        System.out.println();
        q1.display();
        System.out.println();
        q1.cqinsert(9);
        q1.cqinsert(8);
        q1.display();

    }
}
