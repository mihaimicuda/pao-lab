package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    //TODO: add code here

    private final ArrayList<Point> points = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        //TODO: add code here
        this.points.addAll(points);
    }

    public ZigZagLine(Point... points) {
        //TODO: add code here
        this.points.addAll(Arrays.asList(points));
    }

    public void addPoint(Point point) {
        //TODO: add code here
        points.add(point);
    }

    public int getLength() {
        //TODO: add code here
        Point lastPoint = null;
        double lengthSum = 0;
        for (Point p:
             points) {
            if(lastPoint == null) {
                lastPoint = p;
                continue;
            }
            double l = Math.sqrt(Math.pow(p.getX() - lastPoint.getX(), 2) + Math.pow(p.getY() - lastPoint.getY(), 2));
            lengthSum += l;
        }
        return (int) lengthSum;
    }


}
