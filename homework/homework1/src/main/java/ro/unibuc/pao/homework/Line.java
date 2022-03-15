package ro.unibuc.pao.homework;

//Librarie pentru sqrt si pow
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

    //Distanta dintre 2 puncte

    public int Distance2Points(Point x, Point y){

        // Am folosit formula matematica de calcul pentru distanta dintre 2 puncte in reper cartezian

        int Distance = (int) Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
        return  Distance;

    }

}
