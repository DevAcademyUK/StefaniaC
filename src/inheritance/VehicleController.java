package inheritance;

import java.util.Scanner;

public class VehicleController {

    Scanner myScanner = new Scanner(System.in);
    Car car = new Car((short)5, (short)4);
    Bus bus = new Bus((short)20, (short) 4);
    Truck truck = new Truck((short) 2, (short) 6);
    Motorbike motorbike = new Motorbike((short)2, (short)2 );
    Train train = new Train((short)300, (short)20);
    Bicycle bicycle = new Bicycle((short)1, (short)2);
    int speed = 1;


    public static void main(String[] args) {
        VehicleController vc = new VehicleController();
        vc.menu();
    }

    private void menu() {
        System.out.println("Which vehicle would you like to control today?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");

        int input = Integer.parseInt(myScanner.nextLine());
        switch (input){
            case 1:
                carMenu();
                break;
            case 2:
                busMenu();
                break;
            case 3:
                truckMenu();
                break;
            case 4:
                trainMenu();
                break;
            case 5:
                motorbikeMenu();
                break;
            case 6:
                bicycleMenu();
                break;
                default:
                    System.out.println("Wrong input. Please try again");
                    menu();
                    break;
        }
    }
    public void carMenu(){
        int choice = car.vehicleMenu();
        switch (choice){
            case 1:
                if (speed< 70){
                System.out.println("My current speed is: " + speed);
                speed = car.accelerate(speed);}
                else {
                    System.out.println("No, I can't accelerate more!");
                }
                carMenu();
                break;

            case 2:
                car.vehicleDetails();
                carMenu();
                break;
            case 3:
                System.out.println("In which direction would you like to steer?");
                String direction = myScanner.nextLine().toLowerCase();
                if (direction.equalsIgnoreCase("left")){
                    car.steer("Left");
                } else if (direction.equalsIgnoreCase("right")){
                    car.steer("Right");
                } else {
                    System.out.println("Wrong direction!");
                    carMenu();
                }
                carMenu();
                break;
            case 4:
                if (speed<1){
                    System.out.println("I can't break anymore!");
                }else {
                speed = car.brake(speed);}
                carMenu();
                break;
            case 5:
                speed = 1;
                menu();
                break;

                default:
                    System.out.println("Wrong input. Please try again.");
                    carMenu();
                    break;

        }

    }
    public void busMenu(){

        int choice = bus.vehicleMenu();
        switch (choice){
            case 1:
                if (speed< 50){
                    System.out.println("My current speed is: " + speed);
                    speed = bus.accelerate(speed);}
                else {
                    System.out.println("No, I can't accelerate more!");
                }
                busMenu();
                break;

            case 2:
                bus.vehicleDetails();
                busMenu();
                break;
            case 3:
                System.out.println("In which direction would you like to steer?");
                String direction = myScanner.nextLine().toLowerCase();
                if (direction.equalsIgnoreCase("left")){
                    bus.steer("Left");
                } else if (direction.equalsIgnoreCase("right")){
                    bus.steer("Right");
                } else {
                    System.out.println("Wrong direction!");
                    busMenu();
                }
                busMenu();
                break;
            case 4:
                if (speed<1){
                    System.out.println("I can't break anymore!");
                }else {
                    speed = bus.brake(speed);}
                busMenu();
                break;
            case 5:
                speed = 1;
                menu();
                break;

            default:
                System.out.println("Wrong input. Please try again.");
                busMenu();
                break;

        }
    }

    public void truckMenu() {


        int choice = truck.vehicleMenu();
        switch (choice) {
            case 1:
                if (speed< 70){
                    System.out.println("My current speed is: " + speed);
                    speed = truck.accelerate(speed);}
                else {
                    System.out.println("No, I can't accelerate more!");
                }
                truckMenu();
                break;

            case 2:
                truck.vehicleDetails();
                truckMenu();
                break;
            case 3:
                System.out.println("In which direction would you like to steer?");
                String direction = myScanner.nextLine().toLowerCase();
                if (direction.equalsIgnoreCase("left")) {
                    truck.steer("Left");
                } else if (direction.equalsIgnoreCase("right")) {
                    truck.steer("Right");
                } else {
                    System.out.println("Wrong direction!");
                    busMenu();
                }
                truckMenu();
                break;
            case 4:
                if (speed<1){
                    System.out.println("I can't break anymore!");
                }else {
                   speed = truck.brake(speed);}
                truckMenu();
                break;
            case 5:
                speed = 1;
                menu();
                break;

            default:
                System.out.println("Wrong input. Please try again.");
                truckMenu();
                break;
        }
    }

    public void trainMenu(){

            int choice = train.vehicleMenu();
            switch (choice) {
                case 1:
                    if (speed< 70){
                        System.out.println("My current speed is: " + speed);
                        speed = train.accelerate(speed);}
                    else {
                        System.out.println("No, I can't accelerate more!");
                    }
                    trainMenu();
                    break;

                case 2:
                    train.vehicleDetails();
                    trainMenu();
                    break;
                case 3:
                   train.steer("left or right");
                    trainMenu();
                    break;
                case 4:
                    if (speed<1){
                        System.out.println("I can't break anymore!");
                    }else {
                        speed = train.brake(speed);}
                    trainMenu();
                    break;
                case 5:
                    speed = 1;
                    menu();
                    break;

                default:
                    System.out.println("Wrong input. Please try again.");
                    trainMenu();
                    break;
            }
    }
    public void motorbikeMenu(){


        int choice = motorbike.vehicleMenu();
        switch (choice) {
            case 1:
                if (speed< 60){
                    System.out.println("My current speed is: " + speed);
                    speed = motorbike.accelerate(speed);}
                else {
                    System.out.println("No, I can't accelerate more!");
                }
                motorbikeMenu();
                break;

            case 2:
                motorbike.vehicleDetails();
                motorbikeMenu();
                break;
            case 3:
                System.out.println("In which direction would you like to steer?");
                String direction = myScanner.nextLine().toLowerCase();
                if (direction.equalsIgnoreCase("left")) {
                    motorbike.steer("Left");
                } else if (direction.equalsIgnoreCase("right")) {
                    motorbike.steer("Right");
                } else {
                    System.out.println("Wrong direction!");
                    motorbikeMenu();
                }
                motorbikeMenu();
                break;
            case 4:
                if (speed<1){
                    System.out.println("I can't break anymore!");
                }else {
                    speed = motorbike.brake(speed);}
                motorbikeMenu();
                break;
            case 5:
                speed = 1;
                menu();
                break;

            default:
                System.out.println("Wrong input. Please try again.");
                motorbikeMenu();
                break;
        }
    }

    public void bicycleMenu(){


        int choice = bicycle.vehicleMenu();
        switch (choice) {
            case 1:
                if (speed < 6){
                System.out.println("My current speed is: " + speed);
                speed = bicycle.accelerate(speed);}
                else {
                    System.out.println("No, I can't accelerate more!");
                }

                bicycleMenu();
                break;

            case 2:
                bicycle.vehicleDetails();
                bicycleMenu();
                break;
            case 3:
                System.out.println("In which direction would you like to steer?");
                String direction = myScanner.nextLine().toLowerCase();
                if (direction.equalsIgnoreCase("left")) {
                    bicycle.steer("Left");
                } else if (direction.equalsIgnoreCase("right")) {
                    bicycle.steer("Right");
                } else {
                    System.out.println("Wrong direction!");
                    bicycleMenu();
                }
                bicycleMenu();
                break;
            case 4:
                if (speed<1){
                    System.out.println("I can't break anymore!");
                }else {
                    speed = bicycle.brake(speed);}
                bicycleMenu();
                break;
            case 5:
                speed = 1;
                menu();
                break;

            default:
                System.out.println("Wrong input. Please try again.");
                bicycleMenu();
                break;
        }
    }

}
