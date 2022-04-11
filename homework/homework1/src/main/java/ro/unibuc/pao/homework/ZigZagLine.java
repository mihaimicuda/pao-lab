package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    //lista cu punctele liniei in zig zag
    private final List<Point> puncteZigZag;

    public ZigZagLine(List<Point> points) {
        //constructor puncteZigZag
        this.puncteZigZag= points;
    }

    public ZigZagLine(Point... puncteZigZag) {
        //constructor, alocare zona de memorie
        this.puncteZigZag= new ArrayList<Point>(Arrays.asList(puncteZigZag));
    }

    public void addPoint(Point point) {
        //adaugam inca un punct in linia de zig zag, o prelungim adica
        puncteZigZag.add(puncteZigZag.size(), point);
    }

    public int getLength() {
        //folosim functia din Line, lungimeLinie
        int lungimeTotala=0, i;
        for(i=0;i<puncteZigZag.size()-1;i++)
            lungimeTotala = lungimeTotala + lungimeLinie(puncteZigZag.get(i), puncteZigZag.get(i+1));
        return lungimeTotala;

    }

}
