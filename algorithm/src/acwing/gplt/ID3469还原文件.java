package acwing.gplt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: yeah
 */
public class ID3469还原文件 {
    static int n,m;
    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer>[]h=new ArrayList[110];

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(s[i]));
        }
        m=Integer.parseInt(br.readLine());
        for(int i=1;i<=m;i++){
            h[i]=new ArrayList<>();
            String[] s1 = br.readLine().split(" ");
            int cnt=Integer.parseInt(s1[0]);
            for(int j=0;j<cnt;j++){
                h[i].add(Integer.parseInt(s1[j+1]));
            }
        }
        int cnt=0;
        //暴力枚举
        for(int i=0;i<n;){
            ArrayList<Integer> l=new ArrayList<>();
            boolean flag=false;
            for(int j=i;j<n;j++){
                l.add(list.get(j));
                for(int k=1;k<=m;k++){
                    if(l.equals(h[k])){
                        i=j;
                        System.out.print(k+" ");
                        cnt++;
                        if(cnt==m) return;
                        flag=true;
                        break;
                    }
                }
                if(flag) break;
            }
        }
    }
}
