package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbcon.DbConnection;

public class AdminDBOperations {
    static boolean openCustAccount(String name, String accno, String phno, int amount, String pass) {
        boolean status = false;
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO customers VALUES (?, ?, ?, ?, ?)")) {

            ps.setString(1, name);
            ps.setString(2, accno);
            ps.setString(3, phno);
            ps.setInt(4, amount);
            ps.setString(5, pass);

            int i = ps.executeUpdate();
            if (i > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
