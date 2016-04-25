package DataStructures.TreesGraphs.extras;

/**
 * Created by gime on 4/25/2016.
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int key;

    public TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}
