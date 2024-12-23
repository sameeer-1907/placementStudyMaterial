import java.util.LinkedList;
import java.util.Queue;

public class levelOrder extends BST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        levelOrderTraversal();

    }
    public static void levelOrderTraversal(){
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
