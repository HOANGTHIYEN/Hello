/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

/* vi du ve cac method draw cua Graphics */
import java.awt.*;
import javax.swing.*;
public class DrawMethod extends JFrame {
     
    public DrawMethod() {
        setTitle("Drawing Method Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 400);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBackground(Color.yellow);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        // run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawMethod();   
            }
        });
    }
     
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        // bat dau ve
        g2d.drawLine(10, 30, 300, 100);
        g2d.drawLine(10, 30, 100, 100);
        g2d.drawLine(10, 30, 200, 100);
          // g2d.drawLine(100, 30, 100, 10);
        g2d.drawString("Line", 30, 60);      
           
    }
}