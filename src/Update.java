import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


      public class Update extends Thread {
        public void update() throws ClassNotFoundException, SQLException {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sarvin","myjava123");
                 PreparedStatement preparedStatement = connection.prepareStatement("Update employee Set knumber='09190748747' Where kid = '1'");


                 preparedStatement.executeUpdate();
                 preparedStatement.close();
                 connection.close();
             }
     public void run(){
                 try {
                         update();
                     } catch (ClassNotFoundException e) {
                         e.printStackTrace();
                     } catch (SQLException e) {
                         e.printStackTrace();
                     }
             }
 }

