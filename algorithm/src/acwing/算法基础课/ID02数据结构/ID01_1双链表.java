package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;

/**
 * @purpose:  模拟双链表
 */
public class ID01_1双链表 {
    static int index;
    static final int N=100010;
    static int[]e=new int[N],l=new int[N],r=new int[N];
    static void init(){
        //0表示左端点，1表示右端点
        r[0]=1;l[1]=0;
        index=2;
    }
    static void add(int k,int x){//在第k个点右边插入
        e[index]=x;
        r[index]=r[k];
        l[index]=k;

        l[r[k]]=index;
        r[k]=index;
        index++;
    }
    static void remove(int k){//删除第k个点
        r[l[k]]=r[k];
        l[r[k]]=l[k];
    }

    public static void main(String[] args) {
        init();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n-->0){
            String key=in.next();
            if(key.equals("L")){
                int x=in.nextInt();
                add(0,x);
            }
            else if(key.equals("R")){
                int x=in.nextInt();
                add(l[1],x);
            }
            else if(key.equals("D")){
                int k=in.nextInt();
                remove(k+1);//index从2开始 所以k要+1
            }
            else if(key.equals("IL")){
                int k=in.nextInt();
                int x=in.nextInt();
                add(k+1,x);
            }
            else{
                int k=in.nextInt();
                int x=in.nextInt();
                add(l[k+1],x);
            }
        }
        for(int i=r[0];i!=1;i=r[i]){
            System.out.print(e[i]+" ");
        }
    }
}
