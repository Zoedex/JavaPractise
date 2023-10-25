import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {

//        String name = JOptionPane.showInputDialog("What is your name?");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your name?"));
//        JOptionPane.showMessageDialog(null, "hello " + name);
//        JOptionPane.showMessageDialog(null, "you age is  " + age+ "Years old");
//        String name = "HELLO";
//
//        StringBuilder sb = new StringBuilder(name);
//        sb.reverse();
//
//        String reversedStr = sb.toString();
//
//        System.out.println(reversedStr);

//        ArrayList<String> foods = new ArrayList<String>();
//        foods.add("Pazza");
//        foods.add("Hotdog");
//        foods.add("Hamburgur");
//        foods.set(0, "Sushi");
//
//        for (String food : foods) {
//            System.out.println(food);
//        }
        // Check if the list is empty
//        ArrayList<ArrayList<ArrayList<String>>> list3d = new ArrayList<>();
//        ArrayList<ArrayList<String>> list2d = new ArrayList<>();
//        ArrayList<String> list1d = new ArrayList<>();
//        list1d.add("Lay");
//        list1d.add("20");
//        list2d.add(list1d);
//        list3d.add(list2d);
//        String age = list3d.get(0).get(0).get(1);
//        String name = list3d.get(0).get(0).get(0);
//
//        hello(name,age);
//
//        Car myCar = new Car();
//        myCar.drive();
//        System.out.printf("%.2f",myCar.price);
//
//    static void hello(String name, String age) {
////        System.out.print("hello " +name);
////        System.out.println(" you're "+ age + "years old.");
////    }
//    Bike bike = new Bike("Scott", "red", 300);
//
//    Bike bike1 = new Bike("","",0);
//
//    System.out.println(bike);
//    System.out.println(bike1);
//    bike1.copy(bike);
//
//    System.out.println(bike1.model);


//        File file =  new File("src/Car.java");
//
//        if (file.exists()) {
//            System.out.println("The file is exist.");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.length());
//        } else {
//            System.out.println("The  file isn't exist.");
//        }
//        try {
//            FileReader reader = new FileReader("src/readtest.txt");
//            int data = reader.read();
//            System.out.println(data);
//            while(data !=-1){
//                System.out.print((char)data);
//                data = reader.read();
//            }
//            reader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

//        try {
//            FileReader reader = new FileReader("src/readtest.txt");
//            int data = reader.read();
//
//            System.out.print(data);
//            data = reader.read();
//            System.out.print(data);
//            reader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        Scanner scanner =  new Scanner(System.in);
//
//        File file = new File("C:\\Users\\USERR\\Music\\wav\\Bando.wav");
//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//
//        clip.open(audioStream);
//        String response = "";
//
//
//        while(!response.equals("q")){
//            System.out.println("Enter your response :");
//            response = scanner.next();
//
//            switch (response) {
//                case ("p") -> clip.start();
//                case ("s") -> clip.stop();
//                case ("r") -> clip.setMicrosecondPosition(0);
//                case ("q") -> clip.close();
//                default -> System.out.println("this is not a response.");
//            }
//        }
//
//        System.out.println("Closed!");
//        Border border = BorderFactory.createLineBorder(Color.green,2);
//        ImageIcon image = new ImageIcon("C:\\Users\\USERR\\OneDrive\\Pictures\\meme pics\\941d71a2241c764419aafc390329f81c.jpg\\");
//        JLabel label =  new JLabel();
//        label.setText("Wassup Dawg!");
//        label.setIcon(image);
//
//        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setVerticalTextPosition(JLabel.TOP);
//        label.setForeground(Color.green );
//        label.setFont(new Font("MV Boli",Font.BOLD,20));
//        label.setIconTextGap(20);
//        label.setOpaque(true);
//        label.setBackground(Color.black);
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0, 500,500);
//
//
//        MyFrame frame1 = new MyFrame();
//        frame1.add(label);
////        frame1.setLayout(null);
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.black);
//        panel.setBounds(0, 0, 250, 250);
//
//        JPanel panel1 = new JPanel();
//        panel1.setBackground(Color.blue);
//        panel1.setBounds(250, 0, 250, 250);
//
//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.green);
//        panel2.setBounds(0, 250, 500, 250);
//        panel2.setLayout(new BorderLayout());
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(750,750);
//        frame.setVisible(true);
//        frame.setLayout(null);
//        frame.add(panel);
//        frame.add(panel1);
//        frame.add(panel2);
//        panel2.add(label);


//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(new BorderLayout(10,10));
//
//        JPanel  panel1 = new JPanel();
//        JPanel  panel2 = new JPanel();
//        JPanel  panel3 = new JPanel();
//        JPanel  panel4 = new JPanel();
//        JPanel  panel5 = new JPanel();
//
//        panel1.setBackground(Color.blue);
//        panel2.setBackground(Color.black);
//        panel3.setBackground(Color.green);
//        panel4.setBackground(Color.red);
//        panel5.setBackground(Color.gray);
//
//        panel1.setPreferredSize(new Dimension(100,100));
//        panel2.setPreferredSize(new Dimension(100,100));
//        panel3.setPreferredSize(new Dimension(100,100));
//        panel4.setPreferredSize(new Dimension(100,100));
//        panel5.setPreferredSize(new Dimension(100,100));
//
//
//        frame.add(panel1,BorderLayout.NORTH);
//        frame.add(panel2,BorderLayout.SOUTH);
//        frame.add(panel3,BorderLayout.EAST);
//        frame.add(panel4, BorderLayout.WEST);
//        frame.add(panel5, BorderLayout.CENTER);
//
//
//


//        JFrame frame1 = new JFrame();
//        frame1.setSize(500,500);
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame1.setLayout(new GridLayout(5,3,10,0));
//
//
//        frame1.add(new JButton("1"));
//        frame1.add(new JButton("2"));
//        frame1.add(new JButton("3"));
//        frame1.add(new JButton("4"));
//        frame1.add(new JButton("5"));
//        frame1.add(new JButton("6"));
//        frame1.add(new JButton("7"));
//        frame1.add(new JButton("8"));
//        frame1.add(new JButton("9"));
//
//
//
//
//
//        frame1.setVisible(true);
//

//        ProgressBarDemo demo = new ProgressBarDemo();

//    new Frame();


//        JFrame frame =  new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(250,250);
//        frame.setLayout(new FlowLayout());
//
//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser file = new JFileChooser();
//                file.setCurrentDirectory(new File("."));
//
//                int response = file.showOpenDialog(null);
//
//                if (response == JFileChooser.APPROVE_OPTION){
//                    System.out.println(file.getSelectedFile().getAbsolutePath());
//                }
//            }
//        };
//
//
//        JButton select = new JButton();
//        select.setText("Select a file");
//        select.setFocusable(false);
//        select.addActionListener(listener);
//
//        frame.add(select);
//
//        frame.setVisible(true);

//    myFrame1  frame = new myFrame1();

//        new MyFrame();
//            Character[] charArr = {'h','e','l','l','o'};
//            String[] stringArr = {"Hello","guy"};
//            Integer[] intArr = {1,2,3,4,5};
//            Double[] doubleArr = {1.2,2.3,3.2};
//
//            display(charArr);
//            display(stringArr);
//            display(intArr);
//            display(doubleArr);


//        MyIntegerClass myInt = new MyIntegerClass(123);
//        MyStringClass myString =  new MyStringClass("Gay");

        MyGenericClass <Integer>  myString = new MyGenericClass<>(123);
        MyGenericClass <String> myInt =  new MyGenericClass<>("Gays!");

        System.out.println(myString.getValue());
        System.out.println(myInt.getValue());

//
    }

//    public static <Thing> void display(Thing[] arr){
//        for (Thing x: arr){
//            System.out.print( x + " ");
//        }
//        System.out.println();
//
//
//    }
}