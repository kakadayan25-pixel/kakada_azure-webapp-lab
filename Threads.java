package Thread;

import javax.swing.*;

public class Threads extends JFrame {
    public Threads(){
        add(new Threadpanel());
        setSize(400,300);
//        kom nort klun eng
//        setLocation(300,300);
        setLocationRelativeTo(null); // auto mk middle
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        Threads frame=new Threads();
    }
}
