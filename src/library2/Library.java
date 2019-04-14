package library2;

import java.util.*;

public class Library {

    Scanner myScanner = new Scanner(System.in);

    List<Book> books = new ArrayList<Book>();
    List<Member> members = new ArrayList<Member>();
    Loan[] loans = new Loan[2];

    public static void main(String[] args) {
        Library lib = new Library();
        lib.init();

    }

    public void init(){

        books.add(new Book(1, "In Search of Lost Time", "Marcel Proust", "1913"));
        books.add(new Book(2, "Ulysses", "James Joyce", "1922"));
        books.add(new Book(3, "Moby Dick", "Herman Melville", "1851"));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen", "1813"));
        books.add(new Book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387"));
        books.add(new Book(6, "Emma", "Jane Austen", "1815"));

        members.add(0, new Member(1, "Dean", "Lewis", (byte) 30));
        members.add(1, new Member(2, "Steve", "Beckwith", (byte) 55));
        members.add(2, new Member(3, "Lisa", "Crow", (byte) 39));
        members.add(3, new Member(4, "Vicky", "Cross", (byte) 37));
        members.add(4, new Member(5, "Rachel", "Alsop", (byte) 25));

        loans[0] = new Loan(2, 4, "07/04/2019", "13/04/2019");
        loans[1] = new Loan(5, 2, "27/03/2019", "07/04/2019");

        menu();


    }

    private void menu() {
        System.out.println("Welcome to Dean's library");
        System.out.println("Select an option from the list below:");
        System.out.println("1 - Sort book by title");
        System.out.println("2 - Sort book by year");
        System.out.println("3 - Sort book by author");
        System.out.println("4 - Sort members by age(ascending)");
        System.out.println("5 - Sort members by forename");
        System.out.println("6 - Sort members by surname");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                searchBook();
                break;
            case 2:
                searchYear();
                break;

            case 3:
                searchAuthor();
                break;
            case 4:
                sortMemberAge();
                break;
            case 5:
                sortMemberForename();
                break;

            case 6:
                sortMemberSurname();
                break;

                default:
                    System.out.println("invalid input provided, please try again");
                    menu();
        }
    }

    private void searchBook(){

        for (Book a: books){
            System.out.println(a.bookTitle);
            }
        System.out.println("\n");
        Collections.sort(books);
        for (Book b: books){
            System.out.println(b.bookTitle);
        }
    }

    private void searchAuthor(){
        Collections.sort(books, Book.bookAuthorComparator);
        for (Book b: books){
            System.out.println(b.bookAuthor);
        }
    }
    private void searchYear(){
        Collections.sort(books, Book.bookYearComparator);
        for (Book b: books){
            System.out.println(b.bookYear);
        }
    }

    private void sortMemberAge(){
        Collections.sort(members, Member.memberAgeComparator);
        for (Member m: members){
            System.out.println(m.memberAge);
        }
    }
    public void sortMemberForename(){
        Collections.sort(members, Member.memberForenameComparator);
        for (Member m: members){
            System.out.println(m.memberForename);
        }
    }

    public void sortMemberSurname(){
        Collections.sort(members, Member.memberSurnameComparator);
        for (Member m: members){
            System.out.println(m.memberSurname);
        }


    }

}
