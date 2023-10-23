import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Frame extends JFrame implements ActionListener {


    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem save;
    JMenuItem run;
    JMenuItem exit;

    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setLayout(new FlowLayout());

        menuBar =  new JMenuBar();

        fileMenu =  new JMenu("Menu");
        editMenu =  new JMenu("Edit");
        helpMenu =  new JMenu("Help");

        fileMenu.setMnemonic(KeyEvent.VK_M);

        save = new JMenuItem("save");
        run = new JMenuItem("run");
        exit = new JMenuItem("exit");

        save.addActionListener(this);
        run.addActionListener(this);
        exit.addActionListener(this);

        save.setMnemonic(KeyEvent.VK_S);
        run.setMnemonic(KeyEvent.VK_R);
        exit.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(save);
        fileMenu.add(run);
        fileMenu.add(exit);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);

        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save){
            System.out.println("You saved the file!");
        }else if( e.getSource() == run){
            System.out.println("You run the file!");
        }else if(e.getSource()== exit){
            System.exit(0);
        }
    }
}
