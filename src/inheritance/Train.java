package inheritance;

public class Train extends Vehicle {

    public Train(short numberOfSeats, short numberOfWheels){
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
    }


    public void steer(String dir) {
        System.out.println("I don't need to do anything " + "to turn " + dir + ", I just follow the tracks.");
    }
}
