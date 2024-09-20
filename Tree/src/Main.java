
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Inserting nodes into the tree
        tree.insert('+'); // Let's set a root value
        tree.insert('*');
        tree.insert('/');
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');

        // Traversing the tree
        System.out.println("Traversing tree in preorder:");
        tree.traversePreOrder(tree.getRoot());
        System.out.println("\n");

        System.out.println("Traversing tree in inorder:");
        tree.traverseInOrder(tree.getRoot());
        System.out.println("\n");

        System.out.println("Traversing tree in postorder:");
        tree.traversePostOrder(tree.getRoot());
        System.out.println("\n");
    }
}
