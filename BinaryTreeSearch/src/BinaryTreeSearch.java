public class BinaryTreeSearch {
    public static Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void binarySearchTree(Node root, int data) {
        if (root == null) {
            System.out.println("Value not found.");
            return;
        }

        if (root.value == data) {
            System.out.println("Value found: " + data);
        } else if (root.value > data) {
            System.out.println("Searching left...");
            binarySearchTree(root.left, data);
        } else {
            System.out.println("Searching right...");
            binarySearchTree(root.right, data);
        }
    }
}
