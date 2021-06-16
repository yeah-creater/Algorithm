package acm;

import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/20 - 12:59
 */
public class ID1407 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int flag=0;
            for(int i=1;i<= (int)Math.sqrt(n);i++){
                for(int j=i;j<=(int)Math.sqrt(n);j++){
                    for(int k=j;k<=(int)Math.sqrt(n);k++){
                        if(i*i+j*j+k*k==n){
                            System.out.println(i+" "+j+" "+k);
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1){
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
            }

        }
    }
}
