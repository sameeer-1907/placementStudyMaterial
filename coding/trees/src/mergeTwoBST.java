import java.util.*;

public class mergeTwoBST extends BST{

    public static void main(String[] args) {
        Node t1 = createBST1();
        Node t2 = createBST2();
        Node mergedTree = mergeBST(t1, t2);

        DFS.inOrderTraversal(mergedTree);
        System.out.println();

        DFS.preOrderTraversal(mergedTree);
        System.out.println();

        DFS.postOrderTraversal(mergedTree);
        System.out.println();
    }

    public static Node mergeBST(Node t1, Node t2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        inOrder(t1, l1);
        inOrder(t2, l2);

        l1.addAll(l2);
        Collections.sort(l1);

        return inOrderToBST(l1);
    }

    public static Node inOrderToBST(List<Integer> mergedList) {
        return buildBST(mergedList, 0, mergedList.size() - 1);
    }

    public static Node buildBST(List<Integer> mergedList, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node root = new Node(mergedList.get(mid));

        root.left = buildBST(mergedList, start, mid - 1);
        root.right = buildBST(mergedList, mid + 1, end);

        return root;
    }

    public static List<Integer> inOrder(Node root, List<Integer> ans) {
        if (root != null) {
            inOrder(root.left, ans);
            ans.add(root.value);
            inOrder(root.right, ans);
        }
        return ans;
    }

    public static Node createBST1() {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
        return root;
    }

    public static Node createBST2() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        return root;
    }
}

