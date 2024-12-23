class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = right = null;
    }
}

class ConstructTree {
    static int preIndex = 0;

    public static Node buildTree(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        Node root = new Node(preorder[preIndex]);
        preIndex++;

        if (inStart == inEnd) {
            return root;
        }

        int inIndex = search(inorder, inStart, inEnd, root.value);

        root.left = buildTree(preorder, inorder, inStart, inIndex - 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, inEnd);

        return root;
    }

    public static int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Method to print the inorder traversal of the tree
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        // Example input arrays
        int[] preorder = {10, 5, 3, 7, 15, 12, 18};
        int[] inorder = {3, 5, 7, 10, 12, 15, 18};

        // Build the tree
        Node root = buildTree(preorder, inorder, 0, inorder.length - 1);

        // Print the inorder traversal of the constructed tree
        System.out.print("Inorder traversal of constructed tree: ");
        printInOrder(root);
    }
}
