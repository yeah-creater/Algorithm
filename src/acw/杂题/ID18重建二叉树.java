package acw.杂题;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

/**
 * @author Yeah
 * @date 2021/3/22 - 9:35
 * 思路：每次根据前序遍历的根结点找到中序遍历的左子树和右子树
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    static int []preorder;
    static int []inorder;
    static HashMap<Integer,Integer> map=new HashMap<>();//记录中序遍历中每个数的位置
    public TreeNode buildTree(int[] _preorder, int[] _inorder) {
        preorder=_preorder;
        inorder=_inorder;
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return dfs(0,preorder.length-1,0,inorder.length-1);
    }
    static TreeNode dfs(int pl,int pr,int il,int ir){
        if(pl>pr) return null;//空树
        TreeNode root = new TreeNode(preorder[pl]);
        int k=map.get(root.val);//找到根结点在中序遍历中从下标，分割左右子树(再递归找到左右子树的根节点)
        TreeNode left=dfs(pl+1,pl+k-il,il,k-1);
        TreeNode right=dfs(pl+k-il+1,pr,k+1,ir);
        root.left=left;
        root.right=right;
        return root;
    }
}
public class ID18重建二叉树 {
}
