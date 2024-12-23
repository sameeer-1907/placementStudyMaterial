import java.util.*;

public class bottomView extends verticalOrder{

    public static void bottom_view(Node root){
        Queue<NodeColumn> queue =  new LinkedList<>();
        Map<Integer, Integer> hash = new TreeMap<>();

        queue.offer(new NodeColumn(root, 0,0));

        while(!queue.isEmpty()){
            NodeColumn present = queue.poll();
            Node node = present.node;
            int col = present.col;
            int row = present.col;
            hash.put(col, node.value);

            if(node.left != null){
                queue.offer(new NodeColumn(node.left, col-1, row+1));
            }
            if(node.right != null){
                queue.offer(new NodeColumn(node.right, col+1, row+1));
            }
        }

        for(int i : hash.values()){
            System.out.println(i);
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

        bottom_view(BST.root);
    }
}
