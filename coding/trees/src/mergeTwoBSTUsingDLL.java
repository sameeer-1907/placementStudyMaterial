public class mergeTwoBSTUsingDLL extends BSTtoDLL {
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

    public Node mergeDLL(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node head, current;
        if (list1.value <= list2.value) {
            head = list1;
            list1 = list1.right;
        } else {
            head = list2;
            list2 = list2.right;
        }
        current = head;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.right = list1;
                list1.left = current;
                list1 = list1.right;
            } else {
                current.right = list2;
                list2.left = current;
                list2 = list2.right;
            }
            current = current.right;
        }

        if (list1 != null) {
            current.right = list1;
            list1.left = current;
        }
        if (list2 != null) {
            current.right = list2;
            list2.left = current;
        }

        return head;
    }


    // Merge two BSTs  
    public Node mergeBSTs(Node root1, Node root2) {

        Node list1 = bstToDLL(root1);
        Node list2 = bstToDLL(root2);

        Node mergedList = mergeDLL(list1, list2);

        return DLLtoBST.dllToBST(mergedList);
    }

    public void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        mergeTwoBSTUsingDLL merger = new mergeTwoBSTUsingDLL();

        Node t1 = createBST1();
        Node t2 = createBST2();

        Node mergedBST = merger.mergeBSTs(t1, t2);

        System.out.println("Merged BST:");
        merger.inorderTraversal(mergedBST);
    }
}