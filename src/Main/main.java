package Main;

import Connection.Databaseconnection;
import Database_Helper.Mess_Bill;
import Student.Bill;
import com.intellij.openapi.util.JDOMUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        Databaseconnection connection =new Databaseconnection();
        connection.attemptConnection();
        System.out.println("Enter Student name:");
        final Scanner scanner=new Scanner(System.in);
        String Sname=scanner.nextLine();
        System.out.println("Enter University Roll_no.:");
        int Univrollno=Integer.parseInt(scanner.nextLine());
        System.out.println("enter Messname:");
        String Messname=scanner.nextLine();
        System.out.println("enter mess bill:");
        int Messbill=Integer.parseInt(scanner.nextLine());
        Bill bill=new Bill(Sname,Univrollno,Messname,Messbill);
        Mess_Bill entry=new Mess_Bill();
        if(entry.addnewStuInDatabase(connection.getConnection(),bill)){
            System.out.println("succesfull");
            } else{
            System.out.println("failed");
        }


    }
}
