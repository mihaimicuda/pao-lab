package ro.unibuc.pao.homework;

public class Point {

    private final int x;
    private final int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        //this.x = x;
        System.out.println("Changing the coordinate x with " + x + " is not allowed!");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        //this.y = y;
        System.out.println("Changing the coordinate y with " + y + " is not allowed!");
    }

    @Override
    public String toString() {
        return "Point=(" + x + ", " + y + ")";
    }
}
