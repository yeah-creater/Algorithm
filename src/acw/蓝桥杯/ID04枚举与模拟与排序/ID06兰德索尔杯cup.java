package acw.蓝桥杯.ID04枚举与模拟与排序;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/11 - 16:38
 */
public class ID06兰德索尔杯cup {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<4;i++){
            String path=in.next();
            double res=0;
            double spT=0;
            for(int j=0;j<n;j++){
                if(path.charAt(j)=='.'){
                    if(spT>0){
                        res+=0.5;
                        spT-=0.5;
                    }
                    else res+=1;

                }
                else if(path.charAt(j)=='w'){
                    if(spT>0.5) {
                        res+=1;
                        spT--;
                    }
                    else if(spT>0){
                        res+=1.5;
                        spT=0;
                    }
                    else res+=2;
                }
                else if(path.charAt(j)=='>'){
                    res+=0.5;
                    spT=4.5;
                }
                else if(path.charAt(j)=='s'){
                    if(spT>1){
                        spT-=1;
                    }
                    else spT=0;
                    if(spT>0){
                        res+=1.5;
                        spT-=0.5;
                    }
                    else res+=2;
                }
                else{
                    if(spT>2) spT-=2;
                    else spT=0;
                    if(spT>0){
                        res+=2.5;
                        spT-=0.5;
                    }
                    else res+=3;

                }
            }
            System.out.print(res+" ");
        }
    }
}
