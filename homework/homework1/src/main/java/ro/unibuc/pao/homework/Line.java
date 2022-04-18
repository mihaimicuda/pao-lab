package ro.unibuc.pao.homework;

import java.lang.Math;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {

    }

    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public double getLength(Point p1 , Point p2)
    {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY()-p2.getY()),2));
    }

    public double getLength()
    {
        return getLength(this.p1, this.p2);
    }

    //TODO: add code here
    @Override
    public String toString(){
        return "Line: { "+"p1= "+p1+", p2= "+p2+" }";
    }

}
