package Database_Helper;

import Student.Bill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mess_Bill {
    public boolean addnewStuInDatabase(Connection connection, Bill bill) throws SQLException {
        String Studentname=bill.getSname();
        int univrollno=bill.getUnivrollno();
        String messname=bill.getMessname();
        int messbil=bill.getMessbill();
        PreparedStatement vj=connection.prepareStatement("INSERT INTO mess(Sname,Univrollno,Messname,Messbill) VALUES(?,?,?,?);");
        vj.setString(1,Studentname);
        vj.setInt(2,univrollno);
        vj.setString(3,messname);
        vj.setInt(4,messbil);
        int n=vj.executeUpdate();
        return n>=1;
    }
}
