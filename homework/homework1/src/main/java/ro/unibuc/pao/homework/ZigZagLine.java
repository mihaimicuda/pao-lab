package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    List<Point> points;

    public ZigZagLine(List<Point> points) {
        this.points = points;
    }

    public ZigZagLine(Point... points) {
        this.points = new ArrayList<Point>();
        for(int i=0; i< points.length; i++) {
            this.points.add(points[i]);
        }
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public int getLength() {
        int length = 0;
        if (this.points.size() > 1) {
            for (int i = 0; i < this.points.size() - 1; i++) {
                int aX = this.points.get(i).getX();
                int aY = this.points.get(i).getY();
                int bX = this.points.get(i + 1).getX();
                int bY = this.points.get(i + 1).getY();
                length = (int) (length + Math.sqrt(Math.pow((bX - aX), 2) + Math.pow((bY - aY), 2)));
            }
        }
        return length;
    }

    @Override
    public String toString() {
        return "ZigZagLine{" +
                "points=" + points +
                '}';
    }
}