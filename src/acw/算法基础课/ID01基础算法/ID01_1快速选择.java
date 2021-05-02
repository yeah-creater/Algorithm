package acw.算法基础课.ID01基础算法;

import java.util.Scanner;

public class ID01_1快速选择 {
    static int N = 100010;
    static int[] A = new int[N];
    static int n, k;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();

        System.out.println(quickSelect(0, n-1, k-1));
    }
    public static int quickSelect(int l, int r, int k){
        if(l == r) return A[k];

        int x = A[l], i = l-1, j = r+1;
        while(i < j) {
            do i++; while(A[i] < x);
            do j--; while(A[j] > x);
            if(i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        //必须是j
        if(k <= j) return quickSelect(l, j, k);
        else return quickSelect(j+1, r, k);
    }
}