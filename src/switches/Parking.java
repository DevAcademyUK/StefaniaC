package switches;

import java.util.Scanner;

public class Parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Parking parking = new Parking();
        parking.getInput();

    }

    private void getInput(){
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the college? (Staff/Student/Visitor) ");
        String position =  myScanner.nextLine();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position ){

        int cost;
        int hourlyRate;
        int multiplier;

        switch (position){
            case "Staff":
                multiplier = 2;
                break;

            case "Student":
                multiplier = 1;
                break;

            case "Visitor":
                multiplier = 3;
                break;

                default:
                    multiplier = 1;
                    break;
        }

        switch (day){
            case "Monday":
                hourlyRate = 2;
                break;
            case "Tuesday":
                hourlyRate = 2;
                break;
            case "Wednesday":
                hourlyRate = 3;
                break;
            case "Thursday":
                hourlyRate = 2;
                break;
            case "Friday":
                hourlyRate = 3;
                break;
            case "Saturday":
                hourlyRate = 4;
                break;
            case "Sunday":
                hourlyRate = 5;
                break;
                default:
                    hourlyRate = 1;
                    break;
        }

        cost = (hourlyRate * multiplier) * duration;
        System.out.println("thanks for parking at Gateshead College, Please Pay: " + cost);

    }
}
