
public class Main {
    public static void main(String[] args) {
        Node root = new Node(35);
        root = BinaryTreeSearch.insert(root, 28);
        root = BinaryTreeSearch.insert(root, 43);
        root = BinaryTreeSearch.insert(root, 14);
        root = BinaryTreeSearch.insert(root, 17);
        root = BinaryTreeSearch.insert(root, 38);
        root = BinaryTreeSearch.insert(root, 55);
        root = BinaryTreeSearch.insert(root, 40);
        root = BinaryTreeSearch.insert(root, 36);

        BinaryTreeSearch.binarySearchTree(root, 55);
        BinaryTreeSearch.binarySearchTree(root, 100); // Example for a value not in the tree
    }
}