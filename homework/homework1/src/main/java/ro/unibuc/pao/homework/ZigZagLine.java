package ro.unibuc.pao.homework;

import java.util.List;
import java.util.ArrayList;

public class ZigZagLine extends Line {

    private List<Point> pointList;

    public ZigZagLine(List<Point> points) {

        this.pointList = points;
    }

    public ZigZagLine(Point... points) {
        this.pointList = new ArrayList<Point>();
        for(int i=0; i< points.length; i++) {
            this.pointList.add(points[i]);
        }
    }

    public void addPoint(Point point) {

        this.pointList.add(point);
    }

    public int getLength() {
        int length = 0;
        for (int i = 0; i < pointList.size() - 1; i++) {
            length += getLineLength(pointList.get(i), pointList.get(i+1));
        }
        return length;
    }

}
