package lanqiao;

import org.junit.Test;

/**
 * @author Yeah
 * @date 2021/2/20 - 17:10
 */
public class ID04随机算法的应用 {
    /**
     * 30个人中出现同一天生日的概率
     */
    @Test
    public void test01(){
        //概率模拟  模拟100万次
        final int N=1000*1000;
        int n=0;
        for(int i=0;i<N;i++){
            int []x=new int[365];
            for(int j=0;j<30;j++){
                int p= (int) (Math.random() * 365);
                if(x[p]==1) {n++;break;}
                x[p]=1;
            }
        }
        System.out.println("30个人中出现同一天生日的概率为"+(double)n/N);

    }
}
