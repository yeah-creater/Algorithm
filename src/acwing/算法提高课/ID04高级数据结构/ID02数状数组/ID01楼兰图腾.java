package acwing.算法提高课.ID04高级数据结构.ID02数状数组;

/**
 * @author: yeah
 */
public class ID01楼兰图腾 {
    static int[]c=new int[200010];//表示小于 i的个数
    static int lowBit(int x){
        return x&-x;
    }
    static void add(int v,int x){//将数组的第v个数加x  从前往后

    }
    static int query(int v){//返回1到v 的和  从后往前
        for(int i=v;i>0;i-=lowBit(i)){

        }
        return 0;
    }
    public static void main(String[] args) {


    }
}
