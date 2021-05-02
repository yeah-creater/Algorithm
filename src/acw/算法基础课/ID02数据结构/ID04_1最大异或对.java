package acw.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yeah
 * @date 2021/2/26 - 14:07
 * //转化为二进制存进Trie树中
 */
public class ID04_1最大异或对 {
    static int son[][]=new int[4000010][2];
    static int index;
    static long max=0;
    //在每次插入的时候就开始求异或的值
    static void insert(String b1,int key){
        StringBuilder b=new StringBuilder(b1);
        int cnt=32-b.length();
        //确保按位异或
        String s="000000000000000000000000000000000000000000000000000000000000";
        b.insert(0,s.substring(0,cnt));
        System.out.println(b+"*");
        long res=0;
        int p=0;
        for(int i=0;i<b.length();i++){
            int u=b.charAt(i)=='1'?1:0;
            if(son[p][u]==0) {
                if(key>0)
                    res=res*10+1;
                son[p][u]=++index;
            }
            //表示当前的数与上一个相同
            else {
                if(key>0)
                    res=res*10;
            }
            p = son[p][u];
        }
        if(res>max) {
            max = res;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        for(int i=0;i<str.length;i++){
            String b = Integer.toBinaryString(Integer.parseInt(str[i]));
            insert(b,i);
        }
        System.out.println(Integer.parseInt(max+"",2));
    }
}
