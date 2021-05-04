package acwing.蓝桥杯.ID03数学和DP;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/7 - 14:42
 * 脑筋急转弯：相撞的时候，可以假设成不是掉头而是继续走，因为这样的结果是一样的(要么2只都感冒，要么都不感冒)
 *          知道了这个，感冒的蚂蚁左右最多就4种蚂蚁
 */
public class ID02蚂蚁的感冒 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[55];
        int cnt=1;
        for(int i=1;i<=n;i++) a[i]=in.nextInt();
        //感冒蚂蚁方向向右
        if(a[1]>0){
            //和a[1]方向相反的并且绝对值大于它的肯定感冒
            //若存在上面感染了，则和a[1]方向相同且绝对值小于它的也感冒了

            //先查找直接性感冒(a[1]传染的)
            for(int i=2;i<=n;i++)
                if(a[i]<0&&Math.abs(a[i])>a[1]) cnt++;
            //再查找间接性感冒
            if(cnt>1){
                for(int i=2;i<=n;i++)
                    if(a[i]>0&&Math.abs(a[i])<a[1])cnt++;
            }
        }
        //感冒蚂蚁方向向左  同理分析
        else{
            for(int i=2;i<=n;i++)
                if (a[i] > 0 && Math.abs(a[i]) < Math.abs(a[1])) cnt++;


            if(cnt>1){
                for(int i=2;i<=n;i++)
                    if (a[i] < 0 && Math.abs(a[i]) > Math.abs(a[1])) cnt++;
            }
        }
        System.out.println(cnt);

    }
}
