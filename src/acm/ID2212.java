package acm;

/**
 * @author Yeah
 * @date 2021/2/22 - 8:35
 */
public class ID2212 {
    public static void main(String[] args) {
        int []gcd={1,1,2,6,24,120,720,5040,40320,362880};
        for(int i=1;i<=3628800;i++){
            int sum=0;
            int key=i;
            while (key>0){
                sum+=gcd[key%10];
                key/=10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
        System.out.println(1);
        System.out.println(2);
        System.out.println(145);
        System.out.println(40585);
    }
}
