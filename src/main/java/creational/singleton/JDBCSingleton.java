package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton() {//prevent the instantiations

    }

    //global access
    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DPDatabase", "postgres", "123");
        return con;
    }

    public int insert(String name, String password) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement("insert into _User(name,password) values(?,?)");
            ps.setString(1, name);
            ps.setString(2, password);
            recordCounter = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }

        return recordCounter;
    }
}
