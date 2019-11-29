package Student;

public class Bill {
    private String Sname;
    private int Univrollno;
    private String Messname;
    private int Messbill;

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getUnivrollno() {
        return Univrollno;
    }

    public void setUnivrollno(int univrollno) {
        Univrollno = univrollno;
    }

    public String getMessname() {
        return Messname;
    }

    public void setMessname(String messname) {
        Messname = messname;
    }

    public int getMessbill() {
        return Messbill;
    }

    public void setMessbill(int messbill) {
        Messbill = messbill;
    }

    public Bill(String sname, int univrollno, String messname, int messbill) {
        Sname = sname;
        Univrollno = univrollno;
        Messname = messname;
        Messbill = messbill;
    }
}
