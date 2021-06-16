package acwing.算法基础课.ID03搜索与图论;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/1 - 12:59
 * DFS:  stack  空间O(h) 不具有最短性
 *     回溯：
 *     剪枝：不需要往下走了
 * BFS:  queue  空间O(2^h) 具有最短性
 *
 */
public class ID01_0排列数字 {
    static int[]path=new int[10];
    static boolean[]visited=new boolean[10];
    static int n;
    static void dfs(int x){
        if(x==n+1){
            for(int i=1;i<=n;i++)
                System.out.print(path[i]+" ");
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                path[x]=i;
                dfs(x+1);
                //回溯重置
                visited[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        dfs(1);
    }
}
