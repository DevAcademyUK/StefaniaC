package animals;

import java.util.Scanner;

public class CreateAnimal {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        CreateAnimal createAnimal = new CreateAnimal();
        createAnimal.getAnimalType();
    }



    public void getAnimalType(){

        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();
        if (animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase("cat")){
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create, please try again");
        }

    }

    private void createCat() {
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();

        System.out.println("What colour is the cats fur?");
        String furColour = myScanner.nextLine();

        System.out.println("How old is the cat?");
        int age = myScanner.nextInt();

        Cat myCat = new Cat(name, age, furColour);
        System.out.println(myCat.play(age));
        System.out.println(myCat.beHuman(name, age, furColour));

    }


    private void createDog() {

        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();

        System.out.println("What breed is the dog? Poodle? Labrador? Or Boarder Collie?");
        String breed = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();

        Dog myDog = new Dog(name, size,age, breed);

        System.out.println(myDog.bark(size));
        System.out.println(myDog.play(breed));
        System.out.println(myDog.beHuman(name, age, breed));
    }
}
