package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    private List<Point> points;

    public ZigZagLine(List<Point> points) {
        this.points = points;
    }

    public ZigZagLine(Point... points) {
        this.points = new ArrayList<Point>();
        for(int i = 0; i < points.length; i++) {
            this.points.add(points[i]);
        }
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public int getLength() {
        int length = 0;
        for(int i = 1; i < this.points.size(); i++) {
            Point p1 = this.points.get(i-1);
            Point p2 = this.points.get(i);
            int d = (int) Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
            length += d;
        }
        return length;
    }

}
