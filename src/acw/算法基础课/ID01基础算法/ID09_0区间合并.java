package acw.算法基础课.ID01基础算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/24 - 20:07
 *
 * 区间合并：将所有存在交集的区间合并
 */
class MyPair implements Comparable{
    int l;
    int r;

    public MyPair(int l, int r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public int compareTo(Object o) {
        return ((MyPair)o).l<=this.l?1:-1;
    }
}
public class ID09_0区间合并 {
    static ArrayList<MyPair> all=new ArrayList<>();
    public static void main(String[] args) {
        //我的思路：先将区间按右值优先排个序，一个个区间遍历，前者区间最大值>=后者区间的最小值，就可以合并
        //合并的区间左边为2个左区间的小者，右边为大者,若不能合并 则会出现‘断裂’不太好处理,应该要按左端点进行排序
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int cnt=n;
        for(int i=0;i<n;i++){
            int l=in.nextInt();
            int r=in.nextInt();
            all.add(new MyPair(l,r));
        }
        Collections.sort(all);

        //fail
//        for(int i=1;i<all.size();i++){
//            if(all.get(i-1).r>=all.get(i).l){
//                cnt--;
//                all.get(i).l=Math.min(all.get(i-1).l,all.get(i).l);
//            }
//        }
//        System.out.println(cnt);
        //按照左端点进行排序的好处就是若地2个区间不能和第一个区间合并，那么第3个肯定也不能和第一个合并
        for(int i=1;i<all.size();i++){
            //结合图形理解，可以合并
            if(all.get(i-1).r>=all.get(i).l){
                //更新大区间
                all.get(i).l=all.get(i-1).l;
                all.get(i).r=Math.max(all.get(i).r,all.get(i-1).r);
                cnt--;
            }
        }
        System.out.println(cnt);


    }
}
