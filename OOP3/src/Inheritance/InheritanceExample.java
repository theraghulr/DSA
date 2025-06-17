package Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Box box = new Box(9.9);
        Box box2 = new Box(2.6,58,82);

        System.out.println(box.l+" "+box.h+" "+box.w);
        System.out.println(box2.l+" "+box2.h+" "+box2.w);
        BoxWeigth box3 = new BoxWeigth();
        System.out.println(box3.h+" "+box3.weight);

        BoxWeigth box4 = new BoxWeigth(2,0.9,2.4,34);
        System.out.println(box4.l+" "+box4.h+" "+box4.w+" "+ box4.weight);
    }
}
