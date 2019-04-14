package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ManageData {

    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private Scanner myScanner = new Scanner(System.in);

    //Method to populate the arrayList with data at the start of the application
    void populateList() {

        employees.add(new Employee("Miss",
                "Anna",
                "Smith",
                "1990 07 12",
                "6 Union Street",
                "Bristol",
                "Bristol",
                "BS1 7PR",
                "07451236547",
                "anna.smith@gmail.com",
                1234,
                "employee",
                "2019 01 15"));
        employees.add(new Employee("Miss",
                "Emily",
                "Smith",
                "1980 03 07",
                "10 Union Street",
                "Bristol",
                "Bristol",
                "BS1 7PR",
                "07451236547",
                "emily.smith@gmail.com",
                1111,
                "manager",
                "2017 02 18"));

        employees.add(new Employee("Miss",
                "Sarah",
                "Smith",
                "1990 08 13",
                "6 Union Street",
                "Bristol",
                "Bristol",
                "BS1 7PR",
                "07451236547",
                "sarah.smith@gmail.com",
                1343,
                "hr",
                "2018 10 26"));
    }

    //Method to add a new employee to the arrayList
    private void addEmployee(Employee e) {
        this.employees.add(e);
    }

    //Method to return a list of employees
    ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    //Method to add a new employee based on user input
    void addNewEmployee() {
        System.out.println("Please input title");
        String title = myScanner.nextLine();
        System.out.println("Please input forename");
        String forename = myScanner.nextLine();
        System.out.println("Please input surname");
        String surname = myScanner.nextLine();
        System.out.println("Please input date of birth");
        String dOB = myScanner.nextLine();
        System.out.println("Please input address");
        String address = myScanner.nextLine();
        System.out.println("Please input town");
        String town = myScanner.nextLine();
        System.out.println("Please input county");
        String county = myScanner.nextLine();
        System.out.println("Please input Post Code");
        String postCode = myScanner.nextLine();
        System.out.println("Please input contact number");
        String contactNumber = myScanner.nextLine();
        System.out.println("Please input email address");
        String emailAddress = myScanner.nextLine();
        System.out.println("Please input employee ID");
        int employeeID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please input position");
        String position = myScanner.nextLine();
        System.out.println("Please input start date");
        String startDate = myScanner.nextLine();
        Employee newEmployee = new Employee(title, forename, surname, dOB, address, town, county,
                postCode, contactNumber, emailAddress, employeeID, position, startDate);
        addEmployee(newEmployee);


    }

    //Method to show a list of all the employees
    void showEmployees() {
        for (Employee e : employees) {
            System.out.println("Employee: " + e.title + " " + e.forename + " " + e.surname + " DOB: " + e.dOB + " Address: " + e.address1
                    + " " + e.town + " " + e.county + " " + e.postCode + " Contact number: " + e.contactNumber + " Email Address: "
                    + e.emailAddress + " Employee ID: " + e.employeeID + " Position: " + e.position + " Start Date: " + e.startDate);
        }
    }

    //Method to display the user data based on inputted name
    void showUserData(String userName) {

        for (Employee e : employees) {
            if (userName.equalsIgnoreCase(e.forename)) {
                System.out.println("Your details are:");
                System.out.println("Employee: " + e.title + " " + e.forename + " " + e.surname + " DOB: " + e.dOB + " Address: " + e.address1
                        + " " + e.town + " " + e.county + " " + e.postCode + " Contact number: " + e.contactNumber + " Email Address: "
                        + e.emailAddress + " Employee ID: " + e.employeeID + " Position: " + e.position + " Start Date: " + e.startDate);
            }
        }
    }

    //Method to change the details of an employee
    void changeDetails(String userName, String position) {
        if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
            System.out.println("Please input the name of the employee you want to make changes to");
            userName = myScanner.nextLine();
        }
        System.out.println("Please select the field you want to change");
        System.out.println("1 - Title");
        System.out.println("2 - Forename");
        System.out.println("3 - Surname");
        System.out.println("4 - Address");
        System.out.println("5 - Town");
        System.out.println("6 - County");
        System.out.println("7 - Post Code");
        System.out.println("8 - Contact Number");
        System.out.println("9 - Email Address");
        if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
            System.out.println("10 - Date of Birth");
            System.out.println("11 - Employee ID");
            System.out.println("12 - Position");
            System.out.println("13 - Start Date");
        }
        int input = Integer.parseInt(myScanner.nextLine());
        for (Employee e : employees) {
            if (userName.equalsIgnoreCase(e.forename)) {
                if (position.equalsIgnoreCase("employee") || position.equalsIgnoreCase("hr")
                        || position.equalsIgnoreCase("manager")) {
                    switch (input) {
                        case 1:
                            System.out.println("Please input the new title");
                            e.title = myScanner.nextLine();
                            System.out.println("Your new title is: " + e.title.toUpperCase());
                            break;
                        case 2:
                            System.out.println("Please input the new forename");
                            e.forename = myScanner.nextLine();
                            System.out.println("Your new forename is " + e.forename.toUpperCase());
                            break;
                        case 3:
                            System.out.println("Please input the new surname");
                            e.surname = myScanner.nextLine();
                            System.out.println("Your new forename is " + e.surname.toUpperCase());
                            break;
                        case 4:
                            System.out.println("Please input the new address");
                            e.address1 = myScanner.nextLine();
                            System.out.println("Your new address is " + e.address1.toUpperCase());
                            break;
                        case 5:
                            System.out.println("Please input the new town");
                            e.town = myScanner.nextLine();
                            System.out.println("Your new town is " + e.town.toUpperCase());
                            break;
                        case 6:
                            System.out.println("Please input the new county");
                            e.county = myScanner.nextLine();
                            System.out.println("Your new county is " + e.county.toUpperCase());
                            break;
                        case 7:
                            System.out.println("Please input the new post code");
                            e.postCode = myScanner.nextLine();
                            System.out.println("Your new post code is " + e.postCode.toUpperCase());
                            break;
                        case 8:
                            System.out.println("Please input the new contact number");
                            e.contactNumber = myScanner.nextLine();
                            System.out.println("Your new contact number is " + e.contactNumber);
                        case 9:
                            System.out.println("Please input the new email address");
                            e.emailAddress = myScanner.nextLine();
                            System.out.println("Your new email address is " + e.emailAddress);
                        default:
                            System.out.println("Wrong input. Please try again");
                            break;
                    }
                    if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
                        switch (input) {
                            case 10:
                                System.out.println("Please input the new date of birth");
                                e.dOB = myScanner.nextLine();
                                System.out.println("Your new date of birth is: " + e.dOB);
                                break;
                            case 11:
                                System.out.println("Please input the new Employee ID");
                                e.employeeID = myScanner.nextInt();
                                System.out.println("Your new Employee ID is " + e.employeeID);
                                break;
                            case 12:
                                System.out.println("Please input the new Position");
                                e.position = myScanner.nextLine();
                                System.out.println("Your new position is " + e.position);
                                break;
                            case 13:
                                System.out.println("Please input the new start date");
                                e.startDate = myScanner.nextLine();
                                System.out.println("Your new start date is " + e.startDate);
                                break;
                            default:
                                System.out.println("Wrong input. Please try again");
                                break;
                        }

                    }
                }
            }
        }

    }

    //Method to get a sorted list of obj property based on user input
    void getSortedLists(){
        System.out.println("Please select what field you wish to sort : title, forename, surname, dob, address, town, county, post code, contact number, email, id, position, start date");
        String fieldToSort = myScanner.nextLine().toLowerCase();
        System.out.println("Please select order:");
        System.out.println("A - Ascending");
        System.out.println("D - Descending");
        String order = myScanner.nextLine();
        switch (fieldToSort){
            case "title":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareTitle);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareTitle.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.title);
                }
                break;

            case "forename":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareForename);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareForename.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.forename);
                }
                break;

            case "surname":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareSurname);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareSurname.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.surname);
                }
                break;

            case "dob":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareDOB);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareDOB.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.dOB + " " + e.forename);
                }
                break;

            case "address":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareAddress);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareAddress.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.address1);
                }
                break;

            case "town":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareTown);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareTown.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.town);
                }
                break;

            case "county":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareCounty);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareCounty.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.county);
                }
                break;

            case "post code":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.comparePostCode);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.comparePostCode.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.postCode);
                }
                break;

            case "contact number":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareContactNumber);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareContactNumber.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.contactNumber);
                }
                break;

            case "email":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareEmailAddress);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareEmailAddress.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.emailAddress);
                }
                break;

            case "id":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareID);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareID.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.employeeID);
                }
                break;

            case "position":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.comparePosition);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.comparePosition.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.position);
                }
                break;

            case "start date":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareStartDate);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareStartDate.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.startDate + " " + e.forename);
                }
                break;

                default:
                    System.out.println("Wrong input. Please try again");
                    getSortedLists();
                    break;
        }

    }


}
