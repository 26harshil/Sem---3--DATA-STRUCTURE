import java.util.ArrayList;
import java.util.LinkedList;

public class BST {
    int max = 0;
    int min = Integer.MAX_VALUE;

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node buildSearchTree(Node root, int key) {
        if (root == null) {
            root = new Node(key);
        } else if (root.val > key) {
            root.left = buildSearchTree(root.left, key);
        } else {
            root.right = buildSearchTree(root.right, key);
        }
        return root;
    }

    public Node insert(Node root, int val) {

        if (root == null)
            return root = new Node(val);

        else if (root.val < val) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

   


    public int maxy(Node root) {

        if (root == null)
            return max;
        if (root.val > max) {
            max = root.val;
        }

        maxy(root.left);
        maxy(root.right);

        return max;
    }

    public int miny(Node root) {

        if (root == null)
            return min;
        if (root.val < min) {
            min = root.val;
        }

        miny(root.left);
        miny(root.right);

        return min;
    }
 public Node  findmin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
     public Node findmax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }


  


    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 7, 3, 6, 8, 56, 12166, 848 };
        BST b = new BST();
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = b.buildSearchTree(root, a[i]);
        }
        b.inorder(root);
        System.out.println("  ");
        System.out.println("max value is = " + b.maxy(root));
        System.out.println();
        System.out.println("min value is =" + b.miny(root));

       

    }
}
