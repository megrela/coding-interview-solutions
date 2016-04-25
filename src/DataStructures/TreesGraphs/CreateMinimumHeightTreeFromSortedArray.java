package DataStructures.TreesGraphs;

import DataStructures.TreesGraphs.extras.TreeNode;

import java.util.ArrayList;

/**
 * Created by gime on 4/25/2016.
 */
public class CreateMinimumHeightTreeFromSortedArray {

    private static int[] data = {1,2,3,4,5,6,7,8,9,10};

    private static TreeNode buildMinHeightBTree(int[] sorted, int from, int to) {
        if (from > to) return null;
        int middle = (from + to) >> 1;
        TreeNode root = new TreeNode(sorted[middle]);
        root.left = buildMinHeightBTree(sorted, from, middle - 1);
        root.right = buildMinHeightBTree(sorted, middle + 1, to);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = buildMinHeightBTree(data, 0, data.length - 1);
        System.out.println(root.key);
        System.out.print(root.left.key + " ");
        System.out.println(root.right.key);
        System.out.print(root.left.left.key + " ");
        System.out.print(root.left.right.key + " ");
        System.out.print(root.right.left.key + " ");
        System.out.println(root.right.right.key);
    }
}
