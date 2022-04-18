package ro.unibuc.pao.homework;

import java.lang.Math;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {

    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getOneLineLength(Point p1, Point p2){
        // am aplicat formula de distanta din liceu
        return (int) Math.sqrt(Math.pow( (p2.getX() - p1.getX()), 2 ) + Math.pow( (p2.getY() - p1.getY()), 2));
    }
    //TODO: add code here


}
