package acwing.蓝桥杯.ID04枚举与模拟与排序;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Yeah
 * @date 2021/3/26 - 22:30
 */
class Location{
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x &&
                y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
public class ID12回收站选址 {
    static HashSet<Location> set=new HashSet<>();
    static int []nums=new int[5];//0~4的数量
    static boolean isOk(Location loc){
        int x=loc.x;
        int y=loc.y;
        return set.contains(new Location(x,y+1))&&set.contains(new Location(x,y-1))
                &&set.contains(new Location(x+1,y))&&set.contains(new Location(x-1,y));
    }
    static int getMarks(Location loc){
        int marks=0;
        int x=loc.x;
        int y=loc.y;
        if(set.contains(new Location(x+1,y+1))) marks++;
        if(set.contains(new Location(x+1,y-1))) marks++;
        if(set.contains(new Location(x-1,y+1))) marks++;
        if(set.contains(new Location(x-1,y-1))) marks++;
        return marks;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            set.add(new Location(x,y));
        }
        for(Location loc:set){
            if(isOk(loc)){
                nums[getMarks(loc)]++;
            }
        }
        for(int i=0;i<5;i++) System.out.println(nums[i]);
    }
}
