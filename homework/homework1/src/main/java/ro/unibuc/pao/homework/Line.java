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

    //distanta dintre doua puncte intr-un sistem cartezian xOy
    // formula este AB = radical ( (xA - xB)^2 + (yA - yB)^2).
    public int lungimeLinie(Point p1, Point p2)
    {
        int lungime;
        lungime = (int) Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));
                return lungime;
    }


}
