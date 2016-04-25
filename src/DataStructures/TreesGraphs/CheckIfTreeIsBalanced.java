package DataStructures.TreesGraphs;

import DataStructures.TreesGraphs.extras.TreeNode;

/**
 * Created by gime on 4/25/2016.
 */
public class CheckIfTreeIsBalanced {

    private static int minDepth(TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        return 1 + Math.min( minDepth(cur.left), minDepth(cur.right) );
    }

    private static int maxDepth(TreeNode cur) {
        if (cur == null) {
            return 0;
        }

        return 1 + Math.max( maxDepth(cur.left), maxDepth(cur.right) );
    }

    private static boolean isBalanced(TreeNode root) {
        return maxDepth(root) - maxDepth(root) <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new TreeNode(1)));
    }
}
