package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class ZigZagLine extends Line {

    //TODO: add code here
    List<Point>points;

    public ZigZagLine(List<Point> points) {
//        TODO: add code here
        this.points = points;
    }


    public ZigZagLine(Point... points) {
//        TODO: add code here
        int i;
        this.points = new ArrayList<Point>();
        for(i=0;i<points.length;i++)
            this.points.add(points[i]);
    }

    public void addPoint(Point point) {
        //TODO: add code here
        this.points.add(point);
    }

    public int getLength() {
        //TODO: add code here

        int distanta= 0, i, x1,x2,y1,y2,d1;
         //distanta dintre doua puncte = radical [ (x2-x1)^2 + (y2-y1)^2 ]
        for(i=0; i<this.points.size()-1;i++) {
           x1 = this.points.get(i).getX();
           y1 = this.points.get(i).getY();
           x2 = this.points.get(i+1).getX();
           y2 = this.points.get(i+1).getY();
           d1 = (int) (Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
           distanta = distanta + (int) (Math.sqrt(d1));
        }

        return distanta;
    }
    
}
