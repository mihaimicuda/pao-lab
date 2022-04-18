package ro.unibuc.pao.homework;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {

    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int lengthLine(Point p1, Point p2){
        int length;
        length = (int) Math.sqrt(Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(),2));
        // formula de calcul al distantei unei linii
        return length;
    }


}
