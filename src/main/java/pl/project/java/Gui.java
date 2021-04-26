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
    private final JLabel label10 = new JLabel("Wybierz kryterium, po którym chcesz znaleźć autobus, którego szukasz");
    private final JLabel label11 = new JLabel("ANIE AUTOBUSU PO NUMER");
    private final JLabel label12 = new JLabel("SZUKANIE AUTOBUSU PO GODZINIE PODANEJ PRZEZ PASAŻERA");
    private final JLabel label13 = new JLabel("SZUKANIE AUTOBUSU PO KONKRETNYM PRZYSTANKU");
    private final JLabel label14 = new JLabel("          W tej części aplikacji możesz wybrać numer linii, a nas");
    private final JLabel label15 = new JLabel("W tej części apliakcji należy wybrać godzinę oraz liczbę minut, a aplikacja znajdzie pięć odjazdów, które wystąpią najszybciej po wybranej godzinie ");
    private final JLabel label16 = new JLabel("Należy wybrać przystanek z listy dostępnej w bazie, a następnie aplikacja poda numer linii wraz z kierunkem podróży oraz godziną odjazdu z wybranego przystanku");
    private final JLabel label17 = new JLabel("                      Wybierz kierunek podróży:");
    private final JLabel label18 = new JLabel("                   Wybierz numer linii:");
    private final JLabel label19 = new JLabel("                                          SZUK");
    private final JLabel label20 = new JLabel("ZE  LINII");
    private final JLabel label21 = new JLabel();
    private final JLabel label22 = new JLabel("tępnie kierunek który cię interesuje, a aplikacja zwróci wszy");
    private final JLabel label23 = new JLabel("stkie przystanki tej linii wraz z godziną odjazdu z nich");
    private final JLabel label24 = new JLabel("                                                         ");
    private final JLabel label25 = new JLabel("                                                         ");
    private final JLabel label26 = new JLabel("                                                         ");
    private final JLabel label27 = new JLabel("Wybierz godzinę:");
    private final JLabel label28 = new JLabel("Wybierz ilość minut:");
    private final JTextArea jTextArea = new JTextArea();
    private final JScrollPane jScrollPane = new JScrollPane(jTextArea);
    private final JButton button = new JButton("JESTEM KIEROWCĄ");
    private final JButton button1 = new JButton("JESTEM PASAŻEREM");
    private final JButton button2 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button3 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button4 = new JButton("SPRAWDŹ");
    private final JButton button5 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button6 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button7 = new JButton("WRÓĆ DO MENU GŁÓWNEGO");
    private final JButton button8 = new JButton("WYSZUKAJ POŁĄCZENIA PO NUMERZE LINII");
    private final JButton button9 = new JButton("WYSZUKAJ POŁĄCZENIA PO GODZINIE");
    private final JButton button10 = new JButton("WYSZUKAJ POŁĄCZENIA PO KONKRETNYM PRZYSTANKU");
    private final JButton button11 = new JButton("WRÓĆ DO MENU KRYTERIÓW SZUKANIA AUTOBUSU");
    private final JButton button12 = new JButton("WRÓĆ DO MENU KRYTERIÓW SZUKANIA AUTOBUSU");
    private final JButton button13 = new JButton("WRÓĆ DO MENU KRYTERIÓW SZUKANIA AUTOBUSU");
    private final JButton button14 = new JButton("SPRAWDŹ");
    private final JButton button15 = new JButton("SPRAWDŹ");
    private final Integer[] numberOfBus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final String[] minutes = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
    private final String[] hours = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private final JComboBox<Integer> comboBox = new JComboBox<>(numberOfBus);
    private final JComboBox<String> comboBox2 = new JComboBox<>();
    private final JComboBox<String> comboBox3 = new JComboBox<>();
    private final JComboBox<Integer> comboBox4 = new JComboBox<>(numberOfBus);
    private final JComboBox<String> comboBox5 = new JComboBox<>();
    private final JComboBox<String> comboBox6 = new JComboBox<>(hours);
    private final JComboBox<String> comboBox7 = new JComboBox<>(minutes);
    private final JPanel panel = new JPanel();
    private final CardLayout cardLayout = new CardLayout();
    private final MyJPanel myJPanel = new MyJPanel();
    private final MyJPanel myJPanel2 = new MyJPanel();
    private final MyJPanel myJPanel3 = new MyJPanel();
    private final MyJPanel myJPanel4 = new MyJPanel();
    private final MyJPanel myJPanel5 = new MyJPanel();
    private final MyJPanel myJPanel6 = new MyJPanel();
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
        button8.addActionListener(e -> cardLayout.show(panel, "4"));
        button9.addActionListener(e -> cardLayout.show(panel, "5"));
        button10.addActionListener(e -> cardLayout.show(panel, "6"));
        button5.addActionListener(e -> cardLayout.show(panel, "1"));
        button6.addActionListener(e -> cardLayout.show(panel, "1"));
        button7.addActionListener(e -> cardLayout.show(panel, "1"));
        button11.addActionListener(e -> cardLayout.show(panel, "3"));
        button12.addActionListener(e -> cardLayout.show(panel, "3"));
        button13.addActionListener(e -> cardLayout.show(panel, "3"));
        comboBox.addActionListener(this);
        comboBox2.addActionListener(this);
        comboBox3.addActionListener(this);
        comboBox4.addActionListener(this);
        comboBox5.addActionListener(this);
        comboBox6.addActionListener(this);
        comboBox7.addActionListener(this);
        button4.addActionListener(this);
        button14.addActionListener(this);
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
        myJPanel4.setLayout(new GridLayout(6,3,0,0));
        myJPanel5.setLayout(null);
        myJPanel6.setLayout(null);
        panel.add(myJPanel, "1");
        panel.add(myJPanel2, "2");
        panel.add(myJPanel3, "3");
        panel.add(myJPanel4, "4");
        panel.add(myJPanel5, "5");
        panel.add(myJPanel6, "6");
        cardLayout.show(panel, "1");
        label.setBounds(210, -250, 900, 600);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label1.setBounds(20, 120, 500, 100);
        label1.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label2.setBounds(770, 120, 500, 100);
        label2.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label3.setBounds(345, -250, 900, 600);
        label3.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label4.setBounds(420, -250, 900, 600);
        label4.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label5.setBounds(170, 230, 300, 100);
        label5.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label6.setBounds(150, 60, 1250, 100);
        label6.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label7.setBounds(530, 230, 300, 100);
        label7.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label7.setForeground(Color.white);
        label8.setBounds(940, 230, 300, 100);
        label8.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label9.setBounds(0, 400, 1280, 100);
        label9.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label10.setBounds(310, 60, 1250, 100);
        label10.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label11.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label19.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label20.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label12.setBounds(150, -250, 1000, 600);
        label12.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label13.setBounds(220, -250, 900, 600);
        label13.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label14.setBounds(50, 60, 1200, 100);
        label14.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label22.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label23.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label15.setBounds(120, 60, 1280, 100);
        label15.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label16.setBounds(60, 60, 1280, 100);
        label16.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label18.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label17.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label28.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label27.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        jTextArea.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        jTextArea.setBackground(Color.white);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);
        jScrollPane.setPreferredSize(new Dimension(500,200));
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        myJPanel4.add(label19);
        myJPanel4.add(label11);
        myJPanel4.add(label20);
        myJPanel4.add(label14);
        myJPanel4.add(label22);
        myJPanel4.add(label23);
        myJPanel4.add(label18);
        myJPanel4.add(label21);
        myJPanel4.add(label17);
        myJPanel4.add(comboBox4);
        myJPanel4.add(button14);
        myJPanel4.add(comboBox5);
        myJPanel4.add(label24);
        myJPanel4.add(jScrollPane);
        myJPanel4.add(label25);
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
        myJPanel3.add(button8);
        myJPanel3.add(button9);
        myJPanel3.add(button10);
        myJPanel3.add(label10);
        myJPanel4.add(button5);
        myJPanel4.add(label26);
        myJPanel5.add(button6);
        myJPanel6.add(button7);
        myJPanel4.add(button11);
        myJPanel5.add(button12);
        myJPanel6.add(button13);
        myJPanel5.add(label12);
        myJPanel6.add(label13);
        myJPanel5.add(label15);
        myJPanel6.add(label16);
        myJPanel5.add(comboBox6);
        myJPanel5.add(comboBox7);
        myJPanel5.add(label27);
        myJPanel5.add(label28);
        myJPanel5.add(button15);
        button.setBackground(Color.green);
        button1.setBackground(Color.yellow);
        button2.setBackground(Color.cyan);
        button3.setBackground(Color.cyan);
        button7.setBackground(Color.cyan);
        button5.setBackground(Color.cyan);
        button6.setBackground(Color.cyan);
        button4.setBackground(Color.LIGHT_GRAY);
        button8.setBackground(Color.yellow);
        button9.setBackground(Color.orange);
        button10.setBackground(Color.green);
        button11.setBackground(Color.pink);
        button12.setBackground(Color.pink);
        button13.setBackground(Color.pink);
        button14.setBackground(Color.green);
        button15.setBackground(Color.green);
        button.setBounds(100, 200, 200, 100);
        button1.setBounds(900, 200, 200, 100);
        button2.setBounds(440, 600, 400, 50);
        button3.setBounds(440, 600, 400, 50);
        button4.setBounds(535, 350, 180, 33);
        button6.setBounds(190, 600, 400, 50);
        button7.setBounds(190, 600, 400, 50);
        button8.setBounds(50, 200, 370, 100);
        button9.setBounds(450, 200, 370, 100);
        button10.setBounds(850, 200, 370, 100);
        button12.setBounds(670, 600, 400, 50);
        button13.setBounds(670, 600, 400, 50);
        comboBox.setBounds(150, 300, 180, 33);
        comboBox2.setBounds(535, 300, 180, 33);
        comboBox3.setBounds(920, 300, 180, 33);
        comboBox6.setBounds(200, 200, 180, 33);
        comboBox7.setBounds(915, 200, 180, 33);
        label27.setBounds(200, 160, 180, 33);
        label28.setBounds(915, 160, 180, 33);
        button15.setBounds(531, 240, 200, 50);
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
        LocalTime localTime = LocalTime.now();
        int hours = localTime.getHour();
        int minutes = localTime.getMinute();
        int index = comboBox.getSelectedIndex();
        int indexTwo = comboBox2.getSelectedIndex();
        int indexThree = comboBox3.getSelectedIndex();
        int indexFour = comboBox4.getSelectedIndex();
        int indexFive = comboBox5.getSelectedIndex();
        int indexSix = comboBox6.getSelectedIndex();
        int indexSeven = comboBox7.getSelectedIndex();
        String [] nameBusStops = {busStop15.getBusStopName(), busStop16.getBusStopName(), busStop17.getBusStopName(), busStop18.getBusStopName(), busStop19.getBusStopName(), busStop20.getBusStopName(), busStop21.getBusStopName(), busStop22.getBusStopName(), busStop23.getBusStopName(), busStop24.getBusStopName(), busStop25.getBusStopName(),busStop26.getBusStopName(),busStop27.getBusStopName(),busStop28.getBusStopName(), busStop29.getBusStopName(), busStop30.getBusStopName(), busStop31.getBusStopName(), busStop32.getBusStopName(),busStop33.getBusStopName(),busStop34.getBusStopName(),busStop35.getBusStopName(), busStop36.getBusStopName(), busStop37.getBusStopName(), busStop38.getBusStopName(), busStop39.getBusStopName(), busStop40.getBusStopName(), busStop41.getBusStopName(), busStop42.getBusStopName(),busStop43.getBusStopName(), busStop44.getBusStopName(), busStop45.getBusStopName(), busStop46.getBusStopName(), busStop47.getBusStopName(), busStop48.getBusStopName(), busStop49.getBusStopName(), busStop50.getBusStopName(), busStop51.getBusStopName(), busStop52.getBusStopName(), busStop53.getBusStopName(),busStop54.getBusStopName(),busStop55.getBusStopName(),busStop56.getBusStopName(), busStop57.getBusStopName(), busStop58.getBusStopName(), busStop59.getBusStopName(), busStop60.getBusStopName(), busStop61.getBusStopName(), busStop62.getBusStopName(), busStop63.getBusStopName(), busStop64.getBusStopName(), busStop65.getBusStopName(), busStop66.getBusStopName(), busStop67.getBusStopName(),busStop68.getBusStopName(),busStop69.getBusStopName(),busStop70.getBusStopName(), busStop1.getBusStopName(), busStop2.getBusStopName(), busStop3.getBusStopName(), busStop4.getBusStopName(), busStop5.getBusStopName(), busStop6.getBusStopName(), busStop7.getBusStopName(), busStop8.getBusStopName(), busStop9.getBusStopName(), busStop10.getBusStopName(), busStop11.getBusStopName(),busStop12.getBusStopName(),busStop13.getBusStopName(),busStop14.getBusStopName(), busStop71.getBusStopName(), busStop72.getBusStopName(), busStop73.getBusStopName(), busStop74.getBusStopName(), busStop75.getBusStopName(), busStop76.getBusStopName(), busStop77.getBusStopName(), busStop78.getBusStopName(), busStop79.getBusStopName(), busStop80.getBusStopName(), busStop81.getBusStopName(),busStop82.getBusStopName(),busStop83.getBusStopName(),busStop84.getBusStopName(), busStop85.getBusStopName(), busStop86.getBusStopName(), busStop87.getBusStopName(), busStop88.getBusStopName(), busStop89.getBusStopName(), busStop90.getBusStopName(), busStop91.getBusStopName(), busStop92.getBusStopName(), busStop93.getBusStopName(), busStop94.getBusStopName(), busStop95.getBusStopName(),busStop96.getBusStopName(),busStop97.getBusStopName(),busStop98.getBusStopName(), busStop99.getBusStopName(), busStop100.getBusStopName(), busStop101.getBusStopName(), busStop102.getBusStopName(), busStop103.getBusStopName(), busStop104.getBusStopName(), busStop105.getBusStopName(), busStop106.getBusStopName(), busStop107.getBusStopName(), busStop108.getBusStopName(), busStop109.getBusStopName(),busStop110.getBusStopName(),busStop111.getBusStopName(),busStop112.getBusStopName(), busStop113.getBusStopName(), busStop114.getBusStopName(), busStop115.getBusStopName(), busStop116.getBusStopName(), busStop117.getBusStopName(), busStop118.getBusStopName(), busStop119.getBusStopName(), busStop120.getBusStopName(), busStop121.getBusStopName(), busStop122.getBusStopName(), busStop123.getBusStopName(),busStop124.getBusStopName(),busStop125.getBusStopName(),busStop126.getBusStopName(), busStop127.getBusStopName(), busStop128.getBusStopName(), busStop129.getBusStopName(), busStop130.getBusStopName(), busStop131.getBusStopName(), busStop132.getBusStopName(), busStop133.getBusStopName(), busStop134.getBusStopName(), busStop135.getBusStopName(), busStop136.getBusStopName(), busStop137.getBusStopName(),busStop138.getBusStopName(),busStop139.getBusStopName(),busStop140.getBusStopName()}, nameDirections = {bus.getDirectionOne(), bus.getDirectionTwo(), bus1.getDirectionOne(), bus1.getDirectionTwo(), bus2.getDirectionOne(), bus2.getDirectionTwo(), bus3.getDirectionOne(), bus3.getDirectionTwo(),bus4.getDirectionOne(), bus4.getDirectionTwo(), bus5.getDirectionOne(), bus5.getDirectionTwo(), bus6.getDirectionOne(), bus6.getDirectionTwo(), bus7.getDirectionOne(), bus7.getDirectionTwo(), bus8.getDirectionOne(), bus8.getDirectionTwo(),bus9.getDirectionOne(), bus9.getDirectionTwo()};
        BusStop [] nameStops = {busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21, busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64,busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop1, busStop2, busStop3, busStop4,busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14,busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop128, busStop129, busStop130, busStop131, busStop132, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140};

        if (source == comboBox) {
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
        else if(source == comboBox4)
        {
            if (indexFour == 0) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus.getDirectionOne());
                comboBox5.addItem(bus.getDirectionTwo());
            } else if (indexFour == 1) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus1.getDirectionOne());
                comboBox5.addItem(bus1.getDirectionTwo());
            } else if (indexFour == 2) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus2.getDirectionOne());
                comboBox5.addItem(bus2.getDirectionTwo());
            } else if (indexFour == 3) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus3.getDirectionOne());
                comboBox5.addItem(bus3.getDirectionTwo());
            } else if (indexFour == 4) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus4.getDirectionOne());
                comboBox5.addItem(bus4.getDirectionTwo());
            } else if (indexFour == 5) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus5.getDirectionOne());
                comboBox5.addItem(bus5.getDirectionTwo());
            } else if (indexFour == 6) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus6.getDirectionOne());
                comboBox5.addItem(bus6.getDirectionTwo());
            } else if (indexFour == 7) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus7.getDirectionOne());
                comboBox5.addItem(bus7.getDirectionTwo());
            } else if (indexFour == 8) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus8.getDirectionOne());
                comboBox5.addItem(bus8.getDirectionTwo());
            } else if (indexFour == 9) {
                comboBox5.removeAllItems();
                comboBox5.addItem(bus9.getDirectionOne());
                comboBox5.addItem(bus9.getDirectionTwo());
            }
        }
        else if(source == comboBox2)
        {
            String [] busStopsOne = {busStop15.getBusStopName(), busStop16.getBusStopName(), busStop17.getBusStopName(), busStop18.getBusStopName(), busStop19.getBusStopName(), busStop20.getBusStopName(),busStop21.getBusStopName()}, busStopsTwo = {busStop22.getBusStopName(), busStop23.getBusStopName(), busStop24.getBusStopName(), busStop25.getBusStopName(), busStop26.getBusStopName(), busStop27.getBusStopName(),busStop28.getBusStopName()}, busStopsThree = {busStop36.getBusStopName(), busStop37.getBusStopName(), busStop38.getBusStopName(), busStop39.getBusStopName(), busStop40.getBusStopName(), busStop41.getBusStopName(),busStop42.getBusStopName()}, busStopsFour = {busStop29.getBusStopName(), busStop30.getBusStopName(), busStop31.getBusStopName(), busStop32.getBusStopName(), busStop33.getBusStopName(), busStop34.getBusStopName(),busStop35.getBusStopName()}, busStopsFive = {busStop43.getBusStopName(), busStop44.getBusStopName(), busStop45.getBusStopName(), busStop46.getBusStopName(), busStop47.getBusStopName(), busStop48.getBusStopName(),busStop49.getBusStopName()},busStopsSix = {busStop50.getBusStopName(), busStop51.getBusStopName(), busStop52.getBusStopName(), busStop53.getBusStopName(), busStop54.getBusStopName(), busStop55.getBusStopName(),busStop56.getBusStopName()},busStopsSeven = {busStop57.getBusStopName(), busStop58.getBusStopName(), busStop59.getBusStopName(), busStop60.getBusStopName(), busStop61.getBusStopName(), busStop62.getBusStopName(),busStop63.getBusStopName()},busStopsEight = {busStop64.getBusStopName(), busStop65.getBusStopName(), busStop66.getBusStopName(), busStop67.getBusStopName(), busStop68.getBusStopName(), busStop69.getBusStopName(),busStop70.getBusStopName()},busStopsNine = {busStop8.getBusStopName(), busStop9.getBusStopName(), busStop10.getBusStopName(), busStop11.getBusStopName(), busStop12.getBusStopName(), busStop13.getBusStopName(),busStop14.getBusStopName()},busStopsTen = {busStop1.getBusStopName(), busStop2.getBusStopName(), busStop3.getBusStopName(), busStop4.getBusStopName(), busStop5.getBusStopName(), busStop6.getBusStopName(),busStop7.getBusStopName()},busStopsEleven = {busStop71.getBusStopName(), busStop72.getBusStopName(), busStop73.getBusStopName(), busStop74.getBusStopName(), busStop75.getBusStopName(), busStop76.getBusStopName(),busStop77.getBusStopName()},busStopsTwelve = {busStop78.getBusStopName(), busStop79.getBusStopName(), busStop80.getBusStopName(), busStop81.getBusStopName(), busStop82.getBusStopName(), busStop83.getBusStopName(),busStop84.getBusStopName()},busStopsThreeteen = {busStop85.getBusStopName(), busStop86.getBusStopName(), busStop87.getBusStopName(), busStop88.getBusStopName(), busStop89.getBusStopName(), busStop90.getBusStopName(),busStop91.getBusStopName()},busStopsFourteen = {busStop92.getBusStopName(), busStop93.getBusStopName(), busStop94.getBusStopName(), busStop95.getBusStopName(), busStop96.getBusStopName(), busStop97.getBusStopName(),busStop98.getBusStopName()},busStopsFiveteen = {busStop99.getBusStopName(), busStop100.getBusStopName(), busStop101.getBusStopName(), busStop102.getBusStopName(), busStop103.getBusStopName(), busStop104.getBusStopName(),busStop105.getBusStopName()},busStopsSixteen = {busStop106.getBusStopName(), busStop107.getBusStopName(), busStop108.getBusStopName(), busStop109.getBusStopName(), busStop110.getBusStopName(), busStop111.getBusStopName(),busStop112.getBusStopName()},busStopsSeventeen = {busStop113.getBusStopName(), busStop114.getBusStopName(), busStop115.getBusStopName(), busStop116.getBusStopName(), busStop117.getBusStopName(), busStop118.getBusStopName(),busStop119.getBusStopName()},busStopsEightteen = {busStop120.getBusStopName(), busStop121.getBusStopName(), busStop122.getBusStopName(), busStop123.getBusStopName(), busStop124.getBusStopName(), busStop125.getBusStopName(),busStop126.getBusStopName()},busStopsNineteen = {busStop127.getBusStopName(), busStop128.getBusStopName(), busStop129.getBusStopName(), busStop130.getBusStopName(), busStop131.getBusStopName(), busStop132.getBusStopName(),busStop133.getBusStopName()},busStopsTwenty = {busStop134.getBusStopName(), busStop135.getBusStopName(), busStop136.getBusStopName(), busStop137.getBusStopName(), busStop138.getBusStopName(), busStop139.getBusStopName(),busStop140.getBusStopName()};
            if(index == 0 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsOne) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 0 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsTwo) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 1 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsThree) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 1 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsFour) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 2 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsFive) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 2 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsSix) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 3 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsSeven) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 3 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsEight) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 4 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsNine) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 4 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsTen) {
                    comboBox3.addItem(bus);
                }
            }
            if(index == 5 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsEleven) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 5 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsTwelve) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 6 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsThreeteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 6 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsFourteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 7 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsFiveteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 7 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsSixteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 8 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsSeventeen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 8 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsEightteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 9 && indexTwo == 0)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsNineteen) {
                    comboBox3.addItem(bus);
                }
            }
            else if(index == 9 && indexTwo == 1)
            {
                comboBox3.removeAllItems();
                for (String bus: busStopsTwenty) {
                    comboBox3.addItem(bus);
                }
            }
        }
        else if(source == button4)
        {
            if(index == -1 || indexThree == -1 || indexTwo == -1)
            {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK I PRZYSTANEK, ABY APLIKACJA PODAŁA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            }
            else {
                myJPanel2.add(label9);
                label9.setBackground(Color.white);
                label9.setOpaque(true);
                int busNumber = index + 1;
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
                                                    if(minutes < 10)
                                                    {
                                                        label9.setText("<html> Wybrałeś Kierowco linię numer " + busNumber + ", którą poruszasz się w kierunku " + nameDirections[pom2] + " i chcesz zapytać jakie opoźnienie masz do przystanku <br> o nazwie " + nameBusStops[pom] +
                                                                ". Obecna godzina to: " + hours + ":0" + minutes + ". Natomiast ostatni odjazd z tego przystanku przed obecną godziną miał nastąpić<br> o godzinie: " + hoursTwo + ":" + minutesTwo + ". Opóźnienie wynosi: " +
                                                                differenceHours + " godzin i " + differenceMinutes + " minut.</html>");
                                                    }
                                                    else
                                                    {
                                                        label9.setText("<html> Wybrałeś Kierowco linię numer " + busNumber + ", którą poruszasz się w kierunku " + nameDirections[pom2] + " i chcesz zapytać jakie opoźnienie masz do przystanku <br> o nazwie " + nameBusStops[pom] +
                                                                ". Obecna godzina to: " + hours + ":" + minutes + ". Natomiast ostatni odjazd z tego przystanku przed obecną godziną miał nastąpić<br> o godzinie: " + hoursTwo + ":" + minutesTwo + ". Opóźnienie wynosi: " +
                                                                differenceHours + " godzin i " + differenceMinutes + " minut.</html>");
                                                    }
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
        else if(source == button14)
        {
            if(indexFour == -1 || indexFive == -1)
            {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK, ABY APLIKACJA PODAŁA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                jTextArea.setSize(1280,100);
                jTextArea.setLocation(0,400);
                int busNumber = indexFour + 1;
                for(int k = 0; k < 10; k++) {
                    if (k == indexFour) {
                        for (int j = 0; j < 2; j++) {
                            if (j == indexFive) {
                                for (int i = 0; i < 7; i++) {
                                    int pom = i;
                                    int pom2 = j;
                                    if (k == 0 && j == 1) {
                                        pom = i + 7;
                                    }
                                    if (k > 0) {
                                        for (int counter = 1; counter < 10; counter++) {
                                            int busNumberTwo = k + 1;
                                            if (busNumberTwo == counter + 1 && j == 0) {
                                                pom = 7 * ((2 * busNumberTwo) - 2) + i;
                                                pom2 = k * 2;
                                            } else if (busNumberTwo == counter + 1) {
                                                pom = 7 * ((2 * busNumberTwo) - 1) + i;
                                                pom2 = k * 2 + 1;
                                            }
                                        }
                                    }
                                    if(i == 0)
                                        jTextArea.setText(null);
                                    LocalTime timeOne = LocalTime.parse(nameStops[pom].getDepartureOneTime());
                                    LocalTime timeTwo = LocalTime.parse(nameStops[pom].getDepartureTwoTime());
                                    LocalTime timeThree = LocalTime.parse(nameStops[pom].getDepartureThreeTime());
                                    LocalTime timeFour = LocalTime.parse(nameStops[pom].getDepartureFourTime());
                                    LocalTime timeFive = LocalTime.parse(nameStops[pom].getDepartureFiveTime());
                                    LocalTime [] array2 = {timeOne, timeTwo, timeThree, timeFour, timeFive};
                                    int minutesTwo = array2[0].getMinute(), minutesThree = array2[1].getMinute(),minutesFour = array2[2].getMinute(), minutesFive = array2[3].getMinute(), minutesSix = array2[4].getMinute();
                                    int hoursTwo = array2[0].getHour(), hoursThree = array2[1].getHour(), hoursFour = array2[2].getHour(), hoursFive = array2[3].getHour(), hoursSix = array2[4].getHour();
                                    jTextArea.append("\nLINIA NUMER: " + busNumber + "\nKIERUNEK: " + nameDirections[pom2] + "\nPRZYSTANEK: " + nameBusStops[pom] +
                                            "\nOdjazd numer 1 następuje o godzinie: " + hoursTwo + ":" + minutesTwo  +
                                            "\nOdjazd numer 2 następuje o godzinie: " + hoursThree + ":" + minutesThree +
                                            "\nOdjazd numer 3 następuje o godzinie: " + hoursFour + ":" + minutesFour +
                                            "\nOdjazd numer 4 następuje o godzinie: " + hoursFive + ":" + minutesFive +
                                            "\nOdjazd numer 5 następuje o godzinie: " + hoursSix + ":" + minutesSix + "\n");
                                }
                            }
                        }
                    }
                }
            }
        }
        else if(source == button15)
        {
            if(indexSix == -1 || indexSeven == -1)
            {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK, ABY APLIKACJA PODAŁA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}