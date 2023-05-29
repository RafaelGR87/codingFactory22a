package test;

import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window ;
    Container con;
    JPanel titleNamePanel;
    JLabel titleNameLabel;

    public static void main(String[] args) {

        new Game();

    }

    public Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100 ,100 , 600 , 150);
        titleNameLabel = new JLabel("Vi spiller Chicago");
        titleNameLabel.setForeground(Color.white);
        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);
        titleNamePanel.setBackground(Color.blue);
    }
}
