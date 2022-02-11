package DataStructures.Tree.BinaryTree;

public class BinaryTree {
    public static void main(String[] args) {

    }

    static TreeNode search(int value, TreeNode node) {
        //Base case - If the node is nonexistent, or we found value we are looking for
        if (node == null || node.value == value) return node;
            //if the value is less than current node, perform search on left child
        else if (value < node.value) return search(value, node.left);
            //if the value is greater than current node, perform search operation on the right
        else return search(value, node);
    }

    static void insert(int value, TreeNode node) {
        if (value < node.value) {
            //if the left child does not exist, we want to insert the value as left child
            if (node.left == null) node.left = node;
            else insert(value, node.left);
        } else if (value > node.value) {
            //if the right child does not exist, we want to insert the value as right child
            if (node.right == null) node.right = node;
            else insert(value, node.right);
        }
    }

    static TreeNode delete(int value, TreeNode node) {
        /**The base case is when we've hit the bottom of the tree, and the parent node has no children**/
        if (node == null) return null;
        /**if the value we are deleting is lesser or greater than the current node, we set the left or right child
         * respectively to be the return value of a recursive call of this very method on the current node's left
         * or right subtree**/
        else if (value < node.value) {
            node.left = delete(value, node.left);
            return node;
        } else if (value > node.value) {
            node.right = delete(value, node.right);
            return node;
        }
        /**if we want to delete the current node**/
        else if (value == node.value) {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            else {
                node.right = lift(node.right, node);
            }
        }
        return node;
    }

    private static TreeNode lift(TreeNode node, TreeNode nodeToDel) {
        if (node.left != null) {
            node.left = lift(node.left, nodeToDel);
            return node;
        } else {
            nodeToDel.value = node.value;
        }
        return node.right;
    }
}
