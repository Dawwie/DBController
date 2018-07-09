import java.sql.*;

public class MySQL {
    public void MySQLconnect(){
        try {
            String Username = "s434804";
            String Password = "*******";
            String URL = "jdbc:mysql://mysql.wmi.amu.edu.pl/s434804_Szkola_Muzyczna";
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(URL,Username,Password);
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM SzkolaMuzyczna");

            while(r.next())
            {
                System.out.println("Imie: " + r.getString(1));
                System.out.println("Nazwisko: " + r.getString(2));
                System.out.println("Instrument: " + r.getString(3) + "\n");
            }

        }catch(Exception exc) {
            System.out.println("Error: " + exc);
        }
    }
}
