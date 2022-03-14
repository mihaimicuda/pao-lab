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

    public Point GetP1(){
        return p1;
    }

    public void SetP1(Point pt){
        this.p1=pt;
    }

    public Point GetP2(){
        return p2;
    }

    public void SetP2(Point pt) {
        this.p2 = pt;
    }


}
