package songs;

import java.util.Scanner;

public class DucksSongs {
    public static void main(String[] args){
        DucksSongs ducksSongs = new DucksSongs();
        ducksSongs.singDucksSong();
    }

    private void singDucksSong(){
        Scanner duckScannner =  new Scanner(System.in);

        System.out.println("How many ducks are there?");
        int ducksNumber = duckScannner.nextInt();
        String ducks = "little ducks";
        for (int i = ducksNumber; i>0; i--){
            if (i==1){
                ducks ="little duck";
                System.out.println(i + " " + ducks + " went out one day,");
                System.out.println("Over the hills and far away.");
                System.out.println("Mother duck said “Quack, quack, quack, quack”");
                System.out.println("But none of the " + ducksNumber + " little ducks came back");
                System.out.println();
            } else {

                System.out.println(i + " " + ducks + " went out one day,");
                System.out.println("Over the hills and far away.");
                System.out.println("Mother duck said “Quack, quack, quack, quack”");
                int newDucksNumber = i - 1;
                if (newDucksNumber == 1){
                    ducks = "little duck";
                }
                System.out.println("But only " + newDucksNumber + " " + ducks + " came back.");
                System.out.println();
            }
        }
        ducks = "little ducks";
        System.out.println("Sad mother duck went out one day…");
        System.out.println("Over the hills and far away");
        System.out.println("Mother duck said “QUACK! QUACK! QUACK! QUACK!”");
        System.out.println("And all of the " + ducksNumber + " " + ducks + " came back.");

        System.out.println();

    }
}
