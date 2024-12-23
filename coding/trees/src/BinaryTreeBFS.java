import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {
    private Node root;

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void BFS(){
        if(root == null){
            return;
        }
        Queue<Node> queue =  new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.value + " ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeBFS tree =  new BinaryTreeBFS();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);
        System.out.println("BFS (Level Order Traversal):");
        tree.BFS();
    }
}
