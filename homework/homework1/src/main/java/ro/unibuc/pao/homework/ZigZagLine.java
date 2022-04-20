package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    //TODO: add code here
    private ArrayList<Line> lines;
    //private Line[] lines;

    public ZigZagLine(List<Point> points) {
        //TODO: add code here
        lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            Line newLine = new Line(points.get(i), points.get(i + 1));
            this.lines.add(newLine);
        }

    }

    public ZigZagLine(Point... points) {
        lines = new ArrayList<>();
        for (int i = 0; i < points.length - 1; i++) {
            Line l = new Line(points[i], points[i + 1]);
            this.lines.add(l);
        }

        /*int nrOfLines = 0;
        this.lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            this.lines[i] = new Line();
        }
        for (int i = 0; i < points.length - 1; i++) {
            this.lines[nrOfLines].setP1(points[i]);
            this.lines[nrOfLines++].setP2(points[i + 1]);
        }*/
    }

    public void showLines() {
        int i = 0;
        for (Line line : lines) {
            System.out.println("Line: " + i++);
            System.out.println(line.getP1().getX() + " " + line.getP1().getY());
            System.out.println(line.getP2().getX() + " " + line.getP2().getY());
        }
    }

    public void addPoint(Point point) {
        //TODO: add code here

        Line newLine = new Line(this.lines.get(this.lines.size() - 1).getP2(), point);
        lines.add(newLine);

        /*int nrOfLines = 0;
        Line[] newLines = new Line[this.lines.length + 1];

        for (int i = 0; i < this.lines.length + 1; i++) {
            newLines[i] = new Line();
        }
        for (int i = 0; i < this.lines.length; i++) {
            newLines[nrOfLines].setP1(this.lines[i].getP1());
            newLines[nrOfLines++].setP2(this.lines[i].getP2());
        }
        newLines[newLines.length - 1].setP1(newLines[newLines.length - 2].getP2());
        newLines[newLines.length - 1].setP2(point);
        this.lines = newLines;*/
    }

    public int getLength() {
        int totalLength = 0;
        for(Line line : lines) {
            totalLength += line.getLengthOfLine();
        }
        return totalLength;
    }

    /*public static void main(String[] args) {

        ZigZagLine zigZagLine = new ZigZagLine(
                new Point(0, 0),
                new Point(0, 1)
        );
        zigZagLine.showLines();
        System.out.println("TOTAL LENGTH: " + zigZagLine.getLength());
        zigZagLine.addPoint(new Point(3, 5));
        zigZagLine.showLines();
        System.out.println("TOTAL LENGTH: " + zigZagLine.getLength());

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(3, 5);
        List<Point> pointList = new ArrayList<Point>();
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
        ZigZagLine zigZagLine1 = new ZigZagLine(pointList);

        zigZagLine1.showLines();
        System.out.println("TOTAL LENGTH: " + zigZagLine1.getLength());

       ZigZagLine zigZagLine = new ZigZagLine(
                new Point(0, 0),
                new Point(0, 1)
        );
       zigZagLine.showLines();
       System.out.println(zigZagLine.getLength());
       zigZagLine.addPoint(new Point(1, 1));
       zigZagLine.showLines();
       System.out.println(zigZagLine.getLength());

        ZigZagLine zigZagLine1 = new ZigZagLine(
                new Point(0, 0),
                new Point(0, 1),
                new Point(3, 5)
        );
        zigZagLine1.showLines();
        System.out.println("TOTAL LENGTH: " + zigZagLine1.getLength());

    }*/
}

