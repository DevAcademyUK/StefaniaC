package library;

import com.sun.source.tree.IfTree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Scanner myScanner = new Scanner(System.in);

    Book[] books = new Book[6];
    Member[] members = new Member[5];
    Loan[] loans = new Loan[2];
    ArrayList<Reserve> reservedBooks = new ArrayList<Reserve>();

    public static void main(String[] args) {
        Library lib = new Library();
        lib.init();

    }

    public void init(){
        books[0]= new Book(1, "In Search of Lost Time", "Marcel Proust", "1913");
        books[1] = new Book(2, "Ulysses", "James Joyce", "1922");
        books[2] = new Book(3, "Moby Dick", "Herman Melville", "1851");
        books[3] = new Book(4, "Pride and Prejudice", "Jane Austen", "1813");
        books[4] = new Book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387");
        books[5] = new Book(6, "Emma", "Jane Austen", "1815");

        members[0] = new Member(1, "Dean", "Lewis", (byte) 30);
        members[1] = new Member(2, "Steve", "Beckwith", (byte) 55);
        members[2] = new Member(3, "Lisa", "Crow", (byte) 39);
        members[3] = new Member(4, "Vicky", "Cross", (byte) 37);
        members[4] = new Member(5, "Rachel", "Alsop", (byte) 25);

        loans[0] = new Loan(2, 4, "07/04/2019", "2019 04 13");
        loans[1] = new Loan(5, 2, "27/03/2019", "2019 04 07");


        menu();


    }

    private void menu() {
        System.out.println("Welcome to Dean's library");
        System.out.println("Select an option from the list below:");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check if a book is available");
        System.out.println("3 - Search for an Author");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                searchBook();
                break;
            case 2:
                checkBook();
                break;

            case 3:
                searchAuthor();
                break;

                default:
                    System.out.println("invalid input provided, please try again");
                    menu();
        }
    }

    private void searchBook(){
        System.out.println("What is the name of the book you would like to search for?");
        String title = myScanner.nextLine();

        for (int i = 0; i < books.length; i++){
            if (books[i].bookTitle.equalsIgnoreCase(title)){
                System.out.println("We have that book in the library");
                System.out.println();
                menu();
                return;
            }
            else if (i == books.length - 1){
                System.out.println("Sorry, we do not currently stock that book");
                System.out.println();
                menu();
                return;
            }
        }
    }

    private void checkBook(){
        System.out.println("What is the name of the book you are looking for?");
        String title = myScanner.nextLine();
        for (int i = 0; i < books.length; i++){
            if (books[i].bookTitle.equalsIgnoreCase(title)){
                System.out.println("We have that book in the library");
                for (int j = 0; j < loans.length; j++){
                    if (books[i].bookID == loans[j].bookID){
                        System.out.println("That book is currently loaned");

                        String date = loans[j].dueDate;
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
                        LocalDate dueDate = LocalDate.parse(date, formatter);
                      LocalDate todayDate = LocalDate.now();
                      DateTimeFormatter dayOfTheWeek = DateTimeFormatter.ofPattern("EEEE");


                            if (dueDate.compareTo(todayDate) > 0) {
                                System.out.println("The book will be available on " + dayOfTheWeek.format(dueDate) );
                                System.out.println("Would you like to reserve it? y/n");
                                String choice = myScanner.nextLine().toUpperCase();
                                switch (choice){
                                    case "Y":
                                        int bookID = books[i].bookID;
                                        System.out.println("Please input your name");
                                        String memberForename = myScanner.nextLine();
                                        reserveBook(bookID, memberForename);
                                        break;
                                    case "N":
                                        menu();
                                        break;
                                        default:
                                            System.out.println("Wrong Input");
                                            menu();
                                            break;
                                }
                            } else if (dueDate.compareTo(todayDate) < 0) {
                                System.out.println("The book is available");
                            } else if (dueDate.compareTo(todayDate) == 0) {
                                System.out.println("The book will be available tomorrow");
                            }

                            menu();
                            return;



                    }
                    else {
                        System.out.println("The book is available");
                        menu();
                        return;
                    }
                }

            }
            else if (i == books.length - 1){
                System.out.println("Sorry, we do not currently stock that book");
                System.out.println();
                menu();
                return;
            }
        }

    }

    private void searchAuthor(){
        System.out.println("What is the name of the author you would like to search for");
        String author = myScanner.nextLine();
        for (int i = 0; i < books.length; i++){


            if (books[i].bookAuthor.equalsIgnoreCase(author)){
                System.out.println("We have that author in the library");
                System.out.println("The author wrote: " + books[i].bookTitle );
                System.out.println();


            }
            else if (i == books.length - 1){
                System.out.println("Sorry, we do not currently stock books by that author");
                System.out.println();
            }
        }
        menu();

    }
    public void reserveBook(int bookID, String memberName){
        String bookTitle = books[bookID-1].bookTitle;
        reservedBooks.add(new Reserve(bookTitle, memberName));
        System.out.println("Reservation added " + reservedBooks.get(0).bookTitle + " reserved by " + reservedBooks.get(0).memberName);

    }


}
