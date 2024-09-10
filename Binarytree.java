import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int idx = -1;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) return null;

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public void preorder(Node root) {

        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);


    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(currNode);
                }
            } else {
                System.out.print(currNode.data);
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);


            }


        }
    }

    public int countOfNode(Node root) {
        if (root == null) return 0;

        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);

        return leftNode + rightNode + 1;
    }

    public int sumOfNode(Node root) {
        if (root == null) return 0;

        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum + rightSum + root.data;
    }

    public int heightOfNode(Node root) {
        if (root == null) return 0;

        int leftheight = heightOfNode(root.left);
        int rightheight = heightOfNode(root.right);
        int height = Math.max(leftheight, rightheight) + 1;
        return height;
    }

    //not so good
    public int d1(Node root) {
        if (root == null) return 0;
        int diam1 = d1(root.left);
        int diam2 = d1(root.right);
        int diam3 = heightOfNode(root.left) + heightOfNode(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));


    }

    class treeInfo {
        int ht;
        int diam;

        treeInfo(int ht, int diam) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public treeInfo diameter(Node root) {
        if (root == null) return new treeInfo(0, 0);

        treeInfo left = diameter(root.left);
        treeInfo right = diameter(root.right);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));
        treeInfo myinfo = new treeInfo(myheight, mydiam);
        return myinfo;
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
//        System.out.println();
//        tree.levelOrder(root);
        System.out.println();
        System.out.println("the total number is = " + tree.countOfNode(root));
        System.out.println();
        System.out.println("the sum number is = " + tree.sumOfNode(root));
        System.out.println();
        System.out.println("the total height is = " + tree.heightOfNode(root));
        System.out.println(tree.d1(root));
        System.out.println(tree.diameter(root).diam);

    }
}
