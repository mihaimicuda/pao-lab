package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;


public class ZigZagLine extends Line {

    //TODO: add code here
    private List<Point> points;


    public ZigZagLine(List<Point> points) {
        //TODO: add code here
        this.points = points;

    }

    public ZigZagLine(Point... points) {
        //TODO: add code here
        this.points = new ArrayList<Point>();
        for(int i=0; i < points.length; i++){
            this.points.add(points[i]);
        }
    }

    public void addPoint(Point point) {
        //TODO: add code here
        this.points.add(point);
    }

    public int getLength() {
        //TODO: add code here
        int length = 0;
        if(this.points.size() > 1){
            for(int i=0; i < this.points.size()-1; i++){
                int p1x = this.points.get(i).getX();
                int p1y = this.points.get(i).getY();
                int p2x = this.points.get(i+1).getX();
                int p2y = this.points.get(i+1).getY();
                length = (int)(length + sqrt((p2x-p1x)*(p2x-p1x) + (p2y-p1y)*(p2y-p1y)));

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