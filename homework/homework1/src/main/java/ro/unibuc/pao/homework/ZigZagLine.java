package ro.unibuc.pao.homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZigZagLine extends Line {
    private final List<Point> points;
    //TODO: add code here

    public ZigZagLine(List<Point> points) {
        this.points = points;
        //TODO: add code here
    }

    public ZigZagLine(Point... points) {
        //pentru a trece ultimul test, am alocat o zona de memorie separata in constructor
        //creand o lista inlantuita alocata dinamic ca sa obtin un deep-copy, in care am pus
        //elementele din array vazute ca o lista
        this.points = new LinkedList<Point>(Arrays.asList(points));
        //TODO: add code here
    }

    public void addPoint(Point point) {
        points.add(points.size(), point);
        //TODO: add code here
    }

    public int getLength() {
        int sum = 0;
        for(int i = 0; i < points.size()-1; i++){
            sum += getOneLineLength(points.get(i), points.get(i+1));
        }
        return sum;
        //TODO: add code here
    }

}
