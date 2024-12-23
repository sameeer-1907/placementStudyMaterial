import java.util.Stack;

public class DFS extends BST{

    public static void inOrderTraversal(){
        inOrderTraversal(root);
        System.out.println();
    }
    public static void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(){
        preOrderTraversal(root);
        System.out.println();
    }
    public static void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(){
        postOrderTraversal(root);
        System.out.println();
    }
    public static void postOrderTraversal(Node node){
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public static void iterative_preOrder(){
        iterative_preOrder(root);
    }
    public static void iterative_preOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            System.out.print(curr.value + " ");
            if(curr.right != null){
                st.push(curr.right);
            }
            if(curr.left != null){
                st.push(curr.left);
            }
        }
    }

    public static void iterative_inOrder(){
        iterative_inOrder(root);
    }
    public static void iterative_inOrder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.value + " ");
            curr = curr.right;
        }
    }

    public static void iterative_postOrder(){
        iterative_postOrder(root);
    }
    public static void iterative_postOrder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty()) {
            Node curr = st1.pop();
            st2.push(curr);
            if (curr.left != null) {
                st1.push(curr.left);
            }
            if (curr.right != null) {
                st1.push(curr.right);
            }
        }

        while (!st2.isEmpty()) {
            System.out.print(st2.pop().value + " ");
        }
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        System.out.println("Inorder traversal:");
        postOrderTraversal();
        iterative_postOrder();

    }
}
