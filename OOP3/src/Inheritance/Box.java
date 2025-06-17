package Inheritance;

public class Box {
    double l;
    double h;
    double w;


    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;

    }
    Box(){
        this.l = l;
        this.h = h;
        this.w = w;

    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;

    }
}
