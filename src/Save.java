
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;

public class Save extends Thread {
    int id=1;
     String name="sarvin";
     String number="1";
     public void save () throws ClassNotFoundException, SQLException {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sarvin","myjava123");
                 PreparedStatement preparedStatement = connection.prepareStatement("insert into employee (kid , kname , knumber) values (?,?,?)");
                 preparedStatement.setInt(1, id);
                 preparedStatement.setString(2,name);
                 preparedStatement.setString(3,number);
                 preparedStatement.executeUpdate();
                 preparedStatement.close();
                 connection.close();


             }
     public void run(){
                 try {
                         save();
                     } catch (ClassNotFoundException e) {
                         e.printStackTrace();
                     } catch (SQLException e) {
                         e.printStackTrace();
                    }
             }

}
