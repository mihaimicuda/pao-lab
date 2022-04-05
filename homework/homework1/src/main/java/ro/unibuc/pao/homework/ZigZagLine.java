package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    // Declar o lista de puncte
    private List<Point> LinePoints;

    // Constructor
    public ZigZagLine(List<Point> LinePoints) {
        this.LinePoints = LinePoints;
    }
    // Aloc dinamic lista de puncte
    public ZigZagLine(Point... LinePoints) {
        this.LinePoints = new ArrayList<Point>(Arrays.asList(LinePoints));

    }
    // Am folosit functia predefinita add ( primul parametru - index-ul (in cazul nostru ultimul element) ,
    // al doilea parametru - elementul pe care vrem sa il adaugam
    public void addPoint(Point point) {
        LinePoints.add(LinePoints.size(), point);
    }

    public int getLength() {
    // Apelam functia din clasa Line.java
        int j = 0;
        int Distance = 0;
        while(j < LinePoints.size()-1){
           Distance += Distance2Points(LinePoints.get(j), LinePoints.get(j+1));
           j++;
        }
        return Distance;
    }
}
