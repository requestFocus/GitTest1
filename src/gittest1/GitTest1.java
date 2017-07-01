
package gittest1;

import java.awt.Color;
import javax.swing.*;


public class GitTest1 {

    public static void main(String[] args) {
        
        new GitTest1();
        
    }

    public GitTest1() {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.add(panel);
        panel.setBackground(Color.RED);
        panel.add(new JLabel("master"));
        
        frame.setBounds(100, 100, 100, 100);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
                
    } 
    
}
