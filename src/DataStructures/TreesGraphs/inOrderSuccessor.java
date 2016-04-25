package DataStructures.TreesGraphs;

import DataStructures.TreesGraphs.extras.TreeNode;

/**
 * Created by gime on 4/25/2016.
 */
public class inOrderSuccessor {

    private static TreeNode inOrderSuccessor(TreeNode node) {
        if (node.right != null || node.parent == null) {
            return leftMostNode(node.right);
        } else {
            TreeNode p = node.parent;
            while (p != null) {
                if (node == p.left) {
                    return p;
                } else {
                    node = p;
                    p = p.parent;
                }
            }
            return null;
        }
    }

    private static TreeNode leftMostNode(TreeNode r) {
        if (r == null) return null;
        while (r.left != null) r = r.left;
        return r;
    }

    public static void main(String[] args) {

    }
}
