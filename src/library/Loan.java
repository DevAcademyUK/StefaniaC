package library;

import java.util.Date;

public class Loan {
    public int bookID;
    public int memberID;
    public String loanDate;
    public String dueDate;

    public Loan (int bID, int mID, String loanD, String dueD){
        bookID = bID;
        memberID = mID;
        loanDate = loanD;
        dueDate = dueD;
    }
}
