public class BSTtoDLL extends BST{
     Node headLL;
     Node prev;

    public static Node bstToDLL(Node node){
        BSTtoDLL obj = new BSTtoDLL();
        if(node == null){
            return null;
        }

        bstToDLL(node.left);
        if(obj.prev == null){
            obj.headLL = node;
        } else{
            node.left = obj.prev;
            obj.prev.right = node;
        }
        obj.prev = node;
        bstToDLL(node.right);
        return obj.headLL;
    }

    public void printDLL(){
        Node node = headLL;
        while(node != null){
            System.out.println(node.value);
            node = node.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BSTtoDLL tree = new BSTtoDLL();

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        tree.bstToDLL(root);

        tree.printDLL();
    }
}
