import java.awt.*;
import javax.swing.*;
public class ProgressBarDemo {

    JFrame frame =  new JFrame();
    JProgressBar  bar =  new JProgressBar();

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,500,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.green);
        bar.setFont(new Font("MV Boli",Font.PLAIN,20) );

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);

        fill();

    }
    public void fill() {
        int counter = 0;

        while(counter < 100){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter ++;

        }
        bar.setString("Done!");
    }
}
