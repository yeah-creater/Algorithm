package acwing.蓝桥杯._10届蓝桥杯国赛;

/**
 * @author: yeah
 * 74
 */
public class ID00换零钞 {
    public static void main(String[] args) {
        int sum=200;
        int cnt1,cnt2;
        for(int i=40;i>=1;i--){
            int left=sum-i*5;
            if(left>0&&left%21==0){
                System.out.println(i+(left/21)*11);
                return;
            }
        }
    }
}
