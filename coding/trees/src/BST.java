public class BST{
    public static Node root;

    public static class Node{
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

    public Node insert(Node node, int value){
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

    public int getHeight(Node node){
        if(node == null){
            return 0;
        } else{
            return node.height;
        }
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


    }
}