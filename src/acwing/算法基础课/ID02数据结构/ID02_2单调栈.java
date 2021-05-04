package acwing.算法基础课.ID02数据结构;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yeah
 * @date 2021/2/25 - 15:11
 *
 * 思路：和双指针类似，先考虑暴力做法...
 *      优化：
 *      和栈进行结合  把要询问的ai之前的数放入栈中,但如果出现ai小于栈顶元素
 *                                          栈顶元素就出栈，直到栈为空找到小于小于ai的就结束while(元素出栈)
 *                                          最后成或不成都要在栈中加入stack
 *                                          即栈要保持单调性
 *                                          这道题是单调增
 *     一句话就是 在ai加入栈之后 栈中的元素都要单调增
 */
public class ID02_2单调栈 {
    static int[]q=new int[100010];
    static Stack<Integer> stack=new Stack<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) q[i]=in.nextInt();
        for(int i=0;i<n;i++){
            int res=-1;
            //单调栈退出元素
            while (!stack.empty()){
                int key=stack.peek();
                //说明下面的元素都比q[i]小了
                if(key<q[i]) {
                    res = key;
                    break;
                }
                //该栈顶比新加入的q[i]大,是多余的
                stack.pop();
            }
            System.out.print(res+" ");
            //res不等于-1说明有小于q[i] q[i]要加入stack中
            //res等于-1 也要加入了
            stack.push(q[i]);
        }
    }
}
