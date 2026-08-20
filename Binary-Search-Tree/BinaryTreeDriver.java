public class BinaryTreeDriver {
    
    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        // Build binary search tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Binary Search Tree Demo");
        System.out.println("-----------------------");

        System.out.print("Inorder traversal: ");
        tree.inOrderTraversal();
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preOrderTraversal();
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postOrderTraversal();
        System.out.println();

        System.out.println("Number of nodes: " + tree.treeNodeCount());
        System.out.println("Number of leaves: " + tree.treeLeavesCount());
        System.out.println("Tree height: " + tree.treeHeight());

        System.out.println("Search for 40: " + tree.search(40));
        System.out.println("Search for 100: " + tree.search(100));

        System.out.println("\nDeleting 30...");
        tree.delete(30);

        System.out.print("Inorder after deletion: ");
        tree.inOrderTraversal();
        System.out.println();
    }
}
