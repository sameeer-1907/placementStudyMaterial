import java.util.*;

public class rightView extends BST{
    public static void right_view(Node root){
        Queue<Node> queue =  new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int last = 0;
            for(int i=0; i<size; i++){
                Node node = queue.poll();
                last = node.value;

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            System.out.println(last);
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

        right_view(bst.root);

    }
}
