import javax.xml.crypto.Data;
import java.sql.*;

public class MsSQL {
    public void MsSQLconnect(){
        try{

            String Username = "s434804";
            String Password = "*******";
            String URL = "jdbc:sqlserver://mssql-2016.labs.wmi.amu.edu.pl;databaseName=dbad_s434804";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection(URL,Username,Password);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM Nauczyciele");

            while(r.next())
            {
                System.out.println("ID: " + r.getInt(1));
                System.out.println("Imie: " + r.getString(2));
                System.out.println("Nazwisko: " + r.getString(3));
                System.out.println("Dyżur: " + r.getString(4));
                System.out.println("Zarobek: " + r.getInt(5) + "\n");
            }

        }catch(Exception exc){
            System.out.println("Error: " + exc);
        }
    }
}
