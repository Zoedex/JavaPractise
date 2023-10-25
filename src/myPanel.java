import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel {
    myPanel(){
        this.setPreferredSize(new Dimension(500,500));

    }

    public void paint(Graphics g){
        Graphics2D  g2d = (Graphics2D) g;
        g2d.setPaint(Color.green);
        g2d.setStroke(new BasicStroke(5));
//        g2d.drawLine(0,0,500,500);
//        g2d.drawRect(200,200,100,100);
//        g2d.fillRect(200,200,100,100);
//        g2d.drawOval(200,200,100,100);
//        g2d.fillOval(200,200,100,100);
//        g2d.drawArc(200,200,100,100,0,90);
        g2d.fillArc(200,200,100,100,0,360 );
    }
}
