package ro.unibuc.pao.homework;

import java.util.List;

public class ZigZagLine extends Line {
    public ArrayList<Point> points = new ArrayList<>();

    public ZigZagLine() {
        //TODO: add code here
    }

    public ZigZagLine(Point...points) {
        if(points.length >= 2) {
            this.points.addAll(List.of(points));
            super.setP1(this.points.get(0));
            super.setP2(this.points.get(1));
        } else {
            System.out.println("You must input at least 3 points to create a ZigZagLine.");
        }
    }


    public void addPoint(Point point) {
        this.points.add(point);
    }

    @Override
    public int getLength() {
        if(this.points.size() > 2) {
            int length = super.getLength();
            Point lastPoint = this.getP2();
            for (int i = 2; i < this.points.size(); i++) {
                Line line = new Line(lastPoint, this.points.get(i));
                length += line.getLength();
                lastPoint = this.points.get(i);
            }
            return length;
        }

        else {
            if (this.points.size() == 2) {
                return super.getLength();
            } else {
                return 0;
            }
        }
    }

}