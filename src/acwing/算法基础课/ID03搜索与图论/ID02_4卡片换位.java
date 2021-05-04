package acwing.算法基础课.ID03搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/15 - 15:16
 */
public class ID02_4卡片换位 {
    static String src="";
    static HashMap<String, Integer> map = new HashMap<>();
    static int A,B;

    static int bfs() {
        Deque<String> queue = new ArrayDeque<>();
        queue.addLast(src);
        map.put(src,0);
        int []dx={-1,0,1,0},dy={0,1,0,-1};
        while (!queue.isEmpty()){
            String s = queue.pollFirst();
            if(s.charAt(A)=='B'&&s.charAt(B)=='A') return map.get(s);
            //找出空格的位置
            int loc = s.indexOf(" ");
            //算出空格所在的二维坐标
            int x=loc/3;int y=loc%3;
            for(int i=0;i<4;i++){
                int a=x+dx[i];
                int b=y+dy[i];
                if(a>=0&&a<2&&b>=0&&b<3){
                    int newL=a*3+b;
                    char[] newS = s.toCharArray();
                    //空格与当前字符交换
                    char tmp=newS[loc];
                    newS[loc]=newS[newL];
                    newS[newL]=tmp;
                    if(!map.containsKey(new String(newS))){
                        queue.addLast(new String(newS));
                        map.put(new String(newS),map.get(s)+1);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        src = s1 + s2;
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == 'A') A=i;
            else if (src.charAt(i) == 'B') B=i;
        }
        System.out.println(bfs());
    }
}
