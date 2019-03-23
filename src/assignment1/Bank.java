package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bank {

    private float currentAccount;
    private float jointAccount;
    private float savingsAccount;
    private Scanner myScanner = new Scanner(System.in);
    private ArrayList<User> users;

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createUsers();
    }

    //Method to create  the arrayList of users
    private void createUsers() {
        User user1 = new User("Alex", 1111);
        User user2 = new User("Steve", 2222);
        User user3 = new User("Emily", 3333);
        User user4 = new User("Olivia", 4444);
        User user5 = new User("Alice", 5555);
        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        //Sorting the arrayList based on userName
        Collections.sort(users, User.UserNameComparator);
        for (User user : users) {
            System.out.println(user.getUserName());
        }
        logIn();
    }

    //Method to verify userName and pinNumber from user input
    private void logIn() {
        System.out.println("What is your name?");
        String userName = myScanner.nextLine();
        System.out.println("What is your pin?");
        int pinNumber = Integer.parseInt(myScanner.nextLine());
        User logUser = new User(userName, pinNumber);
        for (User user : users) {
            if (user.equals(logUser)) {
                System.out.println("You are logged in");
                System.out.println("This is your balance:");
                currentAccount = logUser.generateCurrentAccount();
                jointAccount = logUser.generateJointAccount();
                savingsAccount = logUser.generateSavingsAccount();
                displayBalance();
                userMenu();
            } else {
                System.out.println("Wrong user name or pin number. Please try again");
                logIn();
            }
        }
    }

    //Displays the balance of each account when the user logs in
    private void displayBalance() {
        System.out.println("Your Current Account balance is: " + currentAccount);
        System.out.println("Your Savings Account balance is: " + savingsAccount);
        System.out.println("Your Joint Account balance is: " + jointAccount);
    }

    //Method to determine what action the user wants to make
    private void userMenu() {
        System.out.println("What do you wish to do? Withdraw? Deposit? Transfer? Log out?");
        String userChoice = myScanner.nextLine().toLowerCase();
        switch (userChoice) {
            case "withdraw":
                System.out.println("From which account? Current? Savings? Joint?");
                float accountId = getAccount();
                withdrawFunds(accountId);
                break;
            case "deposit":
                System.out.println("To which account? Current? Savings? Joint?");
                accountId = getAccount();
                depositFunds(accountId);
                break;
            case "transfer":
                transferFunds();
                break;
            case "log out":
                logOut();
                break;
            default:
                System.out.println("Invalid choice. Please try again");
                userMenu();
                break;
            }
    }

    //Method to determine what account the user has selected
    private float getAccount() {
        String accountName = myScanner.nextLine().toLowerCase();
        float accountId = 0;
        switch (accountName) {
            case "current":
                accountId = currentAccount;
                break;
            case "savings":
                accountId = savingsAccount;
                break;
            case "joint":
                accountId = jointAccount;
                break;
            default:
                System.out.println("Account not recognised. Please try again");
                getAccount();
                break;
        }
        return accountId;
    }

    private void withdrawFunds(float account) {
        System.out.println("How much do you want to withdraw? Please enter a fix amount");
        int amount = myScanner.nextInt();
        if (account == currentAccount) {
            currentAccount = currentAccount - amount;
            System.out.println("The new balance of your Current Account is: " + currentAccount);
        } else if (account == savingsAccount) {
            savingsAccount = savingsAccount - amount;
            System.out.println("The new balance of your Savings Account is: " + savingsAccount);
        } else {
            jointAccount = jointAccount - amount;
            System.out.println("The new balance of your Joint Account is: " + jointAccount);
        }
        userMenu();
    }

    private void depositFunds(float account) {
        System.out.println("How much do you want to deposit? Please enter a fix amount");
        int amount = myScanner.nextInt();
        if (account == currentAccount) {
            currentAccount = currentAccount + amount;
            System.out.println("The new balance of your Current Account is: " + currentAccount);
        } else if (account == savingsAccount) {
            savingsAccount = savingsAccount + amount;
            System.out.println("The new balance of your Savings Account is: " + savingsAccount);
        } else {
            jointAccount = jointAccount + amount;
            System.out.println("The new balance of your Joint Account is: " + jointAccount);
        }
        userMenu();
    }

    private void transferFunds() {
        System.out.println("Which account would you like to transfer from?");
        String fromAccount = myScanner.nextLine().toLowerCase();
        System.out.println("Which account would you like to transfer to?");
        String toAccount = myScanner.nextLine();
        System.out.println("How much would you like to transfer?");
        float amount = Float.parseFloat(myScanner.nextLine());
        switch (fromAccount) {
            case "current":
                if (currentAccount >= amount) {
                    if (toAccount.equalsIgnoreCase("Joint")) {
                        jointAccount += amount;
                        currentAccount -= amount;
                    } else if (toAccount.equalsIgnoreCase("Savings")) {
                        savingsAccount += amount;
                        currentAccount -= amount;
                    } else {
                        System.out.println("Invalid destination account");
                    }
                }
                break;

            case "joint":
                if (jointAccount >= amount) {
                    if (toAccount.equalsIgnoreCase("Current")) {
                        currentAccount += amount;
                        jointAccount -= amount;
                    } else if (toAccount.equalsIgnoreCase("Savings")) {
                        savingsAccount += amount;
                        jointAccount -= amount;
                    } else {
                        System.out.println("Invalid destination account");
                    }
                }
                break;

            case "savings":
                if (savingsAccount >= amount) {
                    if (toAccount.equalsIgnoreCase("Current")) {
                        currentAccount += amount;
                        savingsAccount -= amount;
                    } else if (toAccount.equalsIgnoreCase("Joint")) {
                        jointAccount += amount;
                        savingsAccount -= amount;
                    } else {
                        System.out.println("Invalid destination account");
                    }
                }
                break;

            default:
                System.out.println("Invalid source account");
                break;
        }
        userMenu();
    }

    private void logOut() {
        System.out.println("Logging Out");
        logIn();
    }
}

