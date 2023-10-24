import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame1 extends JFrame implements ActionListener {


    JButton button;
    JLabel label;
    myFrame1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(250,250);

        button =  new JButton("Pick a color");
        button.setFocusable(false);
        button.addActionListener(this);
        label = new JLabel();
        label.setText("this is a text.");
        label.setFont(new Font("Mv Boli",Font.PLAIN,100));
        label.setOpaque(true);
        label.setForeground(Color.blue);


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){

            Color color = JColorChooser.showDialog(null,"Pick a color",Color.black);

            label.setForeground(color);
        }
    };
}
