package pl.project.java.gui;

import javax.swing.*;
import java.awt.*;

public class MyJButton extends JButton {

    public MyJButton(String text) {
        this(text, null);
        setContentAreaFilled(false);
        setBorder(null);
    }

    public MyJButton(String text, Icon icon) {
        setModel(new DefaultButtonModel());
        init(text, icon);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 65, 65);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, 65, 65);
        super.paintComponent(g);
    }
}
