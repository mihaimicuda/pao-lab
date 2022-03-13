package ro.unibuc.pao.homework;
import java.awt.geom.Point2D;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {

    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //TODO: add code here
    public Point getP1() {
        return p1;
    }
    public Point getP2() { return p2; }
    public void setP1(Point p1) {
        this.p1=p1;
    }
    public void setP2(Point p2) {
        this.p2=p2;
    }
    public int Length() {
        return (int) Point2D.distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

}
