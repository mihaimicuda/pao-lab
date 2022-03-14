package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    private List<Point> pointsList;

    public ZigZagLine(List<Point> points) {
        this.pointsList = points;
    }

    public ZigZagLine(Point... points) {
        this.pointsList = new ArrayList<Point>(Arrays.asList(points));
    }

    public void addPoint(Point point) {
        this.pointsList.add(new Point(point.getX(),point.getY()));
    }

    public int getLength() {
        int size = 0;
        for (int i = 1; i < this.pointsList.size(); i++) {
            int y1 = this.pointsList.get(i-1).getY();
            int y2 = this.pointsList.get(i).getY();
            int x1 = this.pointsList.get(i-1).getX();
            int x2 = this.pointsList.get(i).getX();
            size += Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1)) ;
        }
        return size;
    }

}
