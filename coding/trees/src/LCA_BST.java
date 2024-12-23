public class LCA_BST extends BST {

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (root.value > p.value && root.value > q.value) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.value < p.value && root.value < q.value) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;

    }
}
    /*while(root != null){
        if(root.value > p.value && root.value > q.value){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(root.value < p.value && root.value < q.value){
            return lowestCommonAncestor(root.right, p, q);
        } else{
            return root;
        }
    }
    return null; */

