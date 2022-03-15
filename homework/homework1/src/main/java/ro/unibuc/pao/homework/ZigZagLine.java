package ro.unibuc.pao.homework;

import java.util.List;
import java.util.ArrayList;

public class ZigZagLine extends Line {

    private List<Point> points;

    public ZigZagLine(List<Point> points) {
        this.points = points;
    }

    public ZigZagLine(Point... points) {
        this.points = new ArrayList<Point>();
        for(int i=0; i<points.length; i++) {
            this.points.add(points[i]);
        }
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public int getLength() {
        int sum = 0;
        for(int i = 0; i < this.points.size()-1; i++){
            Point A = this.points.get(i);
            Point B = this.points.get(i+1);
            int dist = (int) Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
            sum += dist;
        }
        return sum;
    }

}
