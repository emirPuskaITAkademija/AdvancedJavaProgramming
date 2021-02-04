package three.db;

import java.sql.*;
/**
 *
 * java.sql
 * <li>1. Connection -> DriverManager</li>
 * <li>2. Statement, PreparedStatement</li>
 * <li>3. ResultSet</li>
 */
public class DBDemo {
    public static void main(String[] args) {
        String username = "root";
        String password = "Admin2021!";
        String url = "jdbc:mysql://localhost:3306/person?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
       try(Connection connection = DriverManager.getConnection(url, username, password);){
           Statement statement = connection.createStatement();
           String sqlUpit = "SELECT * FROM person";
           ResultSet resultSet = statement.executeQuery(sqlUpit);
           while(resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString(2);
               String surname = resultSet.getString("surname");
               Person person = new Person(id, name, surname);
               System.out.println(person);
           }
       }catch(SQLException e){
           System.err.println(e.getMessage());
       }

    }
}
