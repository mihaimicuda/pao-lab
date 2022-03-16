package ro.unibuc.pao.homework;

import java.util.List;
import java.util.ArrayList;

public class ZigZagLine extends Line {

    private List<Point> points;

    public ZigZagLine(List<Point> points) {
        this.points.addAll(points);
    }

    public ZigZagLine(Point... points) {
        this.points = new ArrayList<Point>();
        for(int i = 0; i < points.length; i++) {
            this.points.add(points[i]);
        }
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public int getLength() {
        int sum = 0;
        for(int i = 1; i < this.points.size(); i++){
            int d = (int) Math.sqrt(Math.pow(this.points.get(i).getX() - this.points.get(i-1).getX(), 2) + Math.pow(this.points.get(i).getY() - this.points.get(i-1).getY(), 2));
            sum += d;
        }
        return sum;
    }
}
