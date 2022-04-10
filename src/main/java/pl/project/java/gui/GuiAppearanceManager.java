package pl.project.java.gui;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;

public final class GuiAppearanceManager extends Gui {
    private static final JLabel label = new JLabel("WITAMY W SYSTEMIE OBSLUGI KOMUNIKACJI MIEJSKIEJ");
    private static final JLabel label1 = new JLabel("Czesc Aplikacji przeznaczona dla Kierowcow Autobusow");
    private static final JLabel label2 = new JLabel("Czesc Aplikacji przeznaczona dla Pasazerow Komunikacji Miejskiej");
    private static final JLabel label3 = new JLabel("WITAMY W STREFIE KIEROWCY ZTM/MPK");
    private static final JLabel label4 = new JLabel("WITAMY W STREFIE PASAZERA");
    private static final JLabel label5 = new JLabel("Wybierz numer linii:");
    private static final JLabel label6 = new JLabel("W tej czesci aplikacji możesz odpytac jakie kierowca ma opoznienie do przystanku, który wybierze w aplikacji");
    private static final JLabel label7 = new JLabel("Wybierz kierunek podrozy:");
    private static final JLabel label8 = new JLabel("Wybierz przystanek:");
    private static final JLabel label10 = new JLabel("Wybierz kryterium, po ktorym chcesz znalezc autobus, ktorego szukasz");
    private static final JLabel label11 = new JLabel("ANIE AUTOBUSU PO NUMER");
    private static final JLabel label12 = new JLabel("SZUKANIE AUTOBUSU PO GODZINIE PODANEJ PRZEZ PASAZERA");
    private static final JLabel label13 = new JLabel("SZUKANIE AUTOBUSU PO KONKRETNYM PRZYSTANKU");
    private static final JLabel label14 = new JLabel("          W tej czesci aplikacji możesz wybrać numer linii, a nas");
    private static final JLabel label15 = new JLabel("W tej części apliakcji należy wybrac godzine oraz liczbe minut, a aplikacja znajdzie 5 najblizszych odjazdow, które wystąpia o danej godzinie lub po godzinie podanej przez pasazera");
    private static final JLabel label16 = new JLabel("Nalezy wybrac przystanek z listy dostępnej w bazie, a następnie aplikacja poda numer linii wraz z kierunkem podrozy oraz godzina odjazdu z wybranego przystanku");
    private static final JLabel label17 = new JLabel("                      Wybierz kierunek podrozy:");
    private static final JLabel label18 = new JLabel("                   Wybierz numer linii:");
    private static final JLabel label19 = new JLabel("                                          SZUK");
    private static final JLabel label20 = new JLabel("ZE  LINII");
    private static final JLabel label21 = new JLabel();
    private static final JLabel label22 = new JLabel("tepnie kierunek ktory cię interesuje, a aplikacja zwroci wszy");
    private static final JLabel label23 = new JLabel("stkie przystanki tej linii wraz z godzina odjazdu z nich");
    private static final JLabel label24 = new JLabel("                                                         ");
    private static final JLabel label25 = new JLabel("                                                         ");
    private static final JLabel label26 = new JLabel("                                                         ");
    private static final JLabel label27 = new JLabel("Wybierz godzine:");
    private static final JLabel label28 = new JLabel("Wybierz ilosc minut:");
    private static final JLabel label30 = new JLabel("UWAGA!!! W przypadku, gdy odbedzie się mniej niz 5 odjazdow ze względu na pore dnia, zostaną wyswietlone wszystkie odjazdy, ktore pozostaly");
    private static final JLabel label31 = new JLabel("Wybierz Przystanek:");
    private static final JScrollPane jScrollPane = new JScrollPane(jTextArea);
    private static final MyJPanel myJPanel = new MyJPanel();
    private static final MyJPanel myJPanel3 = new MyJPanel();
    private static final MyJPanel myJPanel4 = new MyJPanel();
    private static final MyJPanel myJPanel6 = new MyJPanel();

    /**
     * Konstruktor klasy Gui
     * Konstruktor zawiera wczytanie ikonki aplikacji
     * Ustawiono layout jako cardLayout, aby moc obslugiwac wiele okien czyli panelow
     * Ustawiono rozmiar okna na 1280x720 pikseli oraz zakaz mozliwosci modyfikowania rozmiaru okna
     * Nastepnie wywolane sa metody obslugujace rozmieszczenie elementow na panelach oraz metode zarzadzajaca audio czy tez metody tworzace obiekty, ktore pozniej sa dodawane do bazy danych, a takze metoda obslugujaca zdarzenia
     * Na koncu kosntruktora mamy ustawiona lokalizacje okna po wlaczeniu aplikacji, dodanie panelu glownego do aplikacji czy tez mozliwosc zamkniecia aplikacji poprzez nacisniecia przycisku krzyzyka w prawym gornym rogu aplikacji
     *
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     */
    public GuiAppearanceManager() throws UnsupportedAudioFileException {
    }

    /**
     * Metoda initButtons inicjuje wszystkie przyciski typu Button w aplikacji. Ustalany jest tutaj rozmiar, kolor oraz wspolrzedne rozmieszczenia przycisku
     */
    static void initButtons() {
        button.setBackground(Color.green);
        button1.setBackground(Color.yellow);
        button2.setBackground(Color.cyan);
        button3.setBackground(Color.cyan);
        button4.setBackground(Color.LIGHT_GRAY);
        button5.setBackground(Color.cyan);
        button6.setBackground(Color.cyan);
        button7.setBackground(Color.cyan);
        button8.setBackground(Color.yellow);
        button9.setBackground(Color.orange);
        button10.setBackground(Color.green);
        button11.setBackground(Color.pink);
        button12.setBackground(Color.pink);
        button13.setBackground(Color.pink);
        button14.setBackground(Color.green);
        button15.setBackground(Color.green);
        button16.setBackground(Color.green);
        button17.setBackground(Color.cyan);
        button.setBounds(100, 200, 250, 100);
        button1.setBounds(900, 200, 250, 100);
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
        button15.setBounds(531, 240, 200, 50);
        button16.setBounds(536, 260, 200, 40);
        button17.setBounds(836, 200, 250, 40);
    }

    /**
     * W metodzie initLabels inicjowane sa wszystkie labele dostepne w aplikacji. Ustalana jest czcionka, rozmiar czy rozmieszczenie na panelu konkretnych napisow
     */
    static void initLabels() {
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
        label12.setBounds(150, -250, 1000, 600);
        label12.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label13.setBounds(220, -250, 900, 600);
        label13.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label14.setBounds(50, 60, 1200, 100);
        label14.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label15.setBounds(0, 60, 1280, 100);
        label15.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label16.setBounds(60, 60, 1280, 100);
        label16.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label17.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label18.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label19.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label20.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
        label22.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label23.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label28.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label27.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label29.setBounds(0, 400, 1280, 180);
        label29.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label30.setBounds(130, 85, 1280, 100);
        label30.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 15));
        label31.setBounds(544, 125, 300, 100);
        label31.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 18));
        label27.setBounds(200, 160, 180, 33);
        label28.setBounds(915, 160, 180, 33);
    }

    /**
     * W metodzie initComboBoxes inicjowane sa przyciski typu JComcboBox, a dokladniej ich wielkosc i rozmieszczenie na panelach
     */
    static void initComboBoxes() {
        comboBox.setBounds(150, 300, 180, 33);
        comboBox2.setBounds(535, 300, 180, 33);
        comboBox3.setBounds(920, 300, 180, 33);
        comboBox6.setBounds(200, 200, 180, 33);
        comboBox7.setBounds(915, 200, 180, 33);
        comboBox8.setBounds(500, 200, 270, 40);
    }

    /**
     * W metodzie initTextAreas inicjowane sa pola typu jTextArea, ktore beda przechowywac bardzo dlugie wiadomosci tekstowe. Ustalany jest tutaj rozmiar czcionki, kolor tla czy tez brak mozliwosci edytowania wiadomosci wygenerowanej dla uzytkownika przez aplikacje
     * Dodatkowo dla jednego pola jTextArea mamy dodany jScrollPane, aby mozna bylo przewijac cala zawartosc pola jTextArea
     */
    static void initTextAreas() {
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

    /**
     * W metodzie initLayouts inicjujemy rodzaj layoutu dla kazdego panelu. Wszedzie oprocz panelu czwartego ustawiamy layout na null czyli panel bez layoutu. W tym jedynym przypadky bylo konieczne ustawienie layoutu z powodu uzycia jScrollPane
     */
    static void initLayouts() {
        myJPanel.setLayout(null);
        myJPanel2.setLayout(null);
        myJPanel3.setLayout(null);
        myJPanel4.setLayout(new GridLayout(6, 3, 0, 0));
        myJPanel5.setLayout(null);
        myJPanel6.setLayout(null);
    }

    /**
     * W metodzie panelService mamy obsluge panelow dostepnych w aplikacji. Dla macierzystego panelu dodane sa inne panele, ktore maja swoj numer, aby rozroznic przelaczanie miedzy innymi oknami
     */
    static void panelService() {
        panel.add(myJPanel);
        panel.add(myJPanel2);
        panel.add(myJPanel, "1");
        panel.add(myJPanel2, "2");
        panel.add(myJPanel3, "3");
        panel.add(myJPanel4, "4");
        panel.add(myJPanel5, "5");
        panel.add(myJPanel6, "6");
        cardLayout.show(panel, "1");
    }

    /**
     * W metodzie addElementsToPanels do kazdego z paneli dodawane sa labele, buttony oraz inne niezbedne obiekty, ktore sa potrzebne do obslugi aplikacji przez uzytkownika
     */
    static void addElementsToPanels() {
        myJPanel.add(button);
        myJPanel.add(button1);
        myJPanel2.add(button2);
        myJPanel3.add(button3);
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
        myJPanel5.add(label30);
        myJPanel5.add(button15);
        myJPanel6.add(comboBox8);
        myJPanel6.add(label31);
        myJPanel6.add(button16);
        myJPanel6.add(button17);
        myJPanel6.add(jTextArea2);
    }

    /**
     * W metodzie audio tworzymy dwa obiekty typu File, ktore przechowuja sciezke do plikow audio formatu wav
     * Nastepnie kazdy z tych plikow dodajemy do mozliwosci odtworzenia w aplikacji
     * Nastepnie obydwa pliki dodajemy do siebie, aby po jednym pliku audio zaczal sie kolejny
     * Ustalmy glosnosc odtwarzania plikow audio oraz zapetlamy ich odtwarzanie
     *
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     */
    static void audio() throws UnsupportedAudioFileException {
        File soundFile = new File("src/main/resources/songs/Jason Derulo - Lifestyle (feat. Adam Levine) [Official Dance Video].wav");
        File soundFile2 = new File("src/main/resources/songs/Jason-Derulo-Take-You-Dancing-_Official-Dance-Video_.wav");

        try (var audioIn = AudioSystem.getAudioInputStream(soundFile);
             var audioIn2 = AudioSystem.getAudioInputStream(soundFile2);
             var appendedFiles = new AudioInputStream(new SequenceInputStream(audioIn2, audioIn), audioIn2.getFormat(), audioIn2.getFrameLength() + audioIn.getFrameLength())) {
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
}