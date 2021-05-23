package leetcode.周赛;

/**
 * @author: yeah
 */
class Solution2{
    static boolean check(int speed,int []dist,double hour){
        double t=0;
        for(int i=0;i<dist.length-1;i++){
            t+=(dist[i]+speed-1)/speed;
        }
        t+=dist[dist.length-1]/hour;
        return hour-t>=0.000001;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length==1) return (int)(dist[0]/hour);
        int l=1,r=10000000;
//        for(int i=0;i<dist.length;i++){
//            if(dist[i]>r) r=dist[i];
//        }
        if(dist.length-1+(double)dist[dist.length-1]/r-hour>0.00000001) return -1;
        while (l<r){
            int mid=l+r>>1;
            System.out.println(l);
            if(check(mid,dist,hour)) r=mid;
            else l=mid+1;
        }
        return l;
    }
}
public class B {
}
