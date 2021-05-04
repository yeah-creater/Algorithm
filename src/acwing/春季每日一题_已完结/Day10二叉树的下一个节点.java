package acwing.春季每日一题_已完结;

/**
 * @purpose: 熟悉二叉树的性质与结构
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode father;

    TreeNode(int x) {
        val = x;
    }
}

public class Day10二叉树的下一个节点 {
    public TreeNode inorderSuccessor(TreeNode p) {
        //情况1，存在右孩子，其后继是右子树中最左侧的节点
        if (p.right != null) {
            p = p.right;
            while (p.left != null)
                p = p.left;
            return p;
        }
        //情况2,如果当前节点没有右儿子，则需要沿着father域一直向上找，找到第一个是其father左儿子的节点，
        // 该节点的father就是当前节点的后继
        while (p.father != null && p == p.father.right) p = p.father;
        return p.father;

    }

}
