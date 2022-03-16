package ro.unibuc.pao.homework;

import java.lang.Math;

public class Line {
        private Point p1;
        private Point p2;

        public Line() {

        }

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public Point getP1(){
            return this.p1;
        }

        public void setP1(Point p1){
            this.p1 = p1;
        }

        public Point getP2(){
            return this.p2;
        }

        public void setP2(Point p2){
            this.p2 = p2;
        }
        public double length(){
            int x1 = getP1().getX();
            int x2 = getP2().getX();
            int y1 = getP1().getY();
            int y2 = getP2().getY();
            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        }
    }

