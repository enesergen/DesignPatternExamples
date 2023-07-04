package creational.singleton;


import java.sql.SQLException;

//https://www.javatpoint.com/singleton-design-pattern-in-java
//https://www.javatpoint.com/images/designpattern/singletonexample.jpg
public class Main {
    public static void main(String[] args) throws SQLException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        int record = jdbc.insert("enes1", "123456");
        System.out.println("Saved Record:" + record);
    }
}
