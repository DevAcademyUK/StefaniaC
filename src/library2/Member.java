package library2;

import java.util.Comparator;

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
    public static Comparator<Member> memberForenameComparator = new Comparator<Member>() {
        @Override
        public int compare(Member m1, Member m2) {
            String member1 = m1.memberForename.toUpperCase();
            String member2 = m2.memberForename.toUpperCase();
            return member1.compareTo(member2);
        }
    };

    public static Comparator<Member> memberSurnameComparator = new Comparator<Member>() {
        @Override
        public int compare(Member m1, Member m2) {
            String member1 = m1.memberSurname.toUpperCase();
            String member2 = m2.memberSurname.toUpperCase();
            return member1.compareTo(member2);
        }
    };

    public static Comparator<Member> memberAgeComparator = new Comparator<Member>() {
        @Override
        public int compare(Member m1, Member m2) {
            int member1 = m1.memberAge;
            int member2 = m2.memberAge;
            return Integer.compare(member1, member2);
        }
    };
}
