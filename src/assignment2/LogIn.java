package assignment2;

import java.util.Scanner;

public class LogIn {

    private Scanner myScanner = new Scanner(System.in);
    private String userName;
    private String position;

    private ManageData manageData = new ManageData();

    //Starting point for the application
    public static void main(String[] args) {

        LogIn logIn = new LogIn();
        logIn.addEmployees();
    }

    //Populate the list of employees to have data to manipulate
    private void addEmployees(){
      manageData.populateList();
      menu();
    }


    //Main menu to check the level of access of the user and give access to a custom
    // menu based on the user's position in the company
    private void menu(){
        System.out.println("Please enter your name");
        userName = myScanner.nextLine();
        System.out.println("Please enter your position");
        position = myScanner.nextLine().toLowerCase();
        switch (position){
            case "employee":
                employeeMenu(userName, position);
            break;
            case "hr":
                for (Employee e : manageData.getEmployees()){
                    if (userName.equalsIgnoreCase(e.forename)){
                        if (position.equals(e.position)){
                        hrMenu(userName);
                        break;
                        }
                        else System.out.println("You are not a member of the HR Team! Access denied");
                    menu();}
                }
                break;
            case "manager":
                for (Employee e : manageData.getEmployees()){
                    if (userName.equalsIgnoreCase(e.forename)){
                        if (position.equals(e.position)){
                            managerMenu(userName);
                            break;
                        }
                        else System.out.println("You are not the HR Manager! Access denied");
                        menu();}
                }
                break;
                default:
                    System.out.println("That position does not exist, please try again");
                    menu();
                    break;
        }

        }

    //Menu for the employee (lowest level of access)
    private void employeeMenu(String userName, String position){
        System.out.println("Please select an option from the list bellow");
        System.out.println("1 - View your details");
        System.out.println("2 - Change your details");
        System.out.println("Press any key to return to main menu");
        int input = Integer.parseInt(myScanner.nextLine());
        switch (input){
            case 1:
                manageData.showUserData(userName);
                break;
            case 2:
                manageData.changeDetails(userName, position);
                employeeMenu(userName, position);
                break;
            default:
                menu();
                break;
        }
    }

    //Menu for the HR Team (mid-level access)
    private void hrMenu(String userName){
        System.out.println("Hello " + userName);
        System.out.println("Please select an option from the list bellow:");
        System.out.println("1 - View your details");
        System.out.println("2 - Add a new employee");
        System.out.println("3 - View the list of employees");
        System.out.println("4 - Change the details of an employee");
        System.out.println("5 - Return to main menu");
        int choice = Integer.parseInt(myScanner.nextLine());
        switch (choice){
            case 1:
                manageData.showUserData(userName);
                hrMenu(userName);
                break;
            case 2:
                manageData.addNewEmployee();
                hrMenu(userName);
                break;
            case 3:
                manageData.showEmployees();
                hrMenu(userName);
                break;
            case 4:
                manageData.changeDetails(userName, position);
                hrMenu(userName);
                break;
            default:
                menu();
                break;
        }
        hrMenu(userName);

    }


    //Manager menu (highest level of access)
    private void managerMenu(String userName) {
        System.out.println("Hello " + userName);
        System.out.println("Please select an option from the list bellow:");
        System.out.println("1 - View your details");
        System.out.println("2 - Add a new employee");
        System.out.println("3 - View the list of employees");
        System.out.println("4 - Change the details of an employee");
        System.out.println("5 - Get sorted lists");
        System.out.println("6 - Return to main menu");
        int choice = Integer.parseInt(myScanner.nextLine());
        switch (choice){
            case 1:
                manageData.showUserData(userName);
                managerMenu(userName);
                break;
            case 2:
                manageData.addNewEmployee();
                managerMenu(userName);
                break;
            case 3:
                manageData.showEmployees();
                managerMenu(userName);
                break;
            case 4:
                manageData.changeDetails(userName, position);
                managerMenu(userName);
                break;
            case 5:
                manageData.getSortedLists();
                managerMenu(userName);
                break;
            case 6:
                menu();
                break;
                default:
                    System.out.println("Wrong input. Please try again");
                    managerMenu(userName);
                    break;

        }

    }






    }



