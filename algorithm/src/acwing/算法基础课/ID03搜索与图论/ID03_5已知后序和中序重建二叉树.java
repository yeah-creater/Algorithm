package acwing.算法基础课.ID03搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/29 - 10:54
 */
class Tree{
    int x;
    Tree left;
    Tree right;

    public Tree(int x) {
        this.x = x;
    }
}
public class ID03_5已知后序和中序重建二叉树 {
    static final int N=40;
    static int []postOrder=new int[N];
    static int []inOrder=new int[N];
    static HashMap<Integer,Integer> map=new HashMap<>();
    static Tree dfs(int pl,int pr,int il,int ir){
        if(pl>pr) return null;
        int rootVal=postOrder[pr];
        int k=map.get(rootVal);
        Tree root=new Tree(rootVal);
        root.left=dfs(pl,pl+k-il-1,il,k-1);//k-1-il=x(pr)-pl
        root.right=dfs(pl+k-il,pr-1,k+1,ir);
        return root;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) postOrder[i]=in.nextInt();
        for(int i=0;i<n;i++){
            inOrder[i]=in.nextInt();
            map.put(inOrder[i],i);
        }
        Tree root = dfs(0, n - 1, 0, n - 1);
        Deque<Tree> q=new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            Tree t = q.pollFirst();
            System.out.print(t.x+" ");
            if(t.left!=null) q.addLast(t.left);
            if(t.right!=null) q.addLast(t.right);
        }
    }
}
