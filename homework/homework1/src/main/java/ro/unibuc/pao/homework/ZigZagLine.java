package ro.unibuc.pao.homework;


import java.util.ArrayList;
import java.util.List;


public class ZigZagLine extends Line {

    //TODO: add code here

    ArrayList<Point> arr_points = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        for (Point p: points) {
            arr_points.add(new Point(p.getX(), p.getY()));
        }
    }

    public ZigZagLine(Point... points) {
        for (Point p: points) {
            arr_points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        arr_points.add(new Point(point.getX(), point.getY()));
    }

    public int getLength() {

        int len_line = 0;
        Point current_p = arr_points.get(0);
        for (int i = 1; i < arr_points.size(); i++) {
            Point next_p = arr_points.get(i);
            len_line += Math.sqrt(Math.pow(current_p.getX() - next_p.getX(), 2) + Math.pow(current_p.getY() - next_p.getY(), 2));
            current_p = next_p;
        }
        if (arr_points.size() < 2)
            len_line = 0;
        return len_line;
    }

}
