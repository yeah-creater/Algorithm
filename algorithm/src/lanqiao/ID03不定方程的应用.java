package lanqiao;

import org.junit.Test;

/**
 * @author Yeah
 * @date 2021/2/19 - 12:46
 * @intention:
 */
public class ID03不定方程的应用 {
    //求二元一次方程的解 ax+by=c的整数解

    /**
     * ax+by=c a-4. b=-5, c=7
     * 1.求出一个特殊解x0  y0
     * 2.求通解:x=x0+bt  y=y0-at
     * 2,-1,0,1,2,3
     */
    @Test
    public void test01(){
        //4*x+3*y=120;
        //x=120-3y/4
        int x1=0,x2=0;
        for(int y=1;y<=120;y++){
            if((120-3*y)%4==0){
                System.out.println(y);
                System.out.println((120-3*y)/4);
                x1=(120-3*y)/4;
                x2=y;
                break;
            }
        }
        for(int t=0;t<=120;t++){
            if(4*(x1+3*t)<=120&&3*(x2-4*t)>=0){
                System.out.println(t+"*");
            }
        }
    }
}
