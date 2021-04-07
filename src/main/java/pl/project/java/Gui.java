package pl.project.java;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.time.LocalTime;

public class Gui extends JFrame implements ActionListener {
    JFrame frame = new JFrame("System Obsługi Komunikacji Miejskiej");
    private final JLabel label = new JLabel("WITAMY W SYSTEMIE OBSŁUGI KOMUNIKACJI MIEJSKIEJ");
    private final JLabel label1 = new JLabel("Część Aplikacji przeznaczona dla Kierowców Autobusów");
    private final JLabel label2 = new JLabel("Część Aplikacji przeznaczona dla Pasażerów Komunikacji Miejskiej");
    private final JLabel label3 = new JLabel("WITAMY W STREFIE KIEROWCY ZTM/MPK");
    private final JLabel label4 = new JLabel("WITAMY W STREFIE PASAŻERA");
    private final JLabel label5 = new JLabel("Wybierz numer linii:");
    private final JLabel label6 = new JLabel("W tej części aplikacji możesz odpytać jakie kierowca ma opóźnienie do przystanku, który wybierze w aplikacji");
    private final JLabel label7 = new JLabel("Wybierz kierunek podróży:");
    private final JLabel label8 = new JLabel("Wybierz przystanek:");
    private final JLabel label9 = new JLabel();
    private final JButton button = new JButton("JESTEM KIEROWCĄ");
    private final JButton button1 = new JButton("JESTEM PASAŻEREM");
    private final JButton button2 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button3 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button4 = new JButton("SPRAWDŹ");
    private final String[] numberOfBus = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final JComboBox<String> comboBox = new JComboBox<>(numberOfBus);
    private final JComboBox<String> comboBox2 = new JComboBox<>();
    private final JComboBox<String> comboBox3 = new JComboBox<>();
    private final JPanel panel = new JPanel();
    private final CardLayout cardLayout = new CardLayout();
    private final MyJPanel myJPanel = new MyJPanel();
    private final MyJPanel myJPanel2 = new MyJPanel();
    private final MyJPanel myJPanel3 = new MyJPanel();
    protected Bus bus, bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9;
    protected BusStop busStop1, busStop2, busStop3, busStop4,busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14, busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21,busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64,busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop132, busStop128, busStop129, busStop130, busStop131, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140;

    public Gui() throws UnsupportedAudioFileException {
        frame.setIconImage(new ImageIcon("src/main/java/pl/project/java/bus.jpg").getImage());
        panel.setLayout(cardLayout);
        frame.setBounds(0, 0, 720, 1280);
        frame.setResizable(false);
        init();
        createNewBus();
        createNewBusStop();
        audio();
        button.addActionListener(e -> cardLayout.show(panel, "2"));
        button1.addActionListener(e -> cardLayout.show(panel, "3"));
        button2.addActionListener(e -> cardLayout.show(panel, "1"));
        button3.addActionListener(e -> cardLayout.show(panel, "1"));
        comboBox.addActionListener(this);
        comboBox2.addActionListener(this);
        comboBox3.addActionListener(this);
        button4.addActionListener(this);
        frame.setBounds(0, 0, 1280, 720);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void init(){
        panel.add(myJPanel);
        panel.add(myJPanel2);
        myJPanel.add(button);
        myJPanel.add(button1);
        myJPanel2.add(button2);
        myJPanel3.add(button3);
        myJPanel.setLayout(null);
        myJPanel2.setLayout(null);
        myJPanel3.setLayout(null);
        panel.add(myJPanel, "1");
        panel.add(myJPanel2, "2");
        panel.add(myJPanel3, "3");
        cardLayout.show(panel, "1");
        label.setBounds(210, -250, 900, 600);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label1.setBounds(20, 120, 500, 100);
        label1.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label2.setBounds(770, 120, 500, 100);
        label2.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label3.setBounds(345, -250, 900, 600);
        label3.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label4.setBounds(380, -250, 900, 600);
        label4.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label5.setBounds(130, 230, 300, 100);
        label5.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label6.setBounds(150, 60, 1250, 100);
        label6.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label7.setBounds(530, 230, 300, 100);
        label7.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label7.setForeground(Color.white);
        label8.setBounds(930, 230, 300, 100);
        label8.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label9.setBounds(0, 400, 1280, 100);
        label9.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        myJPanel.add(label);
        myJPanel.add(label1);
        myJPanel.add(label2);
        myJPanel2.add(label3);
        myJPanel3.add(label4);
        myJPanel2.add(comboBox);
        myJPanel2.add(comboBox2);
        myJPanel2.add(comboBox3);
        myJPanel2.add(label5);
        myJPanel2.add(label6);
        myJPanel2.add(label7);
        myJPanel2.add(label8);
        myJPanel2.add(button4);
        button.setBackground(Color.green);
        button1.setBackground(Color.yellow);
        button2.setBackground(Color.cyan);
        button3.setBackground(Color.cyan);
        button4.setBackground(Color.LIGHT_GRAY);
        button.setBounds(100, 200, 200, 100);
        button1.setBounds(900, 200, 200, 100);
        button2.setBounds(440, 600, 400, 50);
        button3.setBounds(440, 600, 400, 50);
        button4.setBounds(535, 350, 180, 30);
        comboBox.setBounds(150, 300, 100, 25);
        comboBox2.setBounds(535, 300, 180, 25);
        comboBox3.setBounds(915, 300, 180, 25);
    }

    private void audio() throws UnsupportedAudioFileException {
        File soundFile = new File("src/main/java/pl/project/java/Jason Derulo - Lifestyle (feat. Adam Levine) [Official Dance Video].wav");
        File soundFile2 = new File("src/main/java/pl/project/java/Jason-Derulo-Take-You-Dancing-_Official-Dance-Video_.wav");

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
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void createNewBus()
    {
        bus = new Bus(1, "Bukówka", "Pietraszki");
        bus1 = new Bus(2, "Sukowska", "Kolberga");
        bus2 = new Bus(3, "Borków", "Kaczmarka");
        bus3 = new Bus(4, "Zagnańska Areszt", "al. Na Stadion");
        bus4 = new Bus(5, "Szybowcowa", "Kolberga");
        bus5 = new Bus(6, "Niestachów pętla", "Dworzec Autobusowy");
        bus6 = new Bus(7, "Zagnańsk Szkoła", "Dworzec Autobusowy");
        bus7 = new Bus(8, "Żniwna", "Os. Ślichowice");
        bus8 = new Bus(9, "Ćmińsk", "Os. Ślichowice");
        bus9 = new Bus(10, "Ciekoty Żeromszczyzna", "Dworzec Autobusowy");
    }

    protected void createNewBusStop()
    {
        busStop1 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Kolberga", 5, "Szybowcowa");
        busStop2 = new BusStop("05:18", "07:25", "13:58", "16:13", "18:40", "1 Maja", 5, "Szybowcowa");
        busStop3 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "IX Wiekow Kielc", 5, "Szybowcowa");
        busStop4 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:11", "Warszawska Politechnika", 5, "Szybowcowa");
        busStop5 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radomska", 5, "Szybowcowa");
        busStop6 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Szybowcowa Kosciol", 5, "Szybowcowa");
        busStop7 = new BusStop("06:10", "10:22", "15:12", "17:11", "19:42", "Szybowcowa", 5, "Szybowcowa");
        busStop8 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Szybowcowa", 5, "Kolberga");
        busStop9 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Szybowcowa Kosciol", 5, "Kolberga");
        busStop10 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radomska", 5, "Kolberga");
        busStop11 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Warszawska Politechnika", 5, "Kolberga");
        busStop12 = new BusStop("07:11", "12:57", "15:48", "18:11", "20:35", "IX Wiekow Kielc", 5, "Kolberga");
        busStop13 = new BusStop("07:12", "13:11", "15:52", "18:20", "20:47", "1 Maja", 5, "Kolberga");
        busStop14 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Szybowcowa", 5, "Kolberga");

        busStop15 = new BusStop("05:29", "08:55", "14:21", "18:24", "20:55", "Pietraszki", 1, "Bukówka");
        busStop16 = new BusStop("05:45", "09:11", "14:40", "18:11", "21:11", "Kolonia I", 1, "Bukówka");
        busStop17 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Fabryczna", 1, "Bukówka");
        busStop18 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Krakowska Biesak", 1, "Bukówka");
        busStop19 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Jagielońska", 1, "Bukówka");
        busStop20 = new BusStop("06:52", "09:55", "15:51", "18:58", "21:58", "Żytnia", 1, "Bukówka");
        busStop21 = new BusStop("07:11", "10:17", "16:15", "19:11", "22:22", "Bukówka", 1, "Bukówka");
        busStop22 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Bukówka", 1, "Pietraszki");
        busStop23 = new BusStop("07:51", "11:21", "16:32", "19:35", "22:40", "Żytnia", 1, "Pietraszki");
        busStop24 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Jagielońska", 1, "Pietraszki");
        busStop25 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Krakowska Biesak", 1, "Pietraszki");
        busStop26 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Fabryczna", 1, "Pietraszki");
        busStop27 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Kolonia I", 1, "Pietraszki");
        busStop28 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Pietraszki", 1, "Pietraszki");

        busStop29 = new BusStop("05:45", "08:55", "14:14", "18:17", "21:37", "Kolberga", 2, "Sukowska");
        busStop30 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Hoża", 2, "Sukowska");
        busStop31 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Jagielońska", 2, "Sukowska");
        busStop32 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Żytnia", 2, "Sukowska");
        busStop33 = new BusStop("06:32", "09:40", "15:13", "19:26", "22:25", "Sciegiennego", 2, "Sukowska");
        busStop34 = new BusStop("06:51", "10:11", "15:24", "19:33", "22:39", "Kalinowa", 2, "Sukowska");
        busStop35 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Sukowska", 2, "Sukowska");
        busStop36 = new BusStop("07:21", "10:51", "16:10", "19:55", "22:58", "Sukowska", 2, "Kolberga");
        busStop37 = new BusStop("07:39", "11:12", "16:24", "20:15", "23:15", "Kalinowa", 2, "Kolberga");
        busStop38 = new BusStop("07:55", "11:30", "16:41", "20:24", "23:26", "Sciegiennego", 2, "Kolberga");
        busStop39 = new BusStop("08:14", "12:21", "16:59", "20:49", "23:43", "Żytnia", 2, "Kolberga");
        busStop40 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Jagielońska", 2, "Kolberga");
        busStop41 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Hoża", 2, "Kolberga");
        busStop42 = new BusStop("08:35", "13:55", "18:05", "21:26", "23:59", "Kolberga", 2, "Kolberga");

        busStop43 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Kaczmarka", 3, "Borków");
        busStop44 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Żytnia", 3, "Borków");
        busStop45 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "IX Wiekow Kielc", 3, "Borków");
        busStop46 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Tarnowska", 3, "Borków");
        busStop47 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Wrzosowa", 3, "Borków");
        busStop48 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Suków", 3, "Borków");
        busStop49 = new BusStop("06:26", "10:17", "15:13", "18:14", "21:11", "Borków", 3, "Borków");
        busStop50 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Borków", 3, "Kaczmarka");
        busStop51 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Suków", 3, "Kaczmarka");
        busStop52 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Wrzosowa", 3, "Kaczmarka");
        busStop53 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Tarnowska", 3, "Kaczmarka");
        busStop54 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "IX Wiekow Kielc", 3, "Kaczmarka");
        busStop55 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Żytnia", 3, "Kaczmarka");
        busStop56 = new BusStop("08:13", "13:10", "16:55", "19:42", "23:44", "Kaczmarka", 3, "Kaczmarka");

        busStop57 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "al. Na Stadion", 4, "Zagnańska Areszt");
        busStop58 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Pakosz", 4, "Zagnańska Areszt");
        busStop59 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Krakowska", 4, "Zagnańska Areszt");
        busStop60 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Seminaryjska", 4, "Zagnańska Areszt");
        busStop61 = new BusStop("04:45", "07:55", "15:06", "18:45", "21:21", "Tarnowska", 4, "Zagnańska Areszt");
        busStop62 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Jesionowa", 4, "Zagnańska Areszt");
        busStop63 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Zagnańska Areszt", 4, "Zagnańska Areszt");
        busStop64 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Zagnańska Areszt", 4, "al. Na Stadion");
        busStop65 = new BusStop("05:37", "11:12", "15:59", "19:35", "22:03", "Jesionowa", 4, "al. Na Stadion");
        busStop66 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Tarnowska", 4, "al. Na Stadion");
        busStop67 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Seminaryjska", 4, "al. Na Stadion");
        busStop68 = new BusStop("06:03", "12:57", "16:45", "20:11", "22:35", "Krakowska", 4, "al. Na Stadion");
        busStop69 = new BusStop("06:10", "13:01", "16:52", "20:20", "22:47", "Pakosz", 4, "al. Na Stadion");
        busStop70 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "al. Na Stadion", 4, "al. Na Stadion");

        busStop71 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Dworzec Autobusowy", 6, "Niestachów pętla");
        busStop72 = new BusStop("05:18", "07:25", "13:58", "16:10", "18:40", "Czarnowska", 6, "Niestachów pętla");
        busStop73 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "Sandomierska", 6, "Niestachów pętla");
        busStop74 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:07", "Cedzyna", 6, "Niestachów pętla");
        busStop75 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radlin", 6, "Niestachów pętla");
        busStop76 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Radlin/Niestachów", 6, "Niestachów pętla");
        busStop77 = new BusStop("06:10", "10:22", "15:11", "17:11", "19:42", "Niestachów pętla", 6, "Niestachów pętla");
        busStop78 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Niestachów pętla", 6, "Dworzec Autobusowy");
        busStop79 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Radlin/Niestachów", 6, "Dworzec Autobusowy");
        busStop80 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radlin", 6, "Dworzec Autobusowy");
        busStop81 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Cedzyna", 6, "Dworzec Autobusowy");
        busStop82 = new BusStop("06:59", "12:57", "15:48", "18:11", "20:35", "Sandomierska", 6, "Dworzec Autobusowy");
        busStop83 = new BusStop("07:10", "13:13", "15:52", "18:20", "20:47", "Czarnowska", 6, "Dworzec Autobusowy");
        busStop84 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Dworzec Autobusowy", 6, "Dworzec Autobusowy");

        busStop85 = new BusStop("05:29", "08:55", "14:21", "18:24", "20:55", "Dworzec Autobusowy", 7, "Zagnańsk Szkoła");
        busStop86 = new BusStop("05:45", "09:11", "14:40", "18:09", "21:11", "Czarnowska", 7, "Zagnańsk Szkoła");
        busStop87 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Jesionowa", 7, "Zagnańsk Szkoła");
        busStop88 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Warszawska/Uroczysko", 7, "Zagnańsk Szkoła");
        busStop89 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Dąbrowa", 7, "Zagnańsk Szkoła");
        busStop90 = new BusStop("06:52", "09:55", "15:51", "18:57", "21:58", "Kajetanów", 7, "Zagnańsk Szkoła");
        busStop91 = new BusStop("07:11", "10:17", "16:12", "19:11", "22:22", "Zagnańsk Szkoła", 7, "Zagnańsk Szkoła");
        busStop92 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Zagnańsk Szkoła", 7, "Dworzec Autobusowy");
        busStop93 = new BusStop("07:51", "11:02", "16:32", "19:35", "22:40", "Kajetanów", 7, "Dworzec Autobusowy");
        busStop94 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Dąbrowa", 7, "Dworzec Autobusowy");
        busStop95 = new BusStop("08:05", "12:12", "16:59", "19:59", "22:58", "Warszawska/Uroczysko", 7, "Dworzec Autobusowy");
        busStop96 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Jesionowa", 7, "Dworzec Autobusowy");
        busStop97 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Czarnowska", 7, "Dworzec Autobusowy");
        busStop98 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Dworzec Autobusowy", 7, "Dworzec Autobusowy");

        busStop99 = new BusStop("05:45", "08:55", "14:12", "18:17", "21:37",  "Os. Ślichowice", 8, "Żniwna");
        busStop100 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Grunwaldzka", 8, "Żniwna");
        busStop101 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Żytnia", 8, "Żniwna");
        busStop102 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Seminaryjska", 8, "Żniwna");
        busStop103 = new BusStop("06:32", "09:40", "15:07", "19:26", "22:25", "Zagórska", 8, "Żniwna");
        busStop104 = new BusStop("06:51", "10:10", "15:24", "19:33", "22:39", "Poleska", 8, "Żniwna");
        busStop105 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Żniwna", 8, "Żniwna");
        busStop106 = new BusStop("07:21", "10:51", "16:13", "19:55", "22:58", "Żniwna", 8, "Os. Ślichowice");
        busStop107 = new BusStop("07:39", "11:12", "16:24", "20:12", "23:15", "Poleska", 8, "Os. Ślichowice");
        busStop108 = new BusStop("07:48", "11:30", "16:41", "20:24", "23:26", "Zagórska", 8, "Os. Ślichowice");
        busStop109 = new BusStop("08:14", "12:17", "16:59", "20:49", "23:43", "Seminaryjska", 8, "Os. Ślichowice");
        busStop110 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Żytnia", 8, "Os. Ślichowice");
        busStop111 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Grunwaldzka", 8, "Os. Ślichowice");
        busStop112 = new BusStop("08:35", "13:55", "18:11", "21:26", "23:59", "Os. Ślichowice", 8, "Os. Ślichowice");

        busStop113 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Os. Ślichowice", 9, "Ćmińsk");
        busStop114 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Czarnowska", 9, "Ćmińsk");
        busStop115 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "Zagnańska", 9, "Ćmińsk");
        busStop116 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Łódzka", 9, "Ćmińsk");
        busStop117 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Kostomłoty", 9, "Ćmińsk");
        busStop118 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Miedziana Góra", 9, "Ćmińsk");
        busStop119 = new BusStop("06:26", "10:16", "15:13", "18:14", "21:11", "Ćmińsk", 9, "Ćmińsk");
        busStop120 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Ćmińsk", 9, "Os. Ślichowice");
        busStop121 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Miedziana Góra", 9, "Os. Ślichowice");
        busStop122 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Kostomłoty", 9, "Os. Ślichowice");
        busStop123 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Łódzka", 9, "Os. Ślichowice");
        busStop124 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "Zagnańska", 9, "Os. Ślichowice");
        busStop125 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Czarnowska", 9, "Os. Ślichowice");
        busStop126 = new BusStop("08:13", "13:13", "16:55", "19:42", "23:44", "Os. Ślichowice", 9, "Os. Ślichowice");

        busStop127 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "Dworzec Autobusowy", 10, "Ciekoty Żeromszczyzna");
        busStop128 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Czarnowska", 10, "Ciekoty Żeromszczyzna");
        busStop129 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Sandomierska", 10, "Ciekoty Żeromszczyzna");
        busStop130 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Cedzyna", 10, "Ciekoty Żeromszczyzna");
        busStop131 = new BusStop("04:45", "07:55", "15:11", "18:45", "21:21", "Leszczyny", 10, "Ciekoty Żeromszczyzna");
        busStop132 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Mąchocice", 10, "Ciekoty Żeromszczyzna");
        busStop133 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Ciekoty Żeromszczyzna", 10, "Ciekoty Żeromszczyzna");
        busStop134 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Ciekoty Żeromszczyzna", 10, "Dworzec Autobusowy");
        busStop135 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Mąchocice", 10, "Dworzec Autobusowy");
        busStop136 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Leszczyny", 10, "Dworzec Autobusowy");
        busStop137 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Cedzyna", 10, "Dworzec Autobusowy");
        busStop138 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Sandomierska", 10, "Dworzec Autobusowy");
        busStop139 = new BusStop("06:10", "13:14", "16:52", "20:20", "22:47", "Czarnowska", 10, "Dworzec Autobusowy");
        busStop140 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "Dworzec Autobusowy", 10, "Dworzec Autobusowy");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int index = comboBox.getSelectedIndex();
        int indexTwo = comboBox2.getSelectedIndex();
        int indexThree = comboBox3.getSelectedIndex();

        if (source == comboBox)
        {
            if (index == 0) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus.getDirectionOne());
                comboBox2.addItem(bus.getDirectionTwo());
            } else if (index == 1) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus1.getDirectionOne());
                comboBox2.addItem(bus1.getDirectionTwo());
            } else if (index == 2) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus2.getDirectionOne());
                comboBox2.addItem(bus2.getDirectionTwo());
            } else if (index == 3) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus3.getDirectionOne());
                comboBox2.addItem(bus3.getDirectionTwo());
            } else if (index == 4) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus4.getDirectionOne());
                comboBox2.addItem(bus4.getDirectionTwo());
            } else if (index == 5) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus5.getDirectionOne());
                comboBox2.addItem(bus5.getDirectionTwo());
            } else if (index == 6) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus6.getDirectionOne());
                comboBox2.addItem(bus6.getDirectionTwo());
            } else if (index == 7) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus7.getDirectionOne());
                comboBox2.addItem(bus7.getDirectionTwo());
            } else if (index == 8) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus8.getDirectionOne());
                comboBox2.addItem(bus8.getDirectionTwo());
            } else if (index == 9) {
                comboBox2.removeAllItems();
                comboBox2.addItem(bus9.getDirectionOne());
                comboBox2.addItem(bus9.getDirectionTwo());
            }
        }
        else if(source == comboBox2)
        {
            if(index == 0 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop15.getBusStopName());
                comboBox3.addItem(busStop16.getBusStopName());
                comboBox3.addItem(busStop17.getBusStopName());
                comboBox3.addItem(busStop18.getBusStopName());
                comboBox3.addItem(busStop19.getBusStopName());
                comboBox3.addItem(busStop20.getBusStopName());
                comboBox3.addItem(busStop21.getBusStopName());
            }
            else if(index == 0 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop22.getBusStopName());
                comboBox3.addItem(busStop23.getBusStopName());
                comboBox3.addItem(busStop24.getBusStopName());
                comboBox3.addItem(busStop25.getBusStopName());
                comboBox3.addItem(busStop26.getBusStopName());
                comboBox3.addItem(busStop27.getBusStopName());
                comboBox3.addItem(busStop28.getBusStopName());
            }
            else if(index == 1 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop36.getBusStopName());
                comboBox3.addItem(busStop37.getBusStopName());
                comboBox3.addItem(busStop38.getBusStopName());
                comboBox3.addItem(busStop39.getBusStopName());
                comboBox3.addItem(busStop40.getBusStopName());
                comboBox3.addItem(busStop41.getBusStopName());
                comboBox3.addItem(busStop42.getBusStopName());
            }
            else if(index == 1 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop29.getBusStopName());
                comboBox3.addItem(busStop30.getBusStopName());
                comboBox3.addItem(busStop31.getBusStopName());
                comboBox3.addItem(busStop32.getBusStopName());
                comboBox3.addItem(busStop33.getBusStopName());
                comboBox3.addItem(busStop34.getBusStopName());
                comboBox3.addItem(busStop35.getBusStopName());
            }
            else if(index == 2 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop43.getBusStopName());
                comboBox3.addItem(busStop44.getBusStopName());
                comboBox3.addItem(busStop45.getBusStopName());
                comboBox3.addItem(busStop46.getBusStopName());
                comboBox3.addItem(busStop47.getBusStopName());
                comboBox3.addItem(busStop48.getBusStopName());
                comboBox3.addItem(busStop49.getBusStopName());
            }
            else if(index == 2 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop50.getBusStopName());
                comboBox3.addItem(busStop51.getBusStopName());
                comboBox3.addItem(busStop52.getBusStopName());
                comboBox3.addItem(busStop53.getBusStopName());
                comboBox3.addItem(busStop54.getBusStopName());
                comboBox3.addItem(busStop55.getBusStopName());
                comboBox3.addItem(busStop56.getBusStopName());
            }
            else if(index == 3 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop57.getBusStopName());
                comboBox3.addItem(busStop58.getBusStopName());
                comboBox3.addItem(busStop59.getBusStopName());
                comboBox3.addItem(busStop60.getBusStopName());
                comboBox3.addItem(busStop61.getBusStopName());
                comboBox3.addItem(busStop62.getBusStopName());
                comboBox3.addItem(busStop63.getBusStopName());
            }
            else if(index == 3 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop64.getBusStopName());
                comboBox3.addItem(busStop65.getBusStopName());
                comboBox3.addItem(busStop66.getBusStopName());
                comboBox3.addItem(busStop67.getBusStopName());
                comboBox3.addItem(busStop68.getBusStopName());
                comboBox3.addItem(busStop69.getBusStopName());
                comboBox3.addItem(busStop70.getBusStopName());
            }
            else if(index == 4 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop8.getBusStopName());
                comboBox3.addItem(busStop9.getBusStopName());
                comboBox3.addItem(busStop10.getBusStopName());
                comboBox3.addItem(busStop11.getBusStopName());
                comboBox3.addItem(busStop12.getBusStopName());
                comboBox3.addItem(busStop13.getBusStopName());
                comboBox3.addItem(busStop14.getBusStopName());
            }
            else if(index == 4 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop1.getBusStopName());
                comboBox3.addItem(busStop2.getBusStopName());
                comboBox3.addItem(busStop3.getBusStopName());
                comboBox3.addItem(busStop4.getBusStopName());
                comboBox3.addItem(busStop5.getBusStopName());
                comboBox3.addItem(busStop6.getBusStopName());
                comboBox3.addItem(busStop7.getBusStopName());
            }
            if(index == 5 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop71.getBusStopName());
                comboBox3.addItem(busStop72.getBusStopName());
                comboBox3.addItem(busStop73.getBusStopName());
                comboBox3.addItem(busStop74.getBusStopName());
                comboBox3.addItem(busStop75.getBusStopName());
                comboBox3.addItem(busStop76.getBusStopName());
                comboBox3.addItem(busStop77.getBusStopName());
            }
            else if(index == 5 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop78.getBusStopName());
                comboBox3.addItem(busStop79.getBusStopName());
                comboBox3.addItem(busStop80.getBusStopName());
                comboBox3.addItem(busStop81.getBusStopName());
                comboBox3.addItem(busStop82.getBusStopName());
                comboBox3.addItem(busStop83.getBusStopName());
                comboBox3.addItem(busStop84.getBusStopName());
            }
            else if(index == 6 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop85.getBusStopName());
                comboBox3.addItem(busStop86.getBusStopName());
                comboBox3.addItem(busStop87.getBusStopName());
                comboBox3.addItem(busStop88.getBusStopName());
                comboBox3.addItem(busStop89.getBusStopName());
                comboBox3.addItem(busStop90.getBusStopName());
                comboBox3.addItem(busStop91.getBusStopName());
            }
            else if(index == 6 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop92.getBusStopName());
                comboBox3.addItem(busStop93.getBusStopName());
                comboBox3.addItem(busStop94.getBusStopName());
                comboBox3.addItem(busStop95.getBusStopName());
                comboBox3.addItem(busStop96.getBusStopName());
                comboBox3.addItem(busStop97.getBusStopName());
                comboBox3.addItem(busStop98.getBusStopName());
            }
            else if(index == 7 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop99.getBusStopName());
                comboBox3.addItem(busStop100.getBusStopName());
                comboBox3.addItem(busStop101.getBusStopName());
                comboBox3.addItem(busStop102.getBusStopName());
                comboBox3.addItem(busStop103.getBusStopName());
                comboBox3.addItem(busStop104.getBusStopName());
                comboBox3.addItem(busStop105.getBusStopName());
            }
            else if(index == 7 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop106.getBusStopName());
                comboBox3.addItem(busStop107.getBusStopName());
                comboBox3.addItem(busStop108.getBusStopName());
                comboBox3.addItem(busStop109.getBusStopName());
                comboBox3.addItem(busStop110.getBusStopName());
                comboBox3.addItem(busStop111.getBusStopName());
                comboBox3.addItem(busStop112.getBusStopName());
            }
            else if(index == 8 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop113.getBusStopName());
                comboBox3.addItem(busStop114.getBusStopName());
                comboBox3.addItem(busStop115.getBusStopName());
                comboBox3.addItem(busStop116.getBusStopName());
                comboBox3.addItem(busStop117.getBusStopName());
                comboBox3.addItem(busStop118.getBusStopName());
                comboBox3.addItem(busStop119.getBusStopName());
            }
            else if(index == 8 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop120.getBusStopName());
                comboBox3.addItem(busStop121.getBusStopName());
                comboBox3.addItem(busStop122.getBusStopName());
                comboBox3.addItem(busStop123.getBusStopName());
                comboBox3.addItem(busStop124.getBusStopName());
                comboBox3.addItem(busStop125.getBusStopName());
                comboBox3.addItem(busStop126.getBusStopName());
            }
            else if(index == 9 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop127.getBusStopName());
                comboBox3.addItem(busStop128.getBusStopName());
                comboBox3.addItem(busStop129.getBusStopName());
                comboBox3.addItem(busStop130.getBusStopName());
                comboBox3.addItem(busStop131.getBusStopName());
                comboBox3.addItem(busStop132.getBusStopName());
                comboBox3.addItem(busStop133.getBusStopName());
            }
            else if(index == 9 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                comboBox3.addItem(busStop134.getBusStopName());
                comboBox3.addItem(busStop135.getBusStopName());
                comboBox3.addItem(busStop136.getBusStopName());
                comboBox3.addItem(busStop137.getBusStopName());
                comboBox3.addItem(busStop138.getBusStopName());
                comboBox3.addItem(busStop139.getBusStopName());
                comboBox3.addItem(busStop140.getBusStopName());
            }
        }
        else if(source == button4)
        {
            if(indexThree == -1 || indexTwo == -1)
            {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK I PRZYSTANEK, ABY APLIKACJA PODAŁA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            }
            else {
                myJPanel2.add(label9);
                label9.setBackground(Color.white);
                label9.setOpaque(true);
                LocalTime localTime = LocalTime.now();
                int hours = localTime.getHour();
                int minutes = localTime.getMinute();
                int busNumber = index + 1;
                String [] nameBusStops = {busStop15.getBusStopName(), busStop16.getBusStopName(), busStop17.getBusStopName(), busStop18.getBusStopName(), busStop19.getBusStopName(), busStop20.getBusStopName(), busStop21.getBusStopName(), busStop22.getBusStopName(), busStop23.getBusStopName(), busStop24.getBusStopName(), busStop25.getBusStopName(),busStop26.getBusStopName(),busStop27.getBusStopName(),busStop28.getBusStopName(), busStop29.getBusStopName(), busStop30.getBusStopName(), busStop31.getBusStopName(), busStop32.getBusStopName(),busStop33.getBusStopName(),busStop34.getBusStopName(),busStop35.getBusStopName(), busStop36.getBusStopName(), busStop37.getBusStopName(), busStop38.getBusStopName(), busStop39.getBusStopName(), busStop40.getBusStopName(), busStop41.getBusStopName(), busStop42.getBusStopName(),busStop43.getBusStopName(), busStop44.getBusStopName(), busStop45.getBusStopName(), busStop46.getBusStopName(), busStop47.getBusStopName(), busStop48.getBusStopName(), busStop49.getBusStopName(), busStop50.getBusStopName(), busStop51.getBusStopName(), busStop52.getBusStopName(), busStop53.getBusStopName(),busStop54.getBusStopName(),busStop55.getBusStopName(),busStop56.getBusStopName(), busStop57.getBusStopName(), busStop58.getBusStopName(), busStop59.getBusStopName(), busStop60.getBusStopName(), busStop61.getBusStopName(), busStop62.getBusStopName(), busStop63.getBusStopName(), busStop64.getBusStopName(), busStop65.getBusStopName(), busStop66.getBusStopName(), busStop67.getBusStopName(),busStop68.getBusStopName(),busStop69.getBusStopName(),busStop70.getBusStopName(), busStop1.getBusStopName(), busStop2.getBusStopName(), busStop3.getBusStopName(), busStop4.getBusStopName(), busStop5.getBusStopName(), busStop6.getBusStopName(), busStop7.getBusStopName(), busStop8.getBusStopName(), busStop9.getBusStopName(), busStop10.getBusStopName(), busStop11.getBusStopName(),busStop12.getBusStopName(),busStop13.getBusStopName(),busStop14.getBusStopName(), busStop71.getBusStopName(), busStop72.getBusStopName(), busStop73.getBusStopName(), busStop74.getBusStopName(), busStop75.getBusStopName(), busStop76.getBusStopName(), busStop77.getBusStopName(), busStop78.getBusStopName(), busStop79.getBusStopName(), busStop80.getBusStopName(), busStop81.getBusStopName(),busStop82.getBusStopName(),busStop83.getBusStopName(),busStop84.getBusStopName(), busStop85.getBusStopName(), busStop86.getBusStopName(), busStop87.getBusStopName(), busStop88.getBusStopName(), busStop89.getBusStopName(), busStop90.getBusStopName(), busStop91.getBusStopName(), busStop92.getBusStopName(), busStop93.getBusStopName(), busStop94.getBusStopName(), busStop95.getBusStopName(),busStop96.getBusStopName(),busStop97.getBusStopName(),busStop98.getBusStopName(), busStop99.getBusStopName(), busStop100.getBusStopName(), busStop101.getBusStopName(), busStop102.getBusStopName(), busStop103.getBusStopName(), busStop104.getBusStopName(), busStop105.getBusStopName(), busStop106.getBusStopName(), busStop107.getBusStopName(), busStop108.getBusStopName(), busStop109.getBusStopName(),busStop110.getBusStopName(),busStop111.getBusStopName(),busStop112.getBusStopName(), busStop113.getBusStopName(), busStop114.getBusStopName(), busStop115.getBusStopName(), busStop116.getBusStopName(), busStop117.getBusStopName(), busStop118.getBusStopName(), busStop119.getBusStopName(), busStop120.getBusStopName(), busStop121.getBusStopName(), busStop122.getBusStopName(), busStop123.getBusStopName(),busStop124.getBusStopName(),busStop125.getBusStopName(),busStop126.getBusStopName(), busStop127.getBusStopName(), busStop128.getBusStopName(), busStop129.getBusStopName(), busStop130.getBusStopName(), busStop131.getBusStopName(), busStop132.getBusStopName(), busStop133.getBusStopName(), busStop134.getBusStopName(), busStop135.getBusStopName(), busStop136.getBusStopName(), busStop137.getBusStopName(),busStop138.getBusStopName(),busStop139.getBusStopName(),busStop140.getBusStopName()}, nameDirections = {bus.getDirectionOne(), bus.getDirectionTwo(), bus1.getDirectionOne(), bus1.getDirectionTwo(), bus2.getDirectionOne(), bus2.getDirectionTwo(), bus3.getDirectionOne(), bus3.getDirectionTwo(),bus4.getDirectionOne(), bus4.getDirectionTwo(), bus5.getDirectionOne(), bus5.getDirectionTwo(), bus6.getDirectionOne(), bus6.getDirectionTwo(), bus7.getDirectionOne(), bus7.getDirectionTwo(), bus8.getDirectionOne(), bus8.getDirectionTwo(),bus9.getDirectionOne(), bus9.getDirectionTwo()};
                BusStop [] nameStops = {busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21, busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64,busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop1, busStop2, busStop3, busStop4,busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14,busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop128, busStop129, busStop130, busStop131, busStop132, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140};
                for(int k = 0; k < 10; k++)
                {
                    if(k == index)
                    {
                        for(int j = 0; j < 2; j++)
                        {
                            if(j == indexTwo)
                            {
                                for(int i = 0; i < 7; i++)
                                {
                                    int pom = i;
                                    int pom2 = j;
                                    if(k == 0 && j == 1)
                                    {
                                        pom = i + 7;
                                    }
                                    if(k > 0)
                                    {
                                        for(int counter = 1; counter < 10; counter++)
                                        {
                                            int busNumberTwo = k + 1;
                                            if(busNumberTwo == counter + 1 && j == 0)
                                            {
                                                pom = 7 * ((2 * busNumberTwo) - 2) + i;
                                                pom2 = k * 2;
                                            }
                                            else if(busNumberTwo == counter + 1)
                                            {
                                                pom = 7 * ((2 * busNumberTwo) - 1) + i;
                                                pom2 = k * 2 + 1;
                                            }
                                        }
                                    }
                                    if(i == indexThree)
                                    {
                                        int tmp = 0;
                                        LocalTime timeOne = LocalTime.parse(nameStops[pom].getDepartureOneTime());
                                        LocalTime timeTwo = LocalTime.parse(nameStops[pom].getDepartureTwoTime());
                                        LocalTime timeThree = LocalTime.parse(nameStops[pom].getDepartureThreeTime());
                                        LocalTime timeFour = LocalTime.parse(nameStops[pom].getDepartureFourTime());
                                        LocalTime timeFive = LocalTime.parse(nameStops[pom].getDepartureFiveTime());
                                        boolean result = timeOne.isBefore(localTime);
                                        boolean resultTwo = timeTwo.isBefore(localTime);
                                        boolean resultThree = timeThree.isBefore(localTime);
                                        boolean resultFour = timeFour.isBefore(localTime);
                                        boolean resultFive = timeFive.isBefore(localTime);
                                        Boolean [] array = {result, resultTwo, resultThree, resultFour, resultFive};
                                        LocalTime [] array2 = {timeOne, timeTwo, timeThree, timeFour, timeFive};
                                        for(int p = 0; p < array.length; p++)
                                        {
                                            if(array[p] || array.length - 1 == p)
                                            {
                                                tmp++;
                                                if(array.length - 1 == p)
                                                {
                                                    tmp = tmp - 2;
                                                    int flag = 0;
                                                    int minutesTwo = array2[tmp].getMinute();
                                                    int hoursTwo = array2[tmp].getHour();
                                                    int differenceHours = hours - hoursTwo;
                                                    int differenceMinutes = minutes - minutesTwo;
                                                    if(hoursTwo > hours)
                                                    {
                                                        differenceHours = 0;
                                                    }
                                                    if(minutesTwo > minutes)
                                                    {
                                                        differenceMinutes = (60 - minutesTwo) + minutes;
                                                        flag++;
                                                    }
                                                    if(flag == 1)
                                                    {
                                                        differenceHours = differenceHours - 1;
                                                    }
                                                    label9.setText("<html>Wybrałeś Kierowco linię numer " + busNumber + ", którą poruszasz się w kierunku " + nameDirections[pom2] + " i chcesz zapytać jakie opoźnienie masz do przystanku <br>o nazwie " + nameBusStops[pom] +
                                                            ". Obecna godzina to: " + hours + ":" + minutes + ". Natomiast ostatni odjazd z tego przystanku przed obecną godziną miał nastąpić<br> o godzinie: " + hoursTwo + ":" + minutesTwo + ". Opóźnienie wynosi: " +
                                                            differenceHours + " godzin i " + differenceMinutes + " minut.</html>");
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}