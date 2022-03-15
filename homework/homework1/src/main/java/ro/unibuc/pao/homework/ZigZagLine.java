package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    List<Point> points = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        this.points = points;
    }

    public ZigZagLine(Point... points) {
        if(points.length < 2) {
            System.out.println("A line contains at least 2 points.");
        } else{
            this.points.addAll(List.of(points));
        }
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public int getLength() {
        int len = 0;

        if(this.points.size() > 1) {

            for(int i = 0; i < this.points.size()-1; i++) {

                int p1x = this.points.get(i).getX();
                int p1y = this.points.get(i).getY();
                int p2x = this.points.get(i+1).getX();
                int p2y = this.points.get(i+1).getY();
                len = (int) (len + Math.sqrt(Math.pow((p2x - p1x), 2) + Math.pow((p2y - p1y), 2)));
                //Math.pow => double
            }
            return len;
        } else{
            return 0;
        }
    }

}
