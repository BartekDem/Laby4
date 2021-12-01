package com.company;

import java.awt.MouseInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;


public class Okienko implements MouseListener, KeyListener {

    JFrame frame = new JFrame();
    Container c = frame.getContentPane();
    JButton escapebutton = new JButton("zlap_mnie");
    JButton cancelbutton = new JButton("Cancel");

    Okienko() {


        escapebutton.setBounds(125, 200, 100, 25);
        escapebutton.addMouseListener(this);

        cancelbutton.setBounds(225, 200, 100, 25);
        cancelbutton.addMouseListener(this);

        c.setBackground(Color.white);
        frame.add(cancelbutton);
        frame.add(escapebutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == cancelbutton) {
            escapebutton.setBounds(125, 200, 100, 25);
        }
        double x = MouseInfo.getPointerInfo().getLocation().getX();
        double y = MouseInfo.getPointerInfo().getLocation().getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == escapebutton) {
            escapebutton.setBounds((int) (Math.random() * (400)), (int) (Math.random() * (400)), 100, 25);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}