package ro.unibuc.pao.homework;

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public class ZigZagLine extends Line {

    //TODO: add code here
    ArrayList <Point> points1 = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        //TODO: add code here
        for(Point p : points) {
            points1.add(new Point(p.getX(), p.getY()));
        }
    }

    public ZigZagLine(Point... points) {
        //TODO: add code here
        for(Point p : points) {
            points1.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        //TODO: add code here
        points1.add(new Point(point.getX(), point.getY()));
    }

    public int getLength() {
        //TODO: add code here
        int length = 0;
        Point last = points1.get(0);

        if(points1.size() > 1) {

            for(Point x : points1) {
                double distance = Math.sqrt((x.getX()-last.getX())*(x.getX()-last.getX()) + (x.getY()-last.getY())*(x.getY()-last.getY()));
                last = x;
                length += distance;
            }
            return length;
        }
        return 0;
    }

}
