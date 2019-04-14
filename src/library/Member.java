package library;

public class Member {
    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;

    public Member(int ID, String forename, String surname, byte age){
        memberID = ID;
        memberForename = forename;
        memberSurname = surname;
        memberAge = age;
    }
}
