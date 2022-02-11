package DataStructures.Tree.BinaryTree;

public class InorderTraversal {
    static void traverse(TreeNode node) {
        /**Base Case : **/
        if (node == null) return;
        traverse(node.left);
        System.out.println(node.value);
        traverse(node.right);
    }
}
