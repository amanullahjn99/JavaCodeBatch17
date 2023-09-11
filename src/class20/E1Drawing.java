package class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame fram=new JFrame();
        MyCanvas c=new MyCanvas();
        fram.setSize(1000,1000);
        fram.add(c);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    public void paint(Graphics g){

        g.setColor(Color.BLUE);
        g.fillOval(200,200,500,500);

        g.setColor(Color.black);
        g.fillRect(800,200,500,500);
    }

}