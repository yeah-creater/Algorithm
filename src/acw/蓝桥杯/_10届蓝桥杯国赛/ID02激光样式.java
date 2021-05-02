package acw.蓝桥杯._10届蓝桥杯国赛;


/**
 * @author: yeah
 * 2178309
 */
public class ID02激光样式 {
    //    static boolean []on=new boolean[50];
//    static int cnt;
//    static boolean check(){
//        for(int i=0;i<30;i++){
//            if(on[i]&&on[i+1]) return false;
//        }
//        return true;
//    }
//    static void dfs(int u){
//        if(u==30){
//            if(check()) cnt++;
//            return;
//        }
//        for(int i=0;i<=1;i++){
//            on[u]= i != 0;
//            dfs(u+1);
//        }
//    }
//    public static void main(String[] args) {
//        dfs(0);
//        System.out.println(cnt);
//    }
    static int[][] f = new int[40][2];//f[i][j]表示第i位选择 j的数量

    public static void main(String[] args) {
        f[0][0] = 1;
        f[0][1] = 0;
        for (int i = 1; i <= 30; i++) {
            f[i][0] = f[i - 1][0] + f[i - 1][1];
            f[i][1] = f[i - 1][0];
        }
        System.out.println(f[30][1] + f[30][0]);
    }
}
