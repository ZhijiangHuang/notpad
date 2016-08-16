package com.zhi;

import javax.swing.*;

/**
 * Created by HUANGZHIJIANG416 on 2016/8/16.
 */
public class NotePad {

    private JButton Button;
    private JPanel jPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("NotePad");
        frame.setContentPane(new NotePad().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
