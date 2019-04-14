package library2;

public class Loan {
    public int bookID;
    public int memberID;
    public String loanDate;
    public String dueDate;

    public Loan (int bID, int mID, String loanDate, String dueDate){
        bookID = bID;
        memberID = mID;
        loanDate = loanDate;
        dueDate = dueDate;
    }
}
