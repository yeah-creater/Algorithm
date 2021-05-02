package acw.算法基础课.ID03搜索与图论;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/29 - 10:03
 */
class Node{
    int x;
    Node left;
    Node right;

    public Node(int x) {
        this.x = x;
    }
}
public class ID03_4后序遍历 {
    static final int N=50010;
    static int []preOrder=new int[N];
    static int []inOrder=new int[N];
    static HashMap<Integer,Integer> map=new HashMap<>();
    static int []postOrder=new int[N];
    static int idx;
    static Node dfs(int pl,int pr,int il,int ir){
        if(pl>pr) return null;
        int rootVal=preOrder[pl];
        int k=map.get(rootVal);
        Node root=new Node(rootVal);
        root.left=dfs(pl+1,pl+k-il,il,k-1);
        root.right=dfs(pl+k-il+1,pr,k+1,ir);
        return root;
    }
    static void PostOrder(Node root){
        if(root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        postOrder[idx++]=root.x;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) preOrder[i]=in.nextInt();
        for(int i=0;i<n;i++){
            inOrder[i]=in.nextInt();
            map.put(inOrder[i],i);
        }

        Node root = dfs(0, n - 1, 0, n - 1);
        PostOrder(root);
        System.out.println(postOrder[0]);
    }
}
