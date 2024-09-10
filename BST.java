import java.util.ArrayList;
import java.util.LinkedList;

public class BST {
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

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public boolean search(Node root, int key) {//0(H)
        if (root == null) return false;
        if (root.val > key) {
            return search(root.left, key);

        } else if (root.val < key) {
            return search(root.right, key);
        } else {
            return true;  // Key found
        }
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = delete(root.left, key);
        } else if (root.val < key) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: Node is a leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node has two children
            Node IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }

    public Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void range(Node root, int x, int y) {
        if (root == null) return;
        else if (root.val >= x && root.val <= y) {
            range(root.left, x, y);
            System.out.print(root.val + " ");
            range(root.right, x, y);

        } else if (root.val >= y) {
            range(root.left, x, y);
        } else {
            range(root.right, x, y);
        }
    }

    public void pathToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        //leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        }//non-leaf
        else {
            pathToLeaf(root.left, path);
            pathToLeaf(root.right, path);

        }
        path.remove(path.size() - 1);

    }

    public void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int a[] = {-10,-3,0,5,9};

        BST b = new BST();
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = b.buildSearchTree(root, a[i]);
        }
   b.inorder(root);
//        System.out.println();
//        if (b.search(root, 5)) {
//            System.out.println("founded");
//        } else {
//            System.out.println("not found");
//        }
////       root= b.delete(root, 7);
////        System.out.println("Tree after deleting 7:");
////        b.inorder(root);
////        System.out.println();
////
////        // Delete node with value 5
////        root = b.delete(root, 5);
////        System.out.println("Tree after deleting 5:");
////        b.inorder(root);
////        System.out.println();
////
////        System.out.println(root.val);
//        b.range(root, 1, 4);
//        b.pathToLeaf(root, new ArrayList<>());


    }
}
