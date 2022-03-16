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
    public Point getp1() {
        return p1;
    }

    public void setp1(int x) {
        this.p1 = p1;
    }

    public Point getp2() {
        return p2;
    }

    public void setp2(int y) {
        this.p2 = p2;
    }

}
