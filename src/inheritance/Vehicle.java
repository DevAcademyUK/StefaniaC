package inheritance;

import java.util.Scanner;

public class Vehicle {

    public short numberOfSeats;
    public short numberOfWheels;

    public int accelerate(int speed){

        System.out.println("I accelerate by turning my wheels!");
        speed = speed+1;
        return speed;
    }

    public int brake(int speed){
        System.out.println("I brake by applying pressure to brake discs on my wheels ");
        speed = speed-1;
        return speed;
    }

    public void steer(String dir){

    }

    public void vehicleDetails(){
        System.out.println("I have " + numberOfWheels + " wheels" + " and I can transport " + numberOfSeats + " people");
    }

    public int vehicleMenu(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What would you like to do with your vehicle?");
        System.out.println("1 - Accelerate");
        System.out.println("2 - See vehicle details");
        System.out.println("3 - Steer");
        System.out.println("4 - Brake");
        System.out.println("5 - Select another vehicle");
        return  Integer.parseInt(myScanner.nextLine());
//        Object object =  new Object();

    }
}
