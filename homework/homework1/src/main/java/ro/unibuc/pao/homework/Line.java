package ro.unibuc.pao.homework;

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

    public Point get_p1() {
        return p1;
    }

    public Point get_p2() {
        return p2;
    }

    public void set_p1(Point p1) {
        this.p1 = p1;
    }

    public void set_p2(Point p2) {
        this.p2 = p2;
    }

}
