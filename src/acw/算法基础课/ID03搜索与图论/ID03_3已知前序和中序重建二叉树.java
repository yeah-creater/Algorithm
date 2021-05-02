package acw.算法基础课.ID03搜索与图论;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/28 - 14:54
 * 输入第一行给出一个正整数N（≤30），是二叉树中结点的个数。第二行给出其中序遍历序列。第三行给出其前序遍历序列。数字间以空格分隔。
 */
class TreeNode{
    int x;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.x = x;
    }
}
public class ID03_3已知前序和中序重建二叉树 {
    static int []preOrder=new int[35];
    static int []inOrder=new int[35];
    static HashMap<Integer,Integer> map=new HashMap<>();//中序遍历中每个数的位置
    static int n;
    //传入前序和中序遍历的左右端点(包含)  还要层次遍历的下标
    static TreeNode dfs(int pl,int pr,int il,int ir){
        if(pl>pr) return null;
        int rootVal=preOrder[pl];//根结点的值
        TreeNode root=new TreeNode(rootVal);
        int k=map.get(rootVal);//找到根结点在中序遍历中从下标，分割左右子树(再递归找到左右子树的根节点)
        root.left=dfs(pl+1,pl+k-il,il,k-1);//k-il+1=x-(pl+1)
        root.right=dfs(pl+k-il+1,pr,k+1,ir);
        return root;
    }
    static void mirror(TreeNode root){
        if(root==null) return;
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        mirror(root.left);
        mirror(root.right);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            inOrder[i]=in.nextInt();
            map.put(inOrder[i],i);
        }
        for(int i=0;i<n;i++) preOrder[i]=in.nextInt();

        TreeNode root = dfs(0, n - 1, 0, n - 1);
        //进行反转
        mirror(root);
        Deque<TreeNode> q=new ArrayDeque<>();
        q.addLast(root);
        int idx=0;
        while (!q.isEmpty()){
            TreeNode r = q.pollFirst();
            if(idx!=n-1)
                System.out.print(r.x+" ");
            else System.out.println(r.x);
            idx++;
            if(r.left!=null) q.addLast(r.left);
            if(r.right!=null) q.addLast(r.right);
        }

    }
}
