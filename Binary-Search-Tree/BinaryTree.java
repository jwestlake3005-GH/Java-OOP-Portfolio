import java.util.Stack;
public abstract class BinaryTree<T> implements BinaryTreeADT<T> {

    //Definition of the BinaryTreeNode class

    protected class BinaryTreeNode<T> implements Cloneable{
    public T info;
    public BinaryTreeNode<T> lLink;
    public BinaryTreeNode<T> rLink;

    //Default constructor
    public BinaryTreeNode() {
        info = null;
        lLink = null;
        rLink = null;
    }
    //Alternate constructor
    public BinaryTreeNode(T item) {
        info = item;
        lLink = null;
        rLink = null;
    }
    //Alternate constructor
    public BinaryTreeNode(T item, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        info = item;
        lLink = left;
        rLink = right;
    }
    public Object clone() {
        BinaryTreeNode<T> copy = null;
        try {
        copy = (BinaryTreeNode<T>) super.clone();
        }
        catch (CloneNotSupportedException e) {
        return null;
        }
        return copy;
        }
    public String toString() {
        return info.toString();
        }
        }
        //Instance variable for class BinaryTree
        protected BinaryTreeNode<T> root;
        //Default constructor
    public BinaryTree() {
        root = null;
    }
    public Object clone() {
        BinaryTree<T> copy = null;
        try {
        copy = (BinaryTree<T>) super.clone();
        }
        catch (CloneNotSupportedException e) {
        return null;
        }
        if (root != null)
        copy.root = copyTree(root);
        return copy;
    }
    private BinaryTreeNode<T> copyTree(BinaryTreeNode<T> otherTreeRoot) {
        BinaryTreeNode<T> temp;
        if (otherTreeRoot == null)
            temp = null;
        else {
            temp = (BinaryTreeNode<T>) otherTreeRoot.clone();
            temp.lLink = copyTree(otherTreeRoot.lLink);
            temp.rLink = copyTree(otherTreeRoot.rLink);
        }
        return temp;
    }
    public boolean isEmpty() {
        return (root == null);
    }
    public int treeHeight() {
        return height(root);
    }
    //helper method called by treeHeight
    private int height(BinaryTreeNode<T> t) {
        if (t == null)
        return 0;
        else if (t.lLink == null && t.rLink == null)
        return 0;
        else
        return 1 + Math.max(height(t.lLink), height(t.rLink));
    }
    public int treeNodeCount() {
        if(root == null){
            return 0;
        }

        int count = 0;
        Stack<BinaryTreeNode<T>> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()) {
            BinaryTreeNode<T> curr = stack.pop();
            count++;

            if(curr.rLink != null){
                stack.push(curr.rLink);
            }
            if(curr.lLink != null) {
                stack.push(curr.lLink);
            }
        }
        return count;
    }
    public void destroyTree() {
        root = null;
    }
    // Iterative binary tree operations
    public int treeLeavesCount(){
        if(root == null){
            return 0;
        }
        int count = 0;
        Stack<BinaryTreeNode<T>> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTreeNode<T> curr = stack.pop();

            if(curr.lLink == null && curr.rLink == null){
                count++;
            }
            if(curr.rLink != null){
                stack.push(curr.rLink);
            }
            if(curr.lLink != null){
                stack.push(curr.lLink);
            }
        }
        return count;
    }
    public void inOrderTraversal(){
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        BinaryTreeNode<T> curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.lLink;
            }
            curr = stack.pop();
            System.out.print(curr.info + " ");
            curr = curr.rLink;
        }
    }
    public void preOrderTraversal(){
        if(root == null){
            return;
        }

        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            BinaryTreeNode<T> curr = stack.pop();
            System.out.print(curr.info + " ");

            if(curr.rLink != null){
                stack.push(curr.rLink);
            }
            if(curr.lLink != null){
                stack.push(curr.lLink);
            }
        }
    }
    public void postOrderTraversal(){
        if(root == null){
            return;
        }
        Stack<BinaryTreeNode<T>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<T>> stack2 = new Stack<>();

        stack1.push(root);

        while(!stack1.isEmpty()){
            BinaryTreeNode<T> curr = stack1.pop();
            stack2.push(curr);

            if(curr.lLink != null){
                stack1.push(curr.lLink);
            }
            if(curr.rLink != null){
                stack1.push(curr.rLink);
            }
        }
        while(!stack2.isEmpty()){
            BinaryTreeNode<T> curr = stack2.pop();
            System.out.print(curr.info + " ");
        }
    }
    //abstract methods
    public abstract boolean search(T item);
    public abstract void insert(T item);
    public abstract void delete(T item);
}