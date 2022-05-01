package ro.unibuc.pao.homework;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class ZigZagLine extends Line {

    ArrayList<Point> ZZLinePoints = new ArrayList<>();

    public ZigZagLine(List<Point> points) {
        for(Point pt : points){
            ZZLinePoints.add(new Point(pt.getX(), pt.getY()));
        }
    }

    public ZigZagLine(Point... points) {
        for(Point pt : points){
            ZZLinePoints.add(new Point(pt.getX(), pt.getY()));
        }
    }

    public void addPoint(Point point) {
        ZZLinePoints.add(new Point(point.getX(), point.getY()));
    }

    public int getLength() {
        if(ZZLinePoints.size()>=2)
        {
            int ZZLineLength=0;
            Point LastPoint = ZZLinePoints.get(0);
            for(Point ActPoint:ZZLinePoints){
                double Distance = Math.sqrt((ActPoint.getX()-LastPoint.getX())*(ActPoint.getX()-LastPoint.getX()) + (ActPoint.getY()-LastPoint.getY())*(ActPoint.getY()-LastPoint.getY()));
                LastPoint=ActPoint;
                ZZLineLength+=Distance;
            }
            return ZZLineLength;
        }
        return 0;
    }

}
