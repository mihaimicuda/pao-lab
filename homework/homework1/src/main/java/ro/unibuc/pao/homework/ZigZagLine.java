import ro.unibuc.pao.homework.Point;

import java.util.List;
public class ZigZagLine extends Line{

    private List<Point> points;


    public ZigZagLine(List<Point> points) {
        this.points = points;
    }


    public void addPoint(Point point) {
        this.points.add(new Point(point));
    }

    public ZigZagLine(Point... points) {
        for (Point point : points)
        {
            addPoint(point);
        }
    }


    public int getSize(){
        return points.size();
    }
    public Point getPoint(int i){
        return points.get(i);
    }

    public double getLength() {
        int i;
        double s = 0;
        int  l = getSize();
        Point p1, p2;
        for(i = 0; i < l - 1; i++){
            p1 = getPoint(i);
            p2 = getPoint(i + 1);
            Line line = new Line(p1, p2);
            s += line.length();
        }
        return s;
    }

}

