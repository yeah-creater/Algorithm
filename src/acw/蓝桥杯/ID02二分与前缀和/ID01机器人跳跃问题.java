package acw.蓝桥杯.ID02二分与前缀和;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/6 - 13:40
 * 当你要找一个数，并且这个数在某个区间内，并且这个数 具有二段性(具体何种二段性看题目)，就可以用二分
 * 二分：
 *  确定一个区间，使得目标值一定在区间范围内
 *  找一个性质满足：
 *              性质具有二段性
 *              答案是二段性的分界点
 */
public class ID01机器人跳跃问题 {
    static int[]q=new int[100010];
    static int n;
    static boolean check(long power,int max){
        for(int i=1;i<=n;i++){
            power+=power-q[i];
            //终止条件，否则long也会溢出
            if(power>=max)return true;
            if(power<0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //二分问题 l为1 r为NMax
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int l,r=0;
        for(int i=1;i<=n;i++){
            q[i]=in.nextInt();
            if(q[i]>r) r=q[i];
        }
        l=1;
        int max=r;
        while(l<r){
            int mid=l+r>>1;
            System.out.println(mid);
            if(check(mid,max)) r=mid;
            else l=mid+1;
        }
        System.out.println(l);
    }
}
