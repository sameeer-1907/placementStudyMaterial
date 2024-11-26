public class BST{
    private Node root;

    private static class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.height = 1;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node ==  null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        } else if(value > node.value){
            node.right = insert(node.right, value);
        }
        node.height = 1+Math.max(getHeight(node.left), getHeight(node.right));

        return node;
    }

    private int getHeight(Node node){
        if(node == null){
            return 0;
        } else{
            return node.height;
        }
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
        System.out.println();
    }
    public void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.println(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
        System.out.println();
    }
    public void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
        System.out.println();
    }
    public void postOrderTraversal(Node node){
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BST bst = new BST();

        // Inserting values into the BST
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        // Display the BST in different orders
        System.out.println("Inorder traversal:");
        bst.inOrderTraversal();

        System.out.println("Level order traversal:");
    }
}