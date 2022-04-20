package ro.unibuc.pao.homework;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {
//        System.out.println("You must input 2 points to create a Line.");
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public int getLength() {
        int x1 = this.p1.getX();
        int y1 = this.p1.getY();

        int x2 = this.p2.getX();
        int y2 = this.p2.getY();

        return (int) Math.hypot(x1 - x2, y1 - y2);
    }

}

