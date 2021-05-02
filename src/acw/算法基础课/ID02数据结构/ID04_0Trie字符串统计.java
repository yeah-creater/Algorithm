package acw.算法基础课.ID02数据结构;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yeah
 * @date 2021/2/26 - 12:29
 *
 * Trie树：高效地存储和查找字符串集合的数据结构
 */
public class ID04_0Trie字符串统计 {
    static final int N=100010;
    static int [][]son=new int[N][26];
    static int []cnt=new int[N];
    static int index;//标记用过的son数量
    static void insert(char []str){
        int p=0;//表示从第一个字符开始
        for(int i=0;i<str.length;i++){
            //当前字符的索引值
            int u=str[i]-'a';
            //当前位置为空
            if(son[p][u]==0) son[p][u]=++index;
            //下一个字符的列号,即儿子字符的列号
            p=son[p][u];
        }
        //最后一个字符index位置cnt++
        cnt[p]++;
    }
    static int query(char []str){
        int p=0;
        for(int i=0;i<str.length;i++){
            int u=str[i]-'a';
            if(son[p][u]==0) return 0;
            //获取当前字符对应的下一个字符的列
            p=son[p][u];
        }
        return cnt[p];
    }
    public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String []str=br.readLine().split(" ");
            if(str[0].equals("I"))
                insert(str[1].toCharArray());
            else
                System.out.println(query(str[1].toCharArray()));
        }
    }

}
