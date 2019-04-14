package library2;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    public int bookID;
    public String bookTitle;
    public String bookAuthor;
    public String bookYear;

    public Book(int ID, String title, String author, String year){
        bookID = ID;
        bookTitle = title;
        bookAuthor = author;
        bookYear = year;
    }

    @Override
    public int compareTo(Book o) {
        String title = o.bookTitle;
        return this.bookTitle.compareTo(title);
    }

    public static Comparator<Book> bookAuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            String author1 = b1.bookAuthor.toUpperCase();
            String author2 = b2.bookAuthor.toUpperCase();

            return author1.compareTo(author2);
        }
    };
     public static Comparator<Book> bookYearComparator = new Comparator<Book>() {
         @Override
         public int compare(Book b1, Book b2) {
             String year1 = b1.bookYear.toUpperCase();
             String year2 = b2.bookYear.toUpperCase();
             return year1.compareTo(year2);
         }
     };
}
