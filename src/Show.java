import javax.swing.*;
import java.awt.*;


         public class Show extends Thread {
     JFrame frame = new JFrame("Entekhabe Vahed");
     JPanel panel1 = new JPanel(new BorderLayout(5,2));
     JPanel panel = new JPanel(new GridLayout(6,1));
     JLabel title = new JLabel("",JLabel.CENTER);
     public void visiblity(){
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setSize(600, 800);
                 frame.setLocationRelativeTo(null);
                 frame.setVisible(true);
                 frame.add(panel);
                 panel.add(panel,BorderLayout.CENTER);
                 panel.add(title,BorderLayout.NORTH);
                 title.setText("id=1 , name=sarvin , number=09190748747");
             }
     public void run(){
                 visiblity();
             }


         }
