public class DLLtoBST extends BST {
    public static Node dllToBST(BST.Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.right;
        }
        return convertToBST(head, 0, count - 1);
    }

    private static Node convertToBST(BST.Node head, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node midNode = findMiddle(head, mid - start);

        midNode.left = convertToBST(head, start, mid - 1);
        midNode.right = convertToBST(midNode.right, mid + 1, end);

        return midNode;
    }

    private static Node findMiddle(Node head, int k) {
        Node current = head;
        for (int i = 0; i < k; i++) {
            current = current.right;
        }

        if (current.left != null) {
            current.left.right = null;
        }
        current.left = null;
        return current;
    }
}
