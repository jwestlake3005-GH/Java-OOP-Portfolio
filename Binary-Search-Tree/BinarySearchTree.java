public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    //Default constructor
    public BinarySearchTree() {
        super();
    }
    // Binary search tree operations
    public boolean search(T item){
        BinaryTreeNode<T> curr = root;

        while(curr != null){
            if(item.compareTo(curr.info) == 0){
                return true;
            }
            else if(item.compareTo(curr.info) < 0){
                curr = curr.lLink;
            }
            else {
                curr = curr.rLink;
            }
        }
        return false;
    }
    public void insert(T item){
        if(root == null){
            root = new BinaryTreeNode<T>(item);
            return;
        }
        BinaryTreeNode<T> curr = root;
        BinaryTreeNode<T> parent = null;

        while(curr != null){

            parent = curr;
            int compare = item.compareTo(curr.info);
            if(compare == 0){
                System.err.print("Item already in tree.");
                return;
            }
            else if(compare < 0){
                curr = curr.lLink;
            }
            else{
                curr = curr.rLink;
            }
        }
        if(item.compareTo(parent.info) < 0){
            parent.lLink = new BinaryTreeNode<T>(item);
        }
        else{
            parent.rLink = new BinaryTreeNode<T>(item);
        }

    }
    public void delete(T item){
        BinaryTreeNode<T> curr = root;
        BinaryTreeNode<T> parent = null;
        //
        while(curr != null && item.compareTo(curr.info) != 0){
            parent = curr;

            if(item.compareTo(curr.info) < 0)
                curr = curr.lLink;
            else
                curr = curr.rLink;
        }
        if(curr == null){
            System.err.print("Item was not found in Tree.");
            return;
        }
        //
        if(curr.lLink != null && curr.rLink != null){
            BinaryTreeNode<T> successorParent = curr;
            BinaryTreeNode<T> successor = curr.rLink;

            while(successor.lLink != null){
                successorParent = successor;
                successor = successor.lLink;
            }
            curr.info = successor.info;

            if(successorParent.lLink == successor){
                successorParent.lLink = successor.rLink;
            }
            else{
                successorParent.rLink = successor.rLink;
            }
        }
        else{
            BinaryTreeNode<T> child;

            if(curr.lLink != null){
                child = curr.lLink;
            }
            else{
                child = curr.rLink;
            }
            if(parent == null){
                root = child;
            }
            else if(parent.lLink == curr){
                parent.lLink = child;
            }
            else{
                parent.rLink = child;
            }
        }
    }
}   