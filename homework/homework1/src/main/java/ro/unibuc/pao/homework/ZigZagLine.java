package ro.unibuc.pao.homework;
import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    private List<Point> lista;

    public ZigZagLine(List<Point> points) {
        lista = new ArrayList<Point>(points);
    }

    public ZigZagLine(Point... points) {
        lista = new ArrayList<Point>();
        for(Point i : points)
            lista.add(i);
    }

    public void addPoint(Point point) {
        lista.add(point);
    }

    public int getLength() {
        int len = 0;
        for(int i = 0; i < lista.size() - 1; i++)
            len += Math.sqrt(
                Math.pow(lista.get(i).getX() - lista.get(i + 1).getX(), 2) +
                Math.pow(lista.get(i).getY() - lista.get(i + 1).getY(), 2)
            );
        return len;
    }
}
