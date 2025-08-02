package Interface;

public class Car implements Vechile{
    int speed;
    int gear;
    int brake;

    @Override
    public void speed(int speed){
        this.speed = speed + speed;
        System.out.println("Speed is now "+ this.speed);
    }

    @Override
    public void gear(int gear){
        this.gear = gear + gear;
        System.out.println("Gear is now " + this.gear );
    }

    @Override
    public void brake(){
        System.out.println("Brakes have been applied");

    }
}
