package pl.project.java;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Image image = getToolkit().getImage("src/main/resources/bus2.jpg");
        g.drawImage(image, 0,0, this);
    }
}
