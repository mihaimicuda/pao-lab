package ro.unibuc.pao.homework;

import java.util.List;

import java.util.ArrayList;


public class ZigZagLine extends Line {

    //TODO: add code here
    List<Line>L=new ArrayList<Line>();
    public ZigZagLine(List<Point> points) {
        //TODO: add code here
    }

    public ZigZagLine(Point... points) {
        //TODO: add code here
        L.add(new Line(points[0],points[1]));
        if(points.length>2)
            L.add(new Line(points[1],points[2]));
    }

    public void addPoint(Point point) {
        //TODO: add code here
        L.add( new Line( L.get(0).getP2() , point ));
    }

    public int getLength() {
        int s=0;
        for(Line l : L) {
            s += l.Length();
        }
        return s;
    }

}
