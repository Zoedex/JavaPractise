import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame
//        implements
//        KeyListener
//        MouseListener
{
    myPanel panel;

//    JLabel label;
    MyFrame(){
//        label = new JLabel();
//        label.setBounds(0,0,50,50);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        label.addMouseListener(this);

        panel  = new myPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ImageIcon image = new ImageIcon("C:\\Users\\USERR\\OneDrive\\Pictures\\meme pics\\941d71a2241c764419aafc390329f81c.jpg");
//        this.setIconImage(image.getImage());
//        this.getContentPane().setBackground(Color.gray);
//
//        this.addKeyListener(this);
//        frame.setResizable(false);
//        this.add(label);//
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);

    }
    //    @Override
//    public void keyTyped(KeyEvent e) {
//        switch (e.getKeyChar()){
//            case 'a'-> label.setLocation(label.getX()-5,label.getY());
//            case 'd'-> label.setLocation(label.getX()+5,label.getY());
//            case 'w'-> label.setLocation(label.getX(),label.getY()-5);
//            case 's'-> label.setLocation(label.getX(),label.getY()+5);
//            default -> label.setLocation(label.getX(),label.getY());
//        }
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        System.out.println("clicked");
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        System.out.println("pressed");
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        System.out.println("released");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        System.out.println("entered");
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        System.out.println("exited");
//    }

}
