package acm;

import java.util.*;

/**
 * @author Yeah
 * @date 2021/1/16 - 10:45
 * @intention:ok
 */
class Color implements Comparable<Color>{
    String name;
    int count;
    public Color(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(name, color.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public int compareTo(Color o) {
        return this.count>o.count?-1:1;
    }

    @Override
    public String toString() {
        return "ID1000_1999.Color{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
public class ID1004 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        while((n=in.nextInt())!=0){
            ArrayList<Color> colors = new ArrayList<>();
            for(int i=0;i<n;i++){
                String color=in.next();
                int flag=0;
                for(int j=0;j<colors.size();j++){
                    if(colors.get(j).name.equals(color)){
                        colors.get(j).count++;
                        flag=1;
                    }
                }
                if(flag==0){
                    colors.add(new Color(color,1));
                }
            }
            Collections.sort(colors);
            System.out.println(colors.get(0).name);
        }
    }
}
