import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        bst.levelOrderTraversal();

    }
    public static class BST{
        private Node root;

        public class Node{
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
            } else if(value > node.value){
                node.right = insert(node.right, value);
            }
            return node;
        }

        public void levelOrderTraversal(){
            if(root == null){
                return;
            }
            Queue<Node> queue =  new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node current = queue.poll();
                System.out.println(current.value + " ");
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            System.out.println();
        }
    }
}
