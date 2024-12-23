import java.util.*;

public class spiralLevelOrder extends BST{

    public static void spiralTraversal(Node root) {
        if (root == null) return; // Handle edge case for null root.

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            List<Node> level = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                level.add(curr);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            if (leftToRight) {
                level.forEach(node -> System.out.print(node.value + " "));
            } else {
                Collections.reverse(level);
                level.forEach(node -> System.out.print(node.value + " "));
            }

            leftToRight = !leftToRight;
            System.out.println();
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

        spiralTraversal(bst.root);
    }

}
