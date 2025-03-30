package snakegame;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame  frame  = new JFrame("/Snake_Game/");
        frame.setBounds(10 , 10  , 905  , 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel   = new GamePanel();
        panel.setBackground(new Color(34, 139, 34));  // Dark Green

        frame.add(panel);
        frame.setVisible(true);

    }
}