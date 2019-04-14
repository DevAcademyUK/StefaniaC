package inheritance;

public class Bicycle extends Handlebars {

    public Bicycle(short numberOfSeats, short numberOfWheels){
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void vehicleDetails() {
        System.out.println("I have " + numberOfWheels + " wheels" + " and I can transport " + numberOfSeats + " person");
    }
}
