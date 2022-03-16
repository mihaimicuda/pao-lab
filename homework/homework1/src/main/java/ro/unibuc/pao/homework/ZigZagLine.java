package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ZigZagLine extends Line {

    private final List<Point> pointsZigZag;

    public ZigZagLine(List<Point> points) {
        this.pointsZigZag = points;
    }

    public ZigZagLine(Point... points) {
        pointsZigZag = new ArrayList<Point>(Arrays.asList(points));
    }

    public void addPoint(Point point) {
        //adaugam un punct la finalul liniei
        pointsZigZag.add(pointsZigZag.size(),point);
    }

    public int getLength() {
        int length = 0;
        for(int i = 0; i < pointsZigZag.size()-1; i++)
            length = length + lengthLine(pointsZigZag.get(i), pointsZigZag.get(i+1));
        return length;
    }

}
