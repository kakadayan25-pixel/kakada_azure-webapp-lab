package Thread;

import javax.swing.*;
import java.awt.*;

public class Threadpanel extends JPanel implements Runnable {

    Font fontkh = new Font("Khmer OS Muol Pali", Font.BOLD, 40);
    Color color2 = new Color(11122277);
    String text1 = "សួស្ដី Thread ";

        public Threadpanel(){
        Thread thread = new Thread(this);
        thread.start();
        setBackground(Color.pink);
    }
    int y=0;
    int x=0;
   public void paintComponent (Graphics g){

        super.paintComponent(g);
        int w=getWidth(),h=getHeight();

        FontMetrics fm=g.getFontMetrics(fontkh);
        int stringWidth=fm.stringWidth(text1);
        int x=(w-stringWidth)/2;
        g.setFont(fontkh);
        g.setColor(color2);
        g.drawString(text1,x-=2,y--);
        if(y<0){
            y=h;
        }
        else {
            x=w;
        }
    }
    int fps=25;
    @Override
    public void run() {
       while (true){
           repaint();
           try {
               Thread.sleep(100/fps);
           } catch (InterruptedException e){
               throw new RuntimeException(e);
           }
       }
    }

}

