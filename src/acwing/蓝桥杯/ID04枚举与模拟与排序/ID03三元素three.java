package acwing.蓝桥杯.ID04枚举与模拟与排序;

/**
 * @author Yeah
 * @date 2021/3/11 - 16:22
 */
public class ID03三元素three {
    public static void main(String[] args) {
        int res=0;
        for(int i=1;i<=300;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=300;k++){
                    if(i+33*j+582/k==2982) res++;
                }
            }
        }
        System.out.println(res);
    }
}
