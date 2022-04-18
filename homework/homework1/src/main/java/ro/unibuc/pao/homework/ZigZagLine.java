package ro.unibuc.pao.homework;

import java.util.List;
import java.util.ArrayList;

public class ZigZagLine extends Line {

    //TODO: add code here
    private ArrayList<Line> lines;

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
    }

    public int getLength() {
        int totalLength = 0;
        for(Line line : lines) {
            totalLength += line.getLengthOfLine();
        }
        return totalLength;
    }

}
