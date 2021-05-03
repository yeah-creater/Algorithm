package acw.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/26 - 14:07
 * //转化为二进制存进Trie树中
 */
public class ID04_1最大异或对 {
    static int son[][]=new int[3000010][2];
    static int n,idx;
    static void insert(int x){
        int p = 0;
        for(int i = 30; i >= 0; i--){
            if(son[p][(x >> i) & 1] == 0){
                son[p][(x >> i) & 1] = ++ idx;
            }
            p = son[p][(x >> i) & 1];
        }
    }

    static int query(int x){
        int p = 0, res = 0;
        for(int i = 30; i >= 0; i--){
            int s = (x >> i) & 1;
            if(son[p][1-s] != 0){
                res += (1 << i);
                p = son[p][1-s];
            }else{
                p = son[p][s];
            }
        }
        return res;
    }
//    static int bf(){
//        int max=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                max=Math.max(max,q[i]^q[j]);
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            insert(x);
            max=Math.max(max,query(x));
        }
        System.out.println(max);

    }
}
