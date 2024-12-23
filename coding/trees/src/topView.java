import java.util.*;

public class topView extends BST{
    public static void top_view(Node root){

        Queue<NodeColumn> queue =  new LinkedList<>();
        Map<Integer, Integer> hash = new TreeMap<>();

        queue.offer(new NodeColumn(root, 0));

        while(!queue.isEmpty()) {
            NodeColumn present = queue.poll();
            Node curr = present.node;
            int col = present.col;

            if (!hash.containsKey(col)) {
                hash.put(col, curr.value);
            }
            if (curr.left != null) {
                queue.offer(new NodeColumn(curr.left, col - 1));
            }
            if (curr.right != null) {
                queue.offer(new NodeColumn(curr.right, col + 1));
            }
        }

        for(int i: hash.values()){
            System.out.println(i);
        }
    }

    static class NodeColumn{
        Node node;
        int col;

        NodeColumn(Node node, int col) {
            this.node = node;
            this.col = col;
        }
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(18);

        top_view(BST.root);
    }
}
