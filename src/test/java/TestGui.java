import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.project.java.entities.Bus;
import pl.project.java.entities.BusStop;
import pl.project.java.gui.MyJPanel;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestGui {

    @Test
    @DisplayName("Test sprawdzajacy poprawnosc dzialania plikow audio odtwarzanych podczas korzystania z aplikacji")
    public void testAudio()
    {
        File soundFile = new File("src/main/resources/songs/Jason Derulo - Lifestyle (feat. Adam Levine) [Official Dance Video].wav");
        File soundFile2 = new File("src/main/resources/songs/Jason-Derulo-Take-You-Dancing-_Official-Dance-Video_.wav");
        Assertions.assertNotNull(soundFile);
        Assertions.assertNotNull(soundFile2);
        Assertions.assertNotEquals(soundFile, soundFile2);

        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(soundFile2);
            AudioInputStream appendedFiles = new AudioInputStream(new SequenceInputStream(audioIn2, audioIn), audioIn2.getFormat(), audioIn2.getFrameLength() + audioIn.getFrameLength());
            Clip clip = AudioSystem.getClip();
            clip.open(appendedFiles);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10.0f);
            clip.start();
            clip.loop(5000);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test sprawdzajcy poprawnosc stworzonych obiektow jakimi sa linie autobusowe, a takze sprawdzenie czy zadna z linii nie jest taka sama")
    public void testCreateNewBus()
    {
        Bus bus = new Bus(1, "Bukówka", "Pietraszki");
        Bus bus1 = new Bus(2, "Sukowska", "Kolberga");
        Bus bus2 = new Bus(3, "Borków", "Kaczmarka");
        Bus bus3 = new Bus(4, "Zagnańska Areszt", "al. Na Stadion");
        Bus bus4 = new Bus(5, "Szybowcowa", "Kolberga");
        Bus bus5 = new Bus(6, "Niestachów pętla", "Dworzec Autobusowy");
        Bus bus6 = new Bus(7, "Zagnańsk Szkoła", "Dworzec Autobusowy");
        Bus bus7 = new Bus(8, "Żniwna", "Os. Ślichowice");
        Bus bus8 = new Bus(9, "Ćmińsk", "Os. Ślichowice");
        Bus bus9 = new Bus(10, "Ciekoty Żeromszczyzna", "Dworzec Autobusowy");

        Assertions.assertNotNull(bus);
        Assertions.assertNotNull(bus1);
        Assertions.assertNotNull(bus2);
        Assertions.assertNotNull(bus3);
        Assertions.assertNotNull(bus4);
        Assertions.assertNotNull(bus5);
        Assertions.assertNotNull(bus6);
        Assertions.assertNotNull(bus7);
        Assertions.assertNotNull(bus8);
        Assertions.assertNotNull(bus9);
        Assertions.assertNotEquals(bus, bus1);
        Assertions.assertNotEquals(bus, bus2);
        Assertions.assertNotEquals(bus, bus3);
        Assertions.assertNotEquals(bus, bus4);
        Assertions.assertNotEquals(bus, bus5);
        Assertions.assertNotEquals(bus, bus6);
        Assertions.assertNotEquals(bus, bus7);
        Assertions.assertNotEquals(bus, bus8);
        Assertions.assertNotEquals(bus, bus9);
        Assertions.assertNotEquals(bus1, bus2);
        Assertions.assertNotEquals(bus1, bus3);
        Assertions.assertNotEquals(bus1, bus4);
        Assertions.assertNotEquals(bus1, bus5);
        Assertions.assertNotEquals(bus1, bus6);
        Assertions.assertNotEquals(bus1, bus7);
        Assertions.assertNotEquals(bus1, bus8);
        Assertions.assertNotEquals(bus1, bus9);
        Assertions.assertNotEquals(bus2, bus3);
        Assertions.assertNotEquals(bus2, bus4);
        Assertions.assertNotEquals(bus2, bus5);
        Assertions.assertNotEquals(bus2, bus6);
        Assertions.assertNotEquals(bus2, bus7);
        Assertions.assertNotEquals(bus2, bus8);
        Assertions.assertNotEquals(bus2, bus9);
        Assertions.assertNotEquals(bus3, bus4);
        Assertions.assertNotEquals(bus3, bus5);
        Assertions.assertNotEquals(bus3, bus6);
        Assertions.assertNotEquals(bus3, bus7);
        Assertions.assertNotEquals(bus3, bus8);
        Assertions.assertNotEquals(bus3, bus9);
        Assertions.assertNotEquals(bus4, bus5);
        Assertions.assertNotEquals(bus4, bus6);
        Assertions.assertNotEquals(bus4, bus7);
        Assertions.assertNotEquals(bus4, bus8);
        Assertions.assertNotEquals(bus4, bus9);
        Assertions.assertNotEquals(bus5, bus6);
        Assertions.assertNotEquals(bus5, bus7);
        Assertions.assertNotEquals(bus5, bus8);
        Assertions.assertNotEquals(bus5, bus9);
        Assertions.assertNotEquals(bus6, bus7);
        Assertions.assertNotEquals(bus6, bus8);
        Assertions.assertNotEquals(bus6, bus9);
        Assertions.assertNotEquals(bus7, bus8);
        Assertions.assertNotEquals(bus7, bus9);
        Assertions.assertNotEquals(bus8, bus9);
    }

    @Test
    @DisplayName("Test sprawdzajacy poprawnosc stworzenia obiektow paneli w programie")
    public void testInitLayouts()
    {
        MyJPanel myJPanel = new MyJPanel();
        MyJPanel myJPanel2  = new MyJPanel();
        MyJPanel myJPanel3 = new MyJPanel();
        MyJPanel myJPanel4  = new MyJPanel();
        MyJPanel myJPanel5  = new MyJPanel();
        MyJPanel myJPanel6  = new MyJPanel();
        Assertions.assertNotNull(myJPanel);
        Assertions.assertNotNull(myJPanel2);
        Assertions.assertNotNull(myJPanel3);
        Assertions.assertNotNull(myJPanel4);
        Assertions.assertNotNull(myJPanel5);
        Assertions.assertNotNull(myJPanel6);
        myJPanel.setLayout(null);
        myJPanel2.setLayout(null);
        myJPanel3.setLayout(null);
        myJPanel4.setLayout(new GridLayout(6, 3, 0, 0));
        myJPanel5.setLayout(null);
        myJPanel6.setLayout(null);
    }

    @Test
    @DisplayName("Test sprawdzajacy poprawnosc stworzenia obiektow jTextArea, a takze JScrollPane czy Jlabel oraz sprawdzenie czy obiekty JTextArea sa rozne")
    public void testInitTextAreas()
    {
        JTextArea jTextArea = new JTextArea();
        JTextArea jTextArea2 = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        JLabel label = new JLabel();
        Assertions.assertNotNull(jTextArea);
        Assertions.assertNotNull(jTextArea2);
        Assertions.assertNotNull(jScrollPane);
        Assertions.assertNotNull(label);
        Assertions.assertNotEquals(jTextArea, jTextArea2);
        jTextArea.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        jTextArea.setBackground(Color.white);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);
        jTextArea2.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        jTextArea2.setBackground(Color.white);
        jTextArea2.setLineWrap(true);
        jTextArea2.setEditable(false);
        jScrollPane.setPreferredSize(new Dimension(500, 200));
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    @Test
    @DisplayName("Test sprawdzajacy czy stworzone obiekty odpowidajace przystankom sa poprawnie stworzone")
    public void testCreateNewBusStops()
    {
        BusStop busStop1 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Kolberga", 5, "Szybowcowa");
        BusStop busStop2 = new BusStop("05:18", "07:25", "13:58", "16:13", "18:40", "1 Maja", 5, "Szybowcowa");
        BusStop busStop3 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "IX Wiekow Kielc", 5, "Szybowcowa");
        BusStop busStop4 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:11", "Warszawska Politechnika", 5, "Szybowcowa");
        BusStop busStop5 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radomska", 5, "Szybowcowa");
        BusStop busStop6 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Szybowcowa Kosciol", 5, "Szybowcowa");
        BusStop busStop7 = new BusStop("06:10", "10:22", "15:12", "17:11", "19:42", "Szybowcowa", 5, "Szybowcowa");
        BusStop busStop8 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Szybowcowa", 5, "Kolberga");
        BusStop busStop9 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Szybowcowa Kosciol", 5, "Kolberga");
        BusStop busStop10 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radomska", 5, "Kolberga");
        BusStop busStop11 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Warszawska Politechnika", 5, "Kolberga");
        BusStop busStop12 = new BusStop("07:11", "12:57", "15:48", "18:11", "20:35", "IX Wiekow Kielc", 5, "Kolberga");
        BusStop busStop13 = new BusStop("07:12", "13:11", "15:52", "18:20", "20:47", "1 Maja", 5, "Kolberga");
        BusStop busStop14 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Kolberga", 5, "Kolberga");

        BusStop busStop15 = new BusStop("05:29", "08:55", "14:21", "18:24", "20:55", "Pietraszki", 1, "Bukówka");
        BusStop busStop16 = new BusStop("05:45", "09:11", "14:40", "18:11", "21:11", "Kolonia I", 1, "Bukówka");
        BusStop busStop17 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Fabryczna", 1, "Bukówka");
        BusStop busStop18 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Krakowska Biesak", 1, "Bukówka");
        BusStop busStop19 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Jagielońska", 1, "Bukówka");
        BusStop busStop20 = new BusStop("06:52", "09:55", "15:51", "18:58", "21:58", "Żytnia", 1, "Bukówka");
        BusStop busStop21 = new BusStop("07:11", "10:17", "16:15", "19:11", "22:22", "Bukówka", 1, "Bukówka");
        BusStop busStop22 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Bukówka", 1, "Pietraszki");
        BusStop busStop23 = new BusStop("07:51", "11:21", "16:32", "19:35", "22:40", "Żytnia", 1, "Pietraszki");
        BusStop busStop24 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Jagielońska", 1, "Pietraszki");
        BusStop busStop25 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Krakowska Biesak", 1, "Pietraszki");
        BusStop busStop26 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Fabryczna", 1, "Pietraszki");
        BusStop busStop27 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Kolonia I", 1, "Pietraszki");
        BusStop busStop28 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Pietraszki", 1, "Pietraszki");

        BusStop busStop29 = new BusStop("05:45", "08:55", "14:14", "18:17", "21:37", "Kolberga", 2, "Sukowska");
        BusStop busStop30 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Hoża", 2, "Sukowska");
        BusStop busStop31 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Jagielońska", 2, "Sukowska");
        BusStop busStop32 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Żytnia", 2, "Sukowska");
        BusStop busStop33 = new BusStop("06:32", "09:40", "15:13", "19:26", "22:25", "Sciegiennego", 2, "Sukowska");
        BusStop busStop34 = new BusStop("06:51", "10:11", "15:24", "19:33", "22:39", "Kalinowa", 2, "Sukowska");
        BusStop busStop35 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Sukowska", 2, "Sukowska");
        BusStop busStop36 = new BusStop("07:21", "10:51", "16:10", "19:55", "22:58", "Sukowska", 2, "Kolberga");
        BusStop busStop37 = new BusStop("07:39", "11:12", "16:24", "20:15", "23:15", "Kalinowa", 2, "Kolberga");
        BusStop busStop38 = new BusStop("07:55", "11:30", "16:41", "20:24", "23:26", "Sciegiennego", 2, "Kolberga");
        BusStop busStop39 = new BusStop("08:14", "12:21", "16:59", "20:49", "23:43", "Żytnia", 2, "Kolberga");
        BusStop busStop40 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Jagielońska", 2, "Kolberga");
        BusStop busStop41 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Hoża", 2, "Kolberga");
        BusStop busStop42 = new BusStop("08:35", "13:55", "18:14", "21:26", "23:59", "Kolberga", 2, "Kolberga");

        BusStop busStop43 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Kaczmarka", 3, "Borków");
        BusStop busStop44 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Żytnia", 3, "Borków");
        BusStop busStop45 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "IX Wiekow Kielc", 3, "Borków");
        BusStop busStop46 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Tarnowska", 3, "Borków");
        BusStop busStop47 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Wrzosowa", 3, "Borków");
        BusStop busStop48 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Suków", 3, "Borków");
        BusStop busStop49 = new BusStop("06:26", "10:17", "15:13", "18:14", "21:11", "Borków", 3, "Borków");
        BusStop busStop50 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Borków", 3, "Kaczmarka");
        BusStop busStop51 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Suków", 3, "Kaczmarka");
        BusStop busStop52 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Wrzosowa", 3, "Kaczmarka");
        BusStop busStop53 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Tarnowska", 3, "Kaczmarka");
        BusStop busStop54 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "IX Wiekow Kielc", 3, "Kaczmarka");
        BusStop busStop55 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Żytnia", 3, "Kaczmarka");
        BusStop busStop56 = new BusStop("08:13", "13:10", "16:55", "19:42", "23:44", "Kaczmarka", 3, "Kaczmarka");

        BusStop busStop57 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "al. Na Stadion", 4, "Zagnańska Areszt");
        BusStop busStop58 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Pakosz", 4, "Zagnańska Areszt");
        BusStop busStop59 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Krakowska", 4, "Zagnańska Areszt");
        BusStop busStop60 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Seminaryjska", 4, "Zagnańska Areszt");
        BusStop busStop61 = new BusStop("04:45", "07:55", "14:58", "18:45", "21:21", "Tarnowska", 4, "Zagnańska Areszt");
        BusStop busStop62 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Jesionowa", 4, "Zagnańska Areszt");
        BusStop busStop63 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Zagnańska Areszt", 4, "Zagnańska Areszt");
        BusStop busStop64 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Zagnańska Areszt", 4, "al. Na Stadion");
        BusStop busStop65 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Jesionowa", 4, "al. Na Stadion");
        BusStop busStop66 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Tarnowska", 4, "al. Na Stadion");
        BusStop busStop67 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Seminaryjska", 4, "al. Na Stadion");
        BusStop busStop68 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Krakowska", 4, "al. Na Stadion");
        BusStop busStop69 = new BusStop("06:10", "13:13", "16:52", "20:20", "22:47", "Pakosz", 4, "al. Na Stadion");
        BusStop busStop70 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "al. Na Stadion", 4, "al. Na Stadion");

        BusStop busStop71 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Dworzec Autobusowy", 6, "Niestachów pętla");
        BusStop busStop72 = new BusStop("05:18", "07:25", "13:58", "16:10", "18:40", "Czarnowska", 6, "Niestachów pętla");
        BusStop busStop73 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "Sandomierska", 6, "Niestachów pętla");
        BusStop busStop74 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:11", "Cedzyna", 6, "Niestachów pętla");
        BusStop busStop75 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radlin", 6, "Niestachów pętla");
        BusStop busStop76 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Radlin/Niestachów", 6, "Niestachów pętla");
        BusStop busStop77 = new BusStop("06:10", "10:22", "15:11", "17:11", "19:42", "Niestachów pętla", 6, "Niestachów pętla");
        BusStop busStop78 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Niestachów pętla", 6, "Dworzec Autobusowy");
        BusStop busStop79 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Radlin/Niestachów", 6, "Dworzec Autobusowy");
        BusStop busStop80 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radlin", 6, "Dworzec Autobusowy");
        BusStop busStop81 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Cedzyna", 6, "Dworzec Autobusowy");
        BusStop busStop82 = new BusStop("06:59", "12:57", "15:48", "18:11", "20:35", "Sandomierska", 6, "Dworzec Autobusowy");
        BusStop busStop83 = new BusStop("07:10", "13:13", "15:52", "18:20", "20:47", "Czarnowska", 6, "Dworzec Autobusowy");
        BusStop busStop84 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Dworzec Autobusowy", 6, "Dworzec Autobusowy");

        BusStop busStop85 = new BusStop("05:29", "08:55", "14:21", "18:17", "20:55", "Dworzec Autobusowy", 7, "Zagnańsk Szkoła");
        BusStop busStop86 = new BusStop("05:45", "09:11", "14:40", "18:21", "21:11", "Czarnowska", 7, "Zagnańsk Szkoła");
        BusStop busStop87 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Jesionowa", 7, "Zagnańsk Szkoła");
        BusStop busStop88 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Warszawska/Uroczysko", 7, "Zagnańsk Szkoła");
        BusStop busStop89 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Dąbrowa", 7, "Zagnańsk Szkoła");
        BusStop busStop90 = new BusStop("06:52", "09:55", "15:51", "18:57", "21:58", "Kajetanów", 7, "Zagnańsk Szkoła");
        BusStop busStop91 = new BusStop("07:11", "10:17", "16:12", "19:11", "22:22", "Zagnańsk Szkoła", 7, "Zagnańsk Szkoła");
        BusStop busStop92 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Zagnańsk Szkoła", 7, "Dworzec Autobusowy");
        BusStop busStop93 = new BusStop("07:51", "11:11", "16:32", "19:35", "22:40", "Kajetanów", 7, "Dworzec Autobusowy");
        BusStop busStop94 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Dąbrowa", 7, "Dworzec Autobusowy");
        BusStop busStop95 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Warszawska/Uroczysko", 7, "Dworzec Autobusowy");
        BusStop busStop96 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Jesionowa", 7, "Dworzec Autobusowy");
        BusStop busStop97 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Czarnowska", 7, "Dworzec Autobusowy");
        BusStop busStop98 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Dworzec Autobusowy", 7, "Dworzec Autobusowy");

        BusStop busStop99 = new BusStop("05:45", "08:55", "14:12", "18:17", "21:37", "Os. Ślichowice", 8, "Żniwna");
        BusStop busStop100 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Grunwaldzka", 8, "Żniwna");
        BusStop busStop101 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Żytnia", 8, "Żniwna");
        BusStop busStop102 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Seminaryjska", 8, "Żniwna");
        BusStop busStop103 = new BusStop("06:32", "09:40", "15:15", "19:26", "22:25", "Zagórska", 8, "Żniwna");
        BusStop busStop104 = new BusStop("06:51", "10:10", "15:24", "19:33", "22:39", "Poleska", 8, "Żniwna");
        BusStop busStop105 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Żniwna", 8, "Żniwna");
        BusStop busStop106 = new BusStop("07:21", "10:51", "16:13", "19:55", "22:58", "Żniwna", 8, "Os. Ślichowice");
        BusStop busStop107 = new BusStop("07:39", "11:12", "16:24", "20:12", "23:15", "Poleska", 8, "Os. Ślichowice");
        BusStop busStop108 = new BusStop("07:48", "11:30", "16:41", "20:24", "23:26", "Zagórska", 8, "Os. Ślichowice");
        BusStop busStop109 = new BusStop("08:14", "12:17", "16:59", "20:49", "23:43", "Seminaryjska", 8, "Os. Ślichowice");
        BusStop busStop110 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Żytnia", 8, "Os. Ślichowice");
        BusStop busStop111 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Grunwaldzka", 8, "Os. Ślichowice");
        BusStop busStop112 = new BusStop("08:35", "13:55", "18:11", "21:26", "23:59", "Os. Ślichowice", 8, "Os. Ślichowice");

        BusStop busStop113 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Os. Ślichowice", 9, "Ćmińsk");
        BusStop busStop114 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Czarnowska", 9, "Ćmińsk");
        BusStop busStop115 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "Zagnańska", 9, "Ćmińsk");
        BusStop busStop116 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Łódzka", 9, "Ćmińsk");
        BusStop busStop117 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Kostomłoty", 9, "Ćmińsk");
        BusStop busStop118 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Miedziana Góra", 9, "Ćmińsk");
        BusStop busStop119 = new BusStop("06:26", "10:16", "15:13", "18:14", "21:11", "Ćmińsk", 9, "Ćmińsk");
        BusStop busStop120 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Ćmińsk", 9, "Os. Ślichowice");
        BusStop busStop121 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Miedziana Góra", 9, "Os. Ślichowice");
        BusStop busStop122 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Kostomłoty", 9, "Os. Ślichowice");
        BusStop busStop123 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Łódzka", 9, "Os. Ślichowice");
        BusStop busStop124 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "Zagnańska", 9, "Os. Ślichowice");
        BusStop busStop125 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Czarnowska", 9, "Os. Ślichowice");
        BusStop busStop126 = new BusStop("08:13", "13:13", "16:55", "19:42", "23:44", "Os. Ślichowice", 9, "Os. Ślichowice");

        BusStop busStop127 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "Dworzec Autobusowy", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop128 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Czarnowska", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop129 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Sandomierska", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop130 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Cedzyna", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop131 = new BusStop("04:45", "07:55", "15:11", "18:45", "21:21", "Leszczyny", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop132 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Mąchocice", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop133 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Ciekoty Żeromszczyzna", 10, "Ciekoty Żeromszczyzna");
        BusStop busStop134 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Ciekoty Żeromszczyzna", 10, "Dworzec Autobusowy");
        BusStop busStop135 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Mąchocice", 10, "Dworzec Autobusowy");
        BusStop busStop136 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Leszczyny", 10, "Dworzec Autobusowy");
        BusStop busStop137 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Cedzyna", 10, "Dworzec Autobusowy");
        BusStop busStop138 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Sandomierska", 10, "Dworzec Autobusowy");
        BusStop busStop139 = new BusStop("06:10", "13:14", "16:52", "20:20", "22:47", "Czarnowska", 10, "Dworzec Autobusowy");
        BusStop busStop140 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "Dworzec Autobusowy", 10, "Dworzec Autobusowy");

        Assertions.assertNotNull(busStop1);
        Assertions.assertNotNull(busStop2);
        Assertions.assertNotNull(busStop3);
        Assertions.assertNotNull(busStop4);
        Assertions.assertNotNull(busStop5);
        Assertions.assertNotNull(busStop6);
        Assertions.assertNotNull(busStop7);
        Assertions.assertNotNull(busStop8);
        Assertions.assertNotNull(busStop9);
        Assertions.assertNotNull(busStop10);
        Assertions.assertNotNull(busStop11);
        Assertions.assertNotNull(busStop12);
        Assertions.assertNotNull(busStop13);
        Assertions.assertNotNull(busStop14);
        Assertions.assertNotNull(busStop15);
        Assertions.assertNotNull(busStop16);
        Assertions.assertNotNull(busStop17);
        Assertions.assertNotNull(busStop18);
        Assertions.assertNotNull(busStop19);
        Assertions.assertNotNull(busStop20);
        Assertions.assertNotNull(busStop21);
        Assertions.assertNotNull(busStop22);
        Assertions.assertNotNull(busStop23);
        Assertions.assertNotNull(busStop24);
        Assertions.assertNotNull(busStop25);
        Assertions.assertNotNull(busStop26);
        Assertions.assertNotNull(busStop27);
        Assertions.assertNotNull(busStop28);
        Assertions.assertNotNull(busStop29);
        Assertions.assertNotNull(busStop30);
        Assertions.assertNotNull(busStop31);
        Assertions.assertNotNull(busStop32);
        Assertions.assertNotNull(busStop33);
        Assertions.assertNotNull(busStop34);
        Assertions.assertNotNull(busStop35);
        Assertions.assertNotNull(busStop36);
        Assertions.assertNotNull(busStop37);
        Assertions.assertNotNull(busStop38);
        Assertions.assertNotNull(busStop39);
        Assertions.assertNotNull(busStop40);
        Assertions.assertNotNull(busStop41);
        Assertions.assertNotNull(busStop42);
        Assertions.assertNotNull(busStop43);
        Assertions.assertNotNull(busStop44);
        Assertions.assertNotNull(busStop45);
        Assertions.assertNotNull(busStop46);
        Assertions.assertNotNull(busStop47);
        Assertions.assertNotNull(busStop48);
        Assertions.assertNotNull(busStop49);
        Assertions.assertNotNull(busStop50);
        Assertions.assertNotNull(busStop51);
        Assertions.assertNotNull(busStop52);
        Assertions.assertNotNull(busStop53);
        Assertions.assertNotNull(busStop54);
        Assertions.assertNotNull(busStop55);
        Assertions.assertNotNull(busStop56);
        Assertions.assertNotNull(busStop57);
        Assertions.assertNotNull(busStop58);
        Assertions.assertNotNull(busStop59);
        Assertions.assertNotNull(busStop60);
        Assertions.assertNotNull(busStop61);
        Assertions.assertNotNull(busStop62);
        Assertions.assertNotNull(busStop63);
        Assertions.assertNotNull(busStop64);
        Assertions.assertNotNull(busStop65);
        Assertions.assertNotNull(busStop66);
        Assertions.assertNotNull(busStop67);
        Assertions.assertNotNull(busStop68);
        Assertions.assertNotNull(busStop69);
        Assertions.assertNotNull(busStop70);
        Assertions.assertNotNull(busStop71);
        Assertions.assertNotNull(busStop72);
        Assertions.assertNotNull(busStop73);
        Assertions.assertNotNull(busStop74);
        Assertions.assertNotNull(busStop75);
        Assertions.assertNotNull(busStop76);
        Assertions.assertNotNull(busStop77);
        Assertions.assertNotNull(busStop78);
        Assertions.assertNotNull(busStop79);
        Assertions.assertNotNull(busStop80);
        Assertions.assertNotNull(busStop81);
        Assertions.assertNotNull(busStop82);
        Assertions.assertNotNull(busStop83);
        Assertions.assertNotNull(busStop84);
        Assertions.assertNotNull(busStop85);
        Assertions.assertNotNull(busStop86);
        Assertions.assertNotNull(busStop87);
        Assertions.assertNotNull(busStop88);
        Assertions.assertNotNull(busStop89);
        Assertions.assertNotNull(busStop90);
        Assertions.assertNotNull(busStop91);
        Assertions.assertNotNull(busStop92);
        Assertions.assertNotNull(busStop93);
        Assertions.assertNotNull(busStop94);
        Assertions.assertNotNull(busStop95);
        Assertions.assertNotNull(busStop96);
        Assertions.assertNotNull(busStop97);
        Assertions.assertNotNull(busStop98);
        Assertions.assertNotNull(busStop99);
        Assertions.assertNotNull(busStop100);
        Assertions.assertNotNull(busStop101);
        Assertions.assertNotNull(busStop102);
        Assertions.assertNotNull(busStop103);
        Assertions.assertNotNull(busStop104);
        Assertions.assertNotNull(busStop105);
        Assertions.assertNotNull(busStop106);
        Assertions.assertNotNull(busStop107);
        Assertions.assertNotNull(busStop108);
        Assertions.assertNotNull(busStop109);
        Assertions.assertNotNull(busStop110);
        Assertions.assertNotNull(busStop111);
        Assertions.assertNotNull(busStop112);
        Assertions.assertNotNull(busStop113);
        Assertions.assertNotNull(busStop114);
        Assertions.assertNotNull(busStop115);
        Assertions.assertNotNull(busStop116);
        Assertions.assertNotNull(busStop117);
        Assertions.assertNotNull(busStop118);
        Assertions.assertNotNull(busStop119);
        Assertions.assertNotNull(busStop120);
        Assertions.assertNotNull(busStop121);
        Assertions.assertNotNull(busStop122);
        Assertions.assertNotNull(busStop123);
        Assertions.assertNotNull(busStop124);
        Assertions.assertNotNull(busStop125);
        Assertions.assertNotNull(busStop126);
        Assertions.assertNotNull(busStop127);
        Assertions.assertNotNull(busStop128);
        Assertions.assertNotNull(busStop129);
        Assertions.assertNotNull(busStop130);
        Assertions.assertNotNull(busStop131);
        Assertions.assertNotNull(busStop132);
        Assertions.assertNotNull(busStop133);
        Assertions.assertNotNull(busStop134);
        Assertions.assertNotNull(busStop135);
        Assertions.assertNotNull(busStop136);
        Assertions.assertNotNull(busStop137);
        Assertions.assertNotNull(busStop138);
        Assertions.assertNotNull(busStop139);
        Assertions.assertNotNull(busStop140);
    }
}