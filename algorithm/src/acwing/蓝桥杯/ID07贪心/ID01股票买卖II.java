package acwing.蓝桥杯.ID07贪心;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/13 - 17:09
 */
public class ID01股票买卖II {
    static int[]q=new int[100010];
    public static void main(String[] args) {
        int res=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        for(int i=0;i+1<n;i++){
            if(q[i+1]-q[i]>0)
                res+=q[i+1]-q[i];
        }
        System.out.println(res);
        //可以求最小交易次数
//        int buy=0,sell=0;
//        for(int i=0;i<n;){
//            if(q[i+1]>q[i]){
//                buy=i;
//                for(int j=i+1;j<n;j++){
//                    if(q[j+1]<=q[j]){
//                        sell=j;
//                        break;
//                    }
//                }
//                res+=q[sell]-q[buy];
//                i=sell+1;
//            }
//            else {
//                i++;
//            }
//        }
        System.out.println(res);
    }
}
