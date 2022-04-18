package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLine extends Line {

    private List<Point> puncte = new ArrayList<>();


    public ZigZagLine(List<Point> points) {

        for (Point point : points)
        {
            this.puncte.add(new Point(point));
        }

    }

    public ZigZagLine(Point... points) {
        for (Point point : points)
        {
            this.puncte.add(new Point(point));
        }
    }

    public void addPoint(Point point) {

        this.puncte.add(new Point(point));
    }

    public double getLength() {

        Point prevPoint = this.puncte.get(0);

        int length = 0;

        for (int i = 1; i < this.puncte.size(); ++i)
        {
            Point nowPoint = this.puncte.get(i);
            System.out.println(prevPoint);
            System.out.println(nowPoint);
            System.out.println(super.getLength(prevPoint, nowPoint));
            length += super.getLength(prevPoint, nowPoint);
            prevPoint = nowPoint;

        }

        return length;
    }

    @Override
    public String toString()
    {
        return "Zigzag line: { " + puncte + " }";
    }

}
