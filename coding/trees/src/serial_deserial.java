import java.util.*;

public class serial_deserial extends BinaryTree{
    public static String serialize(Node root){
        StringBuilder sb = new StringBuilder();
        sHelper(root, sb);
        return sb.toString();
    }

    public static void sHelper(Node node, StringBuilder sb){
        if(node == null){
            sb.append("null,");
            return;
        }
        sb.append(node.value).append(",");
        sHelper(node.left, sb);
        sHelper(node.right, sb);
    }

    public Node deserial(String data){
        List<String> values = new LinkedList<>(Arrays.asList(data.split(",")));
        return dHelper(values);
    }

    public Node dHelper(List<String> values){
        if(values.isEmpty()) return null;

        String value = values.remove(0);
        if(value.equals("null")){
            return null;
        }
        Node node = new Node(Integer.parseInt(value));
        node.left = dHelper(values);
        node.right = dHelper(values);

        return node;
    }
}
