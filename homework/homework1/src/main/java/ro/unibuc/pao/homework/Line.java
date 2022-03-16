package ro.unibuc.pao.homework;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line() {
        this.p1 = new Point(0,0);
        this.p2 = new Point(0,1);
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLineLength(Point p1, Point p2) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public Point getP1() { return p1; }

    public Point getP2() { return p2; }

    @Override
    public String toString() {
        return "Line{" + p1 +", "+ p2 + '}';
    }

}
