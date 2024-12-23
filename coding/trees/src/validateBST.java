public class validateBST extends BST{

    public boolean isValidBST(Node root){
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean helper(Node node, int min, int max){
        if(node == null){
            return true;
        }

        if(node.value <= min || node.value >= max){
            return false;
        }
        return helper(node.left, min, node.value) && helper(node.right, node.value, max);
    }
}
