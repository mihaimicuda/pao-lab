package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    //TODO: add code here
    List<Point>points = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        //TODO: add code here
        this.points = points;
    }

    public ZigZagLine(Point... points) {
        //TODO: add code here
    }

    public void addPoint(Point point) {
        //TODO: add code here
        points.add(new Point(point.getX(), point.getY()));
    }

    public int getLength() {
        //TODO: add code here
        return 0;
    }

    @Override
    public String toString() {
        return "ZigZagLine{" +
                "points=" + points +
                '}';
    }
}
