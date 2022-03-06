package ro.unibuc.laborator.lab2;

public class Point {

    private int x, y; //-> no access modifier; can only be accessed from the same package

    public int m, n; //-> can be accessed from anywhere

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void doSomethingWithPoint() {
        int var;

        //System.out.println(var); -> variable not initialized, does not compile
        System.out.println(m); //-> compiles, becuase m is by default initialized with 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point) {
            if(this.x == ((Point) obj).x && this.y == ((Point) obj).y) {
                return true;
            }
        }
        return false;
    }
}
