package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagLine extends Line {

    private final List<Line> lines = new ArrayList<Line>();

    public ZigZagLine(List<Point> points) {
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            Point point1 = new Point(x1, y1);

            int x2 = points.get(i+1).getX();
            int y2 = points.get(i+1).getY();
            Point point2 = new Point(x2, y2);

            Line line = new Line(point1, point2);
            this.lines.add(line);
        }
    }

    public ZigZagLine(Point... points) {
        if (points.length < 2) {
            this.lines.add(new Line(new Point(), points[0]));
        }
        else {
            int index = 0;
            if (this.lines.size() == 0) {
                this.lines.add(new Line(points[0], points[1]));
                index = 2;
            }
            if (points.length > 2) {
                Point last_point = this.lines.get(lines.size() - 1).getP2();
                this.lines.add(new Line(last_point, points[index]));
                for (int i = index+1; i < points.length; i++) {
                    this.lines.add(new Line(points[i-1], points[i]));
                }
            }
        }
    }

    public void addPoint(Point point) {
        if (this.lines.size() == 0) {
            this.lines.add(new Line(new Point(), point));
        }
        else {
            Point last_point = this.lines.get(lines.size() - 1).getP2();
            this.lines.add(new Line(last_point, point));
        }
    }

    public double getLength() {
        double length = 0;
        for (Line line : this.lines) {
            Point p1 = line.getP1();
            Point p2 = line.getP2();
            length += super.getLineLength(p1, p2);

        }
        return length;
    }

    public static void main(String[] args) {
        List<Point> line_points = Arrays.asList(new Point(0,0),
                new Point(1,1), new Point(2,1), new Point(3,5));

        ZigZagLine zigzag = new ZigZagLine(line_points);
        for (int i = 0; i < zigzag.lines.size(); i++) {
            System.out.println(i);
            System.out.println(zigzag.lines.get(i));
        }
        System.out.println(zigzag.getLength()+"\n");


        ZigZagLine test = new ZigZagLine(new Point(0, 0), new Point(0, 1), new Point(1,2));
        for (int i = 0; i < test.lines.size(); i++) {
            System.out.println(test.lines.get(i));
        }
        System.out.println("\n");


        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        ZigZagLine zigZagLine = new ZigZagLine(p1, p2);

        p1.setX(1);
        p1.setY(1);

        for (int i = 0; i < zigZagLine.lines.size(); i++) {
            System.out.println(zigZagLine.lines.get(i));
        }

    }

}
