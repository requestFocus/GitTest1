
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
        panel.add(new JLabel("update 2.07"));
        
        frame.setBounds(100, 100, 100, 100);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
                
    } 
    
}

/*
    utwórz projekt
    versioning -> initialize git repo dla default ścieżki
    dodaj w github desktop local repo
    commit

    na ten moment można już stworzyć brancha i się poruszać między branchami
*/