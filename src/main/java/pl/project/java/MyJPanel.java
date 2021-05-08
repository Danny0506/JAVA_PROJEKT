package pl.project.java;

import javax.swing.*;
import java.awt.*;

/**
 * @author Daniel Palak
 *  Klasa MyJPanel dziedzicza po klasie JPanel umozliwiajaca ustawienie tla panelu jako dowolny obrazek umieszczony w zasobach projektu
 */
public class MyJPanel extends JPanel
{
    /**
     * Adnotacja @Override oznacza nadpisanie metody z klasy macierzystej
     * Metoda paintComponent wypelnia zawartosc panelu
     * @param g oznacza to czym zostanie wypelniony panel
     * Tworzony jest obiekt klasy image, ktoremu przypisujemy obrazek, ktory chcemy w tle panelu podajac sciezke do niego, a nastepnie przekazujemy go do rysowania
     */
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Image image = getToolkit().getImage("src/main/resources/bus2.jpg");
        g.drawImage(image, 0,0, this);
    }
}
