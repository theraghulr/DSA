package Inheritance;

//Extends example;--

public class BoxWeigth extends Box {
    double weight;

   public BoxWeigth(){
       this.weight=-1;
    }

    public BoxWeigth(double l,double h,double w,double weight){
       super(l,h,w); // this calls the parent class Constructor;
       this.weight = weight;

    }


}
