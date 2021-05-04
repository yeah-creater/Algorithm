package acwing.算法基础课.ID01基础算法;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Yeah
 * @date 2021/2/23 - 19:54
 *
 * 虽然java有大整数，但还是学学
 *
 * 1.大整数存储：
 *          大整数就用数组存 但要反着存  比如12345 存在数组中是 54321
 * 2.运算过程：
 *          类似小学的加法运算
 */
public class ID04_0高精度加法 {
    static ArrayList<Integer> A=new ArrayList(1000010);
    static ArrayList<Integer> B=new ArrayList(1000010);
    static ArrayList<Integer> C=new ArrayList(1000010);
    static void add(){
        int i;//指针
        int tmp=0;//上一位的进位
        for(i=0;i<A.size()&&i<B.size();i++){
            int val=(A.get(i)+B.get(i)+tmp);
            C.add(val%10);
            tmp=val/10;
        }
        while (i<A.size()){
            int val=A.get(i)+tmp;
            C.add(val%10);
            tmp=val/10;
            i++;
        }
        while (i<B.size()){
            int val=B.get(i)+tmp;
            C.add(val%10);
            tmp=val/10;
            i++;
        }
    }
    public static void main(String[] args) throws Exception{
        String a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a= br.readLine();
        b= br.readLine();
        for(int i=a.length()-1;i>=0;i--)
            A.add(Integer.parseInt(a.charAt(i)+""));
        for(int i=b.length()-1;i>=0;i--)
            B.add(Integer.parseInt(b.charAt(i)+""));
        add();
        for(int i=C.size()-1;i>=0;i--)
            System.out.print(C.get(i));



    }
}
