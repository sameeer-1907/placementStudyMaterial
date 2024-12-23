import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class verticalOrder extends BST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(18);

        List<List<Integer>> result = verticalOrderTraversal(bst.root);
        System.out.println(result);
    }

    public static class NodeColumn {
        Node node;
        int col;
        int row;

        NodeColumn(Node node, int col, int row) {
            this.node = node;
            this.col = col;
            this.row = row;
        }
    }

    public static List<List<Integer>> verticalOrderTraversal(Node root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<NodeColumn> queue =  new LinkedList<>(); // to store the level order of the tree
        Map<Integer, List<NodeColumn>> columnMap = new TreeMap<>(); //to sort them acc to the columns -1,0,1,2

        queue.offer(new NodeColumn(root, 0,0));

        while(!queue.isEmpty()){
            NodeColumn present = queue.poll(); // pop the root and then keep popping and add to columnMap
            Node curr = present.node;
            int col = present.col;
            int row = present.row;

            columnMap.putIfAbsent(col, new ArrayList<>());
            columnMap.get(col).add(present);

            if(curr.left != null){ //now traverse the left of the popped node
                queue.offer(new NodeColumn(curr.left, col-1, row+1)); //add the node to the queue and as it is left the col will be -1 to the present col value
            }
            if(curr.right != null){ //now traverse the right of the popped node
                queue.offer(new NodeColumn(curr.right, col+1, row+1)); //add the node to the queue and as it is right the col will be +1 to the present col value
            }
        }

        for(List<NodeColumn> nodeColRow: columnMap.values()){
            nodeColRow.sort((a,b) -> { // this sort return 0 if they are equal returns -1 if a > b and 1 if b > a
                if(a.row != b.row){
                    return a.row - b.row;
                    } else{
                        return a.node.value - b.node.value;
                    }
            });
            List<Integer> sortedValues = new ArrayList<>();
            for(NodeColumn nodeColumn: nodeColRow){
                sortedValues.add(nodeColumn.node.value);
            }
            result.add(sortedValues);
        }
        return result;
    }
}
