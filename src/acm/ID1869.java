package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/1/19 - 10:46
 * @intention:
 */
class Map{
    final int MAX=65536;
    int n;
    int m;
    int [][]map;

    public Map(int n, int m) {
        this.n = n;
        this.m = m;
        this.map = new int[n][n];
        Scanner in =new Scanner(System.in);
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(j==k){
                    map[j][k]=0;
                }
                else{
                    map[j][k]= MAX;
                }
            }
        }
        for(int i=0;i<m;i++){
            int a1=in.nextInt();
            int a2=in.nextInt();
            map[a1][a2]=1;
            map[a2][a1]=1;
        }
    }
    public void floyd(){
        for(int mid=0;mid<n;mid++){
            for(int beg=0;beg<n;beg++){
                for(int end=0;end<n;end++){
                    if(map[beg][end]>map[beg][mid]+map[mid][end]){
                        map[beg][end]=map[beg][mid]+map[mid][end];
                    }
                }
            }
        }
    }
    public void judge(){
        int flag=0;
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
               if(map[j][k]>7){
                   flag=1;
                   break;
               }
            }
            if(flag==1){
                break;
            }
        }
        System.out.println(flag==1?"No":"Yes");
    }
}
public class ID1869 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            int m=in.nextInt();
            Map ma = new Map(n, m);
            ma.floyd();
            ma.judge();
        }
    }
}
