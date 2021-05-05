package acwing.春季每日一题_已完结;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yeah
 */
class Solution0 {
    static int sum;
    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> res = new ArrayList<>();

    void dfs(TreeNode node) {
        path.add(node.val);
        sum -= node.val;
        if (sum == 0 && node.left == null && node.right == null) {
            List<Integer> list = new ArrayList<>();
            list.addAll(path);
            res.add(list);
        }
        if (node.left != null) dfs(node.left);
        if (node.right != null) dfs(node.right);
        path.remove(path.size() - 1);
        sum += node.val;
    }

    public List<List<Integer>> findPath(TreeNode root, int sum) {
        if (root == null) return res;
        Solution0.sum = sum;
        dfs(root);
        return res;
    }
}

public class Day32二叉树中和为某一值的路径 {
}
