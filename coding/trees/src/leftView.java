import java.util.*;

public class leftView extends BST{
    public static void left_view(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                Node node = queue.poll();

                if (i == 1) {
                    System.out.println(node.value);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
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

        left_view(bst.root);

    }
}
