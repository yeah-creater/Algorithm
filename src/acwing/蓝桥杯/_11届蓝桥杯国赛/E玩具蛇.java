package acwing.蓝桥杯._11届蓝桥杯国赛;

/**
 * @author: yeah
 */
public class E玩具蛇 {
    static int[][] st = new int[4][4];
    static long res = 0;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    static void dfs(int num, int x, int y) {
        if (num == 16) {
            res++;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(st[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < 4 && b >= 0 && b < 4 && st[a][b] == 0) {
                st[a][b] = num + 1;
                dfs(num + 1, a, b);
                st[a][b] = 0;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                st[i][j] = 1;
                dfs(1, i, j);
                st[i][j] = 0;
            }
        }
        System.out.println(res);
    }

}
