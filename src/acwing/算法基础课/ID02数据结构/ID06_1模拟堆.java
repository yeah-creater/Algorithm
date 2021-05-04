package acwing.算法基础课.ID02数据结构;


import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/2/28 - 13:15
 * 难点在于映射
 *
 * 未通过
 */
public class ID06_1模拟堆 {
    static int[]heap=new int[100010];
    static int[]ph=new int[100010];//存储第k个插入的点在heap中的下标 point to heap
    static int[]hp=new int[100010];//存储heap中第k个点是第几个插入的
    static int size;
    //传入堆中的下标
    static void heap_swap(int a,int b){
        int pa=hp[a];//a是第几个插入的
        int pb=hp[b];//b是第几个插入的
        int tmp;
        //交换ph
        tmp=ph[pa];
        ph[pa]=ph[pb];
        ph[pb]=tmp;
        //交换hp
        tmp=hp[a];
        hp[a]=hp[b];
        hp[b]=tmp;
        //交换两个地方的值
        tmp=heap[a];
        heap[a]=heap[b];
        heap[b]=tmp;
    }
    static void down(int u){
        int t=u;
        if(2*u<=size&&heap[2*u]<heap[t]) t=u*2;
        if(2*u+1<=size&&heap[2*u+1]<heap[t]) t=u*2+1;
        if(t!=u) {
            heap_swap(t,u);
            down(t);
        }
    }
    static void up(int u){
        while(u/2>=1&&heap[u/2]>heap[u]){
            heap_swap(u,u/2);
            u/=2;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            String key=in.next();
            switch (key) {
                case "I": {
                    int x = in.nextInt();
                    heap[++size] = x;
                    ph[i]=size;
                    hp[size]=i;
                    up(size);
                    break;
                }
                case "PM":{
                    System.out.println(heap[1]);
                    break;
                }
                case "DM":{
                    heap_swap(1,size);
                    size--;
                    down(1);
                    break;
                }
                case "D":{
                    int k=in.nextInt();
                    //第k个插入的数在堆中的位置
                    k=ph[k];
                    heap_swap(k,size);//**
                    size--;
                    down(k);
                    up(k);
                    break;
                }
                case "C":{
                    int k=in.nextInt();
                    int x=in.nextInt();
                    k=ph[k];
                    heap[k]=x;
                    down(k);
                    up(k);
                    break;
                }
            }

        }
    }
}
