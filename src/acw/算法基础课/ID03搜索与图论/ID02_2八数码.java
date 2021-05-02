package acw.算法基础课.ID03搜索与图论;



import java.util.*;

/**
 * @author Yeah
 * @date 2021/3/2 - 9:48
 */
public class ID02_2八数码 {
    static int bfs(String start){
        String end="12345678x";
        Deque<String> q=new ArrayDeque<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        q.offerLast(start);
        hashMap.put(start,0);
        int[]dx={-1,0,1,0},dy={0,1,0,-1};
        while (!q.isEmpty()){
            String s = q.pollFirst();
            int dis=hashMap.get(s);
            if(s.equals(end)) return dis;
            //状态转移
            int k = s.indexOf('x');
            int x=k/3,y=k%3;//找到字符串一维的x对应的3*3二维坐标
            for(int i=0;i<4;i++){
                int a=x+dx[i];
                int b=y+dy[i];
                //枚举可能的四种交换
                if(a>=0&&a<3&&b>=0&&b<3){
                    char[] chars = s.toCharArray();
                    char ch=chars[a*3+b];
                    chars[a*3+b]=chars[k];
                    chars[k]=ch;
                    if(!hashMap.containsKey(new String(chars))){
                        hashMap.put(new String(chars),dis+1);
                        q.offerLast(new String(chars));
                    }
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String start="";
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        for(int i=0;i<s1.length;i++)
            start+=s1[i];
        System.out.println(bfs(start));
    }

}
