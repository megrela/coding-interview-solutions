package DataStructures.TreesGraphs.extras;

/**
 * Created by gime on 4/25/2016.
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public int key;


    public TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
    }

    public void appendLeft(TreeNode left) {
        this.left = left;
        left.parent = this;
    }

    public void appendRight(TreeNode right) {
        this.right = right;
        right.parent = this;
    }
}
