package ro.unibuc.laborator;

import ro.unibuc.laborator.lab2.ImmutablePoint;
import ro.unibuc.laborator.lab2.Line;
import ro.unibuc.laborator.lab2.Point;
import ro.unibuc.laborator.lab2.Square;

public class PackagesApp {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(1, 10);
        Line line = new Line(p1, p2);
        System.out.println(line);

        p1.setX(3);
        /**
         * Important to note that even if we don't modify the line directly, but we modify an object that composes the
         * line, the line itself will still be modified
         */
        System.out.println(line);

        System.out.println("-----------------------------------------------");

        int xImm = 2;
        int yImm = 3;
        ImmutablePoint immutablePoint = new ImmutablePoint(xImm, yImm);
        System.out.println(immutablePoint);
        xImm = 10;
        /**
         * Java is pass by value, which means when we pass an argument to a method, it will pass the value of that parameter
         * For a primitive type, it will pass basically a copy, so if we change the value of the original param,
         * the object will not be affected
         * For an object type, the value we pass is the value of a reference, so when we call a setter method on that
         * reference, the object behind it will actually change
         */
        System.out.println(immutablePoint);

        System.out.println("-----------------------------------------------");

        /**
        == verifies reference equality. If the reference points to the same location in memory -> true
         .equals() verifies equality from a business perspective. In below case, both points are the same as they
         have the same coordinates, but they are at different locations in memory
         */
        Point p12 = new Point(1, 2);
        Point p21 = new Point(1, 2);
        System.out.println(p12);
        System.out.println(p21);
        System.out.println(p12 == p21); //false, different objects/references
        System.out.println(p12.equals(p21)); //true, same coordinates, because we implemented equals in Point class

        p12.equals("asdasdas");

        System.exit(0);

//        ImmutablePoint immutablePoint = new ImmutablePoint(1,2);
//        Point point = new Point();
//        point.setX(2);
//        point.setY(3);
//
//        Point secondPoint = new Point(4, 5);
//        System.out.println(point);

//        System.out.println(point.x); //-> not allowed, will not compile;
//        System.out.println(point.m);
//
//        Square square = new Square();
//        square.getLength();
    }
}
