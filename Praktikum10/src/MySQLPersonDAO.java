import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        String name = person.getName();

        // membuat koneksi database
       
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/pbo",
                "root",
                ""
        );
        con.setAutoCommit(true);

        // query insert
        String query = "INSERT INTO person(name) VALUES('" + name + "')";

        System.out.println(query);

        Statement s = con.createStatement();

        s.executeUpdate(query);

        // tutup koneksi
        con.close();
    }
}