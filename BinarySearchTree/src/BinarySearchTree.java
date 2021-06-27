/**
 * Ability to add 22, 40, 11, 3, 16, 60, 95, 65, 63, 67 in the binary search tree
 *
 * @author: SAYANI KOLEY
 * @since: 27.06.2021
 */

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
            return;
        }

        else {
            Node current = root;
            Node parent = null;
            while(true) {
                parent = current;
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inorderTraversal(Node node) {
        if(root == null)
            System.out.println("Tree is empty");
        else {
            if(node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right != null)
                inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binary = new BinarySearchTree();

        binary.insert(56);
        binary.insert(30);
        binary.insert(70);
        binary.insert(22);
        binary.insert(40);
        binary.insert(11);
        binary.insert(3);
        binary.insert(16);
        binary.insert(60);
        binary.insert(95);
        binary.insert(65);
        binary.insert(63);
        binary.insert(67);

        binary.inorderTraversal(binary.root);
    }
}
