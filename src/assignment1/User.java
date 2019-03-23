package assignment1;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Comparator;

class User {

    private String name;
    private int pinNumber;
    private Random random = new Random();

    //Constructor

    User(String name, int pinNumber) {
        this.name = name;
        this.pinNumber = pinNumber;
    }


    //Methods to randomly generate the balance for currentAccount, jointAccount and savingsAccount
    float generateCurrentAccount() {
        int value = random.nextInt(1000);
        float currentAccount = value + random.nextFloat();
        return formatFloat(currentAccount);
    }

    float generateJointAccount() {
        int value = random.nextInt(2000);
        float jointAccount = value + random.nextFloat();
        return formatFloat(jointAccount);
    }

    float generateSavingsAccount() {
        int value = random.nextInt(2000);
        float savingsAccount = value + random.nextFloat();
        return formatFloat(savingsAccount);
    }

    //Getter methods
    String getUserName() {
        return name;
    }

    int getPinNumber() {
        return pinNumber;
    }

    //Method to format float to .##
    private float formatFloat(float value) {
        DecimalFormat myFormatter = new DecimalFormat("###.##");
        String output = myFormatter.format(value);
        return Float.parseFloat(output);
    }

    //Comparator for sorting the arrayList of objects based on userNames
    static Comparator<User> UserNameComparator = (user1, user2) -> {
        String UserName1 = user1.getUserName().toUpperCase();
        String UserName2 = user2.getUserName().toUpperCase();

        //ascending order
        return UserName1.compareTo(UserName2);

    };

    //Method to compare 2 objects of the arrayList
    boolean equals(User user) {
        boolean isEqual = false;
        if (user != null && user instanceof User) {
            isEqual = (this.pinNumber == user.getPinNumber() && this.name.equalsIgnoreCase(user.getUserName()));
        }
        return isEqual;
    }

}
