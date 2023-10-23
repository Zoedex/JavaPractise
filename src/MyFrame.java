import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setVisible(true);
        this.setTitle("Here is a motherfucking frame!");
//        frame.setResizable(false);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("C:\\Users\\USERR\\OneDrive\\Pictures\\meme pics\\941d71a2241c764419aafc390329f81c.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.gray);
    }
}
