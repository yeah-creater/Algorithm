package acwing.蓝桥杯._12届蓝桥杯省赛;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author: yeah
 * <p>
 * 已知 (x1,y1) (x2,y2) y=kx+b;  (比赛的时候想到用斜率和截距做了,可是不知道怎么表示,哎)
 * 斜率k=(double)(y1-y2)/(x1-x2)
 * 截距b=y1-kx1
 */
class Line {
    double k;
    double b;

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "k=" + k +
                ", b=" + b +
                '}';
    }
}

public class ID00直线 {
    static List<Line> lineList = new ArrayList<>();

    public static void main(String[] args) {
        for (int x1 = 0; x1 < 20; x1++) {
            for (int y1 = 0; y1 < 21; y1++) {
                for (int x2 = 0; x2 < 20; x2++) {
                    for (int y2 = 0; y2 < 21; y2++) {
                        if(x1!=x2) {
                            double k = (double) (y2 - y1) / (double) (x2 - x1);
                            double d=y1-k*x1;
                            lineList.add(new Line(k,d));
                        }

                    }
                }
            }
        }

        lineList.sort(Comparator.comparingDouble(Line::getK).thenComparingDouble(Line::getB));
        int res=1;
        double e=0.00000000001;
        for(int i=1;i<lineList.size();i++){
            if(Math.abs(lineList.get(i).k-lineList.get(i-1).k)>e||Math.abs(lineList.get(i).b-lineList.get(i-1).b)>e){
                res++;
            }
        }
        System.out.println(res+20);
    }
}
