import java.util.ArrayList;
import java.util.List;

public class PrefixTree {
    public static void main(String[] args) {

    }
    static class TreeNode {
        char value;
        List<TreeNode> children;

        public TreeNode(char value) {
            this.value = value;

        }
        public void insert(String data) {
            if (data.length() == 0) {
                return;
            }
            if (children == null) {
                children = new ArrayList<>();
            }
            char c = data.charAt(0);
            TreeNode child = findNodeByChar(c);
            if (child == null) {
                child = new TreeNode(c);
                children.add(child);
            }
            child.insert(data.substring(1));

        }
        public TreeNode findNodeByChar(char c) {
            if (children != null) {
                for (TreeNode node: children) {
                    if (node.value == c) {
                        return node;
                    }

                }
            }
            return null;
        }
        public boolean containString(String str) {
            TreeNode current = this;
            for (int i = 0; i < str.length(); i++) {
                current = current.findNodeByChar(str.charAt(i));
                if (current == null) {
                    return false;
                }
            }
            return true;
        }

    }
}
