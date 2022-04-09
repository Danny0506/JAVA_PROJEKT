package pl.project.java.gui;

import pl.project.java.entities.Bus;
import pl.project.java.entities.BusStop;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.*;

import static pl.project.java.gui.CreatorObjectsToDatabase.createNewBus;
import static pl.project.java.gui.CreatorObjectsToDatabase.createNewBusStop;
import static pl.project.java.gui.GuiAppearanceManager.*;

/**
 * @author Daniel Palak
 * Klasa Gui dziedziczy po klasie JFrame i implementuje interfejs ActionListener
 * Dla obiektu frame tworzymy tytul na pasku aplikacji okienkowej jako "System Obsługi Komunikacji Miejskiej"
 * Kolejnymi polami sa labele, ktore maja nadany okreslony tekst, ktory przekazuje uzytkowniki konkretne informacje
 * Kolejnym rodzajem pol w klasie sa dwa pola jTextArea, ktore maja za zadanie byc miejscem do wyswietlania informacji, ktore aplikacja zwroci dla uzytkownika
 * Kolejnym rodzajem pola w klasie jest pole jScrollPane, ktory umozliwia przewijanie dlugiego tekstu w jTextArea
 * Nastepnie mamy pola w klasie, ktore sa przyciskami obslugujacymi rozne zdarzenia w programie. Na poczatku zostaly zadeklarowane jedynie teksty, ktore sa wyswietlane na przyciskach
 * Nastepnie mamy trzy tablice, ktore przechowuja numery linii autobusowych wystepujacych w aplikacji oraz liczbe minut i godzin wedlug zegara systemowego
 * Nastepnie mamy zadeklarowane pola obiektow JComboBox, ktore pelnia role wyswietlania dostepnych opcji dla uzytkownika np. dostepnych przystankow, kierunkow jazdy autobusow
 * Kolejnym polem jest pole panelu czyli glownego okna aplikacji
 * Nastepnie mamy pola MyJPanelow czyli panelow, ktore sa kolejnymi oknami w aplikacji
 * Przedostatnim polem w klasie sa obiekty typu Bus przedstawiajace pojedynczy autobus
 * Ostatnim polem w klasie sa obiekty typu BusStop przedstawiajace pojedynczy przystanek autobusowy
 */
public class Gui extends JFrame implements ActionListener {
    private final JFrame frame = new JFrame("System Obslugi Komunikacji Miejskiej");
    private static final Integer[] numberOfBus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final String[] minutes = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
    private static final String[] hours = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    protected static final JComboBox<Integer> comboBox = new JComboBox<>(numberOfBus);
    protected static final JComboBox<String> comboBox2 = new JComboBox<>();
    protected static final JComboBox<String> comboBox3 = new JComboBox<>();
    protected static final JComboBox<Integer> comboBox4 = new JComboBox<>(numberOfBus);
    protected static final JComboBox<String> comboBox5 = new JComboBox<>();
    protected static final JComboBox<String> comboBox6 = new JComboBox<>(hours);
    protected static final JComboBox<String> comboBox7 = new JComboBox<>(minutes);
    protected static final JComboBox<String> comboBox8 = new JComboBox<>();
    protected static final JButton button = new JButton("JESTEM KIEROWCĄ");
    protected static final JButton button1 = new JButton("JESTEM PASAZEREM");
    protected static final JButton button2 = new JButton("COFNIJ SIE DO MENU GLOWNEGO");
    protected static final JButton button3 = new JButton("COFNIJ SIE DO MENU GLOWNEGO");
    protected static final JButton button4 = new JButton("SPRAWDZ");
    protected static final JButton button5 = new JButton("COFNIJ SIE DO MENU GLOWNEGO");
    protected static final JButton button6 = new JButton("COFNIJ SIE DO MENU GLOWNEGO");
    protected static final JButton button7 = new JButton("COFNIJ SIE DO MENU GLOWNEGO");
    protected static final JButton button8 = new JButton("WYSZUKAJ POLACZENIA PO NUMERZE LINII");
    protected static final JButton button9 = new JButton("WYSZUKAJ POLACZENIA PO GODZINIE");
    protected static final JButton button10 = new JButton("WYSZUKAJ POLACZENIA PO KONKRETNYM PRZYSTANKU");
    protected static final JButton button11 = new JButton("COFNIJ SIE DO MENU KRYTERIOW SZUKANIA AUTOBUSU");
    protected static final JButton button12 = new JButton("COFNIJ SIE DO MENU KRYTERIOW SZUKANIA AUTOBUSU");
    protected static final JButton button13 = new JButton("COFNIJ SIE DO MENU KRYTERIOW SZUKANIA AUTOBUSU");
    protected static final JButton button14 = new JButton("SPRAWDZ");
    protected static final JButton button15 = new JButton("SPRAWDZ");
    protected static final JButton button16 = new JButton("SPRAWDZ");
    protected static final JButton button17 = new JButton("POKAZ DOSTEPNE PRZYSTANKI");
    protected static final JTextArea jTextArea = new JTextArea();
    protected static final JTextArea jTextArea2 = new JTextArea();
    protected static final JPanel panel = new JPanel();
    protected static final CardLayout cardLayout = new CardLayout();
    protected static final MyJPanel myJPanel2 = new MyJPanel();
    protected static final MyJPanel myJPanel5 = new MyJPanel();
    protected static final JLabel label9 = new JLabel();
    protected static final JLabel label29 = new JLabel();
    protected static Bus bus, bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9;
    protected static BusStop busStop1, busStop2, busStop3, busStop4, busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14, busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21, busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64, busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop132, busStop128, busStop129, busStop130, busStop131, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140;

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
    public Gui() throws UnsupportedAudioFileException {
        frame.setIconImage(new ImageIcon("src/main/resources/pictures/bus.jpg").getImage());
        panel.setLayout(cardLayout);
        frame.setResizable(false);
        frame.setBounds(0, 0, 1280, 720);
        createNewBus();
        createNewBusStop();
        initButtons();
        initLabels();
        initComboBoxes();
        initTextAreas();
        initLayouts();
        panelService();
        addElementsToPanels();
        actionListener();
        audio();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    /**
     * Metoda action zawiera w sobie obslugi zdarzen dla wszystkich przyciskow dostepnych w aplikacji oraz przyciskow typow JComboBox
     * Dla zwyklych buttonow wywolano zdarzenia polegajace na zmianie wyswietlanego panelu w aktualnym momencie oraz wybraniu opcji z menu czy podmenu
     * Dla przyciskow JComboBox wywolano zdarzenia, ktore polegaja na wybarniu jednej z dostepnych opcji
     */
    void actionListener() {
        button.addActionListener(e -> cardLayout.show(panel, "2"));
        button1.addActionListener(e -> cardLayout.show(panel, "3"));
        button2.addActionListener(e -> cardLayout.show(panel, "1"));
        button3.addActionListener(e -> cardLayout.show(panel, "1"));
        button4.addActionListener(this);
        button8.addActionListener(e -> cardLayout.show(panel, "4"));
        button9.addActionListener(e -> cardLayout.show(panel, "5"));
        button10.addActionListener(e -> cardLayout.show(panel, "6"));
        button5.addActionListener(e -> cardLayout.show(panel, "1"));
        button6.addActionListener(e -> cardLayout.show(panel, "1"));
        button7.addActionListener(e -> cardLayout.show(panel, "1"));
        button11.addActionListener(e -> cardLayout.show(panel, "3"));
        button12.addActionListener(e -> cardLayout.show(panel, "3"));
        button13.addActionListener(e -> cardLayout.show(panel, "3"));
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        comboBox.addActionListener(this);
        comboBox2.addActionListener(this);
        comboBox3.addActionListener(this);
        comboBox4.addActionListener(this);
        comboBox5.addActionListener(this);
        comboBox6.addActionListener(this);
        comboBox7.addActionListener(this);
        comboBox8.addActionListener(this);
    }

    /**
     * W metodzie actionPerformed sa obslugiwane wszystkie zdarzenia w aplikacji dla konkretnych przyciskow
     * Adnotacja @Override oznacza nadpisanie metody
     *
     * @param e oznacza obiekt ActionEvent, ktorego pozniej pobieramy zrodlo
     *          Nastepnie tworzymy obiekt localtime, aby pobrac obecna godzine z systemu
     *          Nastepnie dla kazdego przycisku typu JComboBox pobieramy obecnie wybrany indeks
     *          Nastepnie w tablicach przechowujemy nazwy przystankow autobusowych, kierunkow w jakie autobus sie porusza czy tez po prostu obiekty typu BusStop
     *          Kolejnym elementem w tej metodzie jest dodanie do JComboBoxow odpowiednich kierunkow podrozy autobusow, gdy zrodlem wcisniecia przyciskow bedzie przycisk comboBox
     *          To samo dzieje sie jezeli zrodlem wcisniecia przycisku jest comboBox4, lecz wtedy kierunki autobusowe dodawane sa do comboBox5 a nie comboBox2 jak wyzej
     *          Nastepnie gdy zrodlem bedzie comboBox5 to dla kazdego przypadku dodawane sa odpowiednie przystanki dla comboBox3
     *          Nastepnie jesli zrodlem bedzie button4 to aplikacja obliczy jakie opoznienie ma kierowca autobusu dla podanego przystanka dla danej linii i kierunku jazdy, ktory wybierze uzytkownik
     *          Aplikacja za pomoca klasy LocalTime i metod dostepnych dla tej klasy ma mozliwosc odnalezienia przystanka, godziny i innych informacji, ktore sa pozniej wyswietlane dla uzytkownika
     *          Jezeli zrodlem bedzie button14 to aplikacja poprosi o podanie numeru linii i kierunku jazdy autobusu,a nastepnie wyswietli informacje o wszystkich odjazdach z przystankow wystepujacych na danej linii
     *          Natomiast gdy zrodlem bedzie button15 to aplikacja poprosi o podanie liczby minut i sekund po czym wyswietli informacje na temat najblizszych pieciu odjazdow po godzinie podanej przez uzytkownika
     *          Natomiast gdy zrodlem bedzie button17 to aplikacja poprosi o wybor przystanka z listy i wyswietli wszystkie odjazdy z niego niezaleznie od numerow linii czy kierunkow jazdy
     */
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
        String indexSixS = (String) comboBox6.getSelectedItem();
        String indexSevenS = (String) comboBox7.getSelectedItem();
        int indexSix = comboBox6.getSelectedIndex();
        int indexSeven = comboBox7.getSelectedIndex();
        int indexEight = comboBox8.getSelectedIndex();
        String[] nameBusStops = {busStop15.getBusStopName(), busStop16.getBusStopName(), busStop17.getBusStopName(), busStop18.getBusStopName(), busStop19.getBusStopName(), busStop20.getBusStopName(), busStop21.getBusStopName(), busStop22.getBusStopName(), busStop23.getBusStopName(), busStop24.getBusStopName(), busStop25.getBusStopName(), busStop26.getBusStopName(), busStop27.getBusStopName(), busStop28.getBusStopName(), busStop29.getBusStopName(), busStop30.getBusStopName(), busStop31.getBusStopName(), busStop32.getBusStopName(), busStop33.getBusStopName(), busStop34.getBusStopName(), busStop35.getBusStopName(), busStop36.getBusStopName(), busStop37.getBusStopName(), busStop38.getBusStopName(), busStop39.getBusStopName(), busStop40.getBusStopName(), busStop41.getBusStopName(), busStop42.getBusStopName(), busStop43.getBusStopName(), busStop44.getBusStopName(), busStop45.getBusStopName(), busStop46.getBusStopName(), busStop47.getBusStopName(), busStop48.getBusStopName(), busStop49.getBusStopName(), busStop50.getBusStopName(), busStop51.getBusStopName(), busStop52.getBusStopName(), busStop53.getBusStopName(), busStop54.getBusStopName(), busStop55.getBusStopName(), busStop56.getBusStopName(), busStop57.getBusStopName(), busStop58.getBusStopName(), busStop59.getBusStopName(), busStop60.getBusStopName(), busStop61.getBusStopName(), busStop62.getBusStopName(), busStop63.getBusStopName(), busStop64.getBusStopName(), busStop65.getBusStopName(), busStop66.getBusStopName(), busStop67.getBusStopName(), busStop68.getBusStopName(), busStop69.getBusStopName(), busStop70.getBusStopName(), busStop1.getBusStopName(), busStop2.getBusStopName(), busStop3.getBusStopName(), busStop4.getBusStopName(), busStop5.getBusStopName(), busStop6.getBusStopName(), busStop7.getBusStopName(), busStop8.getBusStopName(), busStop9.getBusStopName(), busStop10.getBusStopName(), busStop11.getBusStopName(), busStop12.getBusStopName(), busStop13.getBusStopName(), busStop14.getBusStopName(), busStop71.getBusStopName(), busStop72.getBusStopName(), busStop73.getBusStopName(), busStop74.getBusStopName(), busStop75.getBusStopName(), busStop76.getBusStopName(), busStop77.getBusStopName(), busStop78.getBusStopName(), busStop79.getBusStopName(), busStop80.getBusStopName(), busStop81.getBusStopName(), busStop82.getBusStopName(), busStop83.getBusStopName(), busStop84.getBusStopName(), busStop85.getBusStopName(), busStop86.getBusStopName(), busStop87.getBusStopName(), busStop88.getBusStopName(), busStop89.getBusStopName(), busStop90.getBusStopName(), busStop91.getBusStopName(), busStop92.getBusStopName(), busStop93.getBusStopName(), busStop94.getBusStopName(), busStop95.getBusStopName(), busStop96.getBusStopName(), busStop97.getBusStopName(), busStop98.getBusStopName(), busStop99.getBusStopName(), busStop100.getBusStopName(), busStop101.getBusStopName(), busStop102.getBusStopName(), busStop103.getBusStopName(), busStop104.getBusStopName(), busStop105.getBusStopName(), busStop106.getBusStopName(), busStop107.getBusStopName(), busStop108.getBusStopName(), busStop109.getBusStopName(), busStop110.getBusStopName(), busStop111.getBusStopName(), busStop112.getBusStopName(), busStop113.getBusStopName(), busStop114.getBusStopName(), busStop115.getBusStopName(), busStop116.getBusStopName(), busStop117.getBusStopName(), busStop118.getBusStopName(), busStop119.getBusStopName(), busStop120.getBusStopName(), busStop121.getBusStopName(), busStop122.getBusStopName(), busStop123.getBusStopName(), busStop124.getBusStopName(), busStop125.getBusStopName(), busStop126.getBusStopName(), busStop127.getBusStopName(), busStop128.getBusStopName(), busStop129.getBusStopName(), busStop130.getBusStopName(), busStop131.getBusStopName(), busStop132.getBusStopName(), busStop133.getBusStopName(), busStop134.getBusStopName(), busStop135.getBusStopName(), busStop136.getBusStopName(), busStop137.getBusStopName(), busStop138.getBusStopName(), busStop139.getBusStopName(), busStop140.getBusStopName()}, nameDirections = {bus.getDirectionOne(), bus.getDirectionTwo(), bus1.getDirectionOne(), bus1.getDirectionTwo(), bus2.getDirectionOne(), bus2.getDirectionTwo(), bus3.getDirectionOne(), bus3.getDirectionTwo(), bus4.getDirectionOne(), bus4.getDirectionTwo(), bus5.getDirectionOne(), bus5.getDirectionTwo(), bus6.getDirectionOne(), bus6.getDirectionTwo(), bus7.getDirectionOne(), bus7.getDirectionTwo(), bus8.getDirectionOne(), bus8.getDirectionTwo(), bus9.getDirectionOne(), bus9.getDirectionTwo()};
        BusStop[] nameStops = {busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21, busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64, busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop1, busStop2, busStop3, busStop4, busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14, busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop128, busStop129, busStop130, busStop131, busStop132, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140};
        if (source == comboBox) {
            addItemsForComboBox2(index, bus, bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9);
        } else if (source == comboBox4) {
            addItemsForComboBox5(indexFour, bus, bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9);
        } else if (source == comboBox2) {
            addItemsForComboBox3(index, indexTwo);
        } else if (source == button4) {
            if (index == -1 || indexThree == -1 || indexTwo == -1) {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK I PRZYSTANEK, ABY APLIKACJA PODALA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            } else {
                myJPanel2.add(label9);
                label9.setBackground(Color.white);
                label9.setOpaque(true);
                int busNumber = index + 1;
                for (int k = 0; k < 10; k++) {
                    if (k == index) {
                        for (int j = 0; j < 2; j++) {
                            if (j == indexTwo) {
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
                                    if (i == indexThree) {
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
                                        Boolean[] array = {result, resultTwo, resultThree, resultFour, resultFive};
                                        LocalTime[] array2 = {timeOne, timeTwo, timeThree, timeFour, timeFive};
                                        for (int p = 0; p < array.length; p++) {
                                            if (array[p] || array.length - 1 == p) {
                                                tmp++;
                                                if (array.length - 1 == p) {
                                                    tmp = tmp - 2;
                                                    int flag = 0;
                                                    int minutesTwo = array2[tmp].getMinute();
                                                    int hoursTwo = array2[tmp].getHour();
                                                    int differenceHours = hours - hoursTwo;
                                                    int differenceMinutes = minutes - minutesTwo;
                                                    if (hoursTwo > hours) {
                                                        differenceHours = 0;
                                                    }
                                                    if (minutesTwo > minutes) {
                                                        differenceMinutes = (60 - minutesTwo) + minutes;
                                                        flag++;
                                                    }
                                                    if (flag == 1) {
                                                        differenceHours = differenceHours - 1;
                                                    }
                                                    if (minutes < 10) {
                                                        label9.setText("<html> Wybrales Kierowco linie numer " + busNumber + ", ktora poruszasz się w kierunku " + nameDirections[pom2] + " i chcesz zapytac jakie opoznienie masz do przystanku <br> o nazwie " + nameBusStops[pom] +
                                                                ". Obecna godzina to: " + hours + ":0" + minutes + ". Natomiast ostatni odjazd z tego przystanku przed obecną godziną mial nastapic<br> o godzinie: " + hoursTwo + ":" + minutesTwo + ". Opoznienie wynosi: " +
                                                                differenceHours + " godzin i " + differenceMinutes + " minut.</html>");
                                                    } else {
                                                        label9.setText("<html> Wybrales Kierowco linie numer " + busNumber + ", ktora poruszasz się w kierunku " + nameDirections[pom2] + " i chcesz zapytac jakie opoznienie masz do przystanku <br> o nazwie " + nameBusStops[pom] +
                                                                ". Obecna godzina to: " + hours + ":" + minutes + ". Natomiast ostatni odjazd z tego przystanku przed obecną godziną mial nastapic<br> o godzinie: " + hoursTwo + ":" + minutesTwo + ". Opoznienie wynosi: " +
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
        } else if (source == button14) {
            if (indexFour == -1 || indexFive == -1) {
                JOptionPane.showMessageDialog(frame, "WYBIERZ KIERUNEK, ABY APLIKACJA PODALA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            } else {
                jTextArea.setSize(1280, 100);
                jTextArea.setLocation(0, 400);
                int busNumber = indexFour + 1;
                for (int k = 0; k < 10; k++) {
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
                                    if (i == 0)
                                        jTextArea.setText(null);
                                    LocalTime timeOne = LocalTime.parse(nameStops[pom].getDepartureOneTime());
                                    LocalTime timeTwo = LocalTime.parse(nameStops[pom].getDepartureTwoTime());
                                    LocalTime timeThree = LocalTime.parse(nameStops[pom].getDepartureThreeTime());
                                    LocalTime timeFour = LocalTime.parse(nameStops[pom].getDepartureFourTime());
                                    LocalTime timeFive = LocalTime.parse(nameStops[pom].getDepartureFiveTime());
                                    LocalTime[] array2 = {timeOne, timeTwo, timeThree, timeFour, timeFive};
                                    int minutesTwo = array2[0].getMinute(), minutesThree = array2[1].getMinute(), minutesFour = array2[2].getMinute(), minutesFive = array2[3].getMinute(), minutesSix = array2[4].getMinute();
                                    int hoursTwo = array2[0].getHour(), hoursThree = array2[1].getHour(), hoursFour = array2[2].getHour(), hoursFive = array2[3].getHour(), hoursSix = array2[4].getHour();
                                    jTextArea.append("\nLINIA NUMER: " + busNumber + "\nKIERUNEK: " + nameDirections[pom2] + "\nPRZYSTANEK: " + nameBusStops[pom] +
                                            "\nOdjazd numer 1 nastepuje o godzinie: " + hoursTwo + ":" + minutesTwo +
                                            "\nOdjazd numer 2 nastepuje o godzinie: " + hoursThree + ":" + minutesThree +
                                            "\nOdjazd numer 3 nastepuje o godzinie: " + hoursFour + ":" + minutesFour +
                                            "\nOdjazd numer 4 nastepuje o godzinie: " + hoursFive + ":" + minutesFive +
                                            "\nOdjazd numer 5 nastepuje o godzinie: " + hoursSix + ":" + minutesSix + "\n");
                                }
                            }
                        }
                    }
                }
            }
        } else if (source == button15) {
            if (indexSix == -1 || indexSeven == -1) {
                JOptionPane.showMessageDialog(frame, "WYBIERZ GODZINE I LICZBE MINUT, ABY APLIKACJA PODALA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            } else {
                ArrayList<LocalTime> times = new ArrayList<>();
                ArrayList<String> directionsNames = new ArrayList<>();
                ArrayList<String> busStopsNames = new ArrayList<>();
                ArrayList<Integer> busNames = new ArrayList<>();
                myJPanel5.add(label29);
                label29.setBackground(Color.white);
                label29.setOpaque(true);
                String userTime = indexSixS + ":" + indexSevenS;
                for (int k = 0; k < 10; k++) {
                    for (int j = 0; j < 2; j++) {
                        for (int i = 0; i < 7; i++) {
                            int pom = i;
                            if (k == 0 && j == 1) {
                                pom = i + 7;
                            }
                            if (k > 0) {
                                for (int counter = 1; counter < 10; counter++) {
                                    int busNumberTwo = k + 1;
                                    if (busNumberTwo == counter + 1 && j == 0) {
                                        pom = 7 * ((2 * busNumberTwo) - 2) + i;
                                    } else if (busNumberTwo == counter + 1) {
                                        pom = 7 * ((2 * busNumberTwo) - 1) + i;
                                    }
                                }
                            }
                            LocalTime timeOne = LocalTime.parse(nameStops[pom].getDepartureOneTime());
                            LocalTime timeTwo = LocalTime.parse(nameStops[pom].getDepartureTwoTime());
                            LocalTime timeThree = LocalTime.parse(nameStops[pom].getDepartureThreeTime());
                            LocalTime timeFour = LocalTime.parse(nameStops[pom].getDepartureFourTime());
                            LocalTime timeFive = LocalTime.parse(nameStops[pom].getDepartureFiveTime());
                            boolean result = timeOne.isBefore(LocalTime.parse(userTime));
                            boolean resultTwo = timeTwo.isBefore(LocalTime.parse(userTime));
                            boolean resultThree = timeThree.isBefore(LocalTime.parse(userTime));
                            boolean resultFour = timeFour.isBefore(LocalTime.parse(userTime));
                            boolean resultFive = timeFive.isBefore(LocalTime.parse(userTime));
                            Boolean[] array = {result, resultTwo, resultThree, resultFour, resultFive};
                            LocalTime[] array2 = {timeOne, timeTwo, timeThree, timeFour, timeFive};
                            for (int m = 0; m < 5; m++) {
                                if (!array[m]) {
                                    times.add(array2[m]);
                                    break;
                                }
                            }
                        }
                    }
                }
                int n = 0;
                Collections.sort(times);
                LocalTime[] lastTimes = new LocalTime[5];
                for (LocalTime counter : times) {
                    if (n == 5)
                        break;
                    lastTimes[n] = counter;
                    n++;
                }
                int flag = -1, flagTwo = -1, flagThree = -1, flagFour = -1;
                for (int a = 0; a < 5; a++) {
                    for (int k = 0; k < 10; k++) {
                        for (int j = 0; j < 2; j++) {
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
                                LocalTime timeOne = LocalTime.parse(nameStops[pom].getDepartureOneTime());
                                LocalTime timeTwo = LocalTime.parse(nameStops[pom].getDepartureTwoTime());
                                LocalTime timeThree = LocalTime.parse(nameStops[pom].getDepartureThreeTime());
                                LocalTime timeFour = LocalTime.parse(nameStops[pom].getDepartureFourTime());
                                LocalTime timeFive = LocalTime.parse(nameStops[pom].getDepartureFiveTime());
                                if ((timeOne.equals(lastTimes[a]) || timeTwo.equals(lastTimes[a]) || timeThree.equals(lastTimes[a]) || timeFour.equals(lastTimes[a]) || timeFive.equals(lastTimes[a])) && ((flag != i && flagTwo != k && a % 2 != 0) || (flagThree != i && flagFour != k && a % 2 != 1))) {
                                    directionsNames.add(nameDirections[pom2]);
                                    busStopsNames.add(nameBusStops[pom]);
                                    busNames.add(k + 1);
                                    if (a % 2 == 0) {
                                        flag = i;
                                        flagTwo = k;
                                    }
                                    if (a % 2 == 1) {
                                        flagThree = i;
                                        flagFour = k;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                if (busStopsNames.size() == 4) {
                    label29.setText("<html>ODJAZD NR 1 LINIA NR: " + busNames.get(0) + " ------ KIERUNEK: " + directionsNames.get(0) + " ------ PRZYSTANEK: " + busStopsNames.get(0) + " ------ GODZINA ODJAZDU: " + times.get(0) + "<br>"
                            + "ODJAZD NR 2 LINIA NR: " + busNames.get(1) + " ------ KIERUNEK: " + directionsNames.get(1) + " ------ PRZYSTANEK: " + busStopsNames.get(1) + " ------ GODZINA ODJAZDU: " + times.get(1) + "<br>"
                            + "ODJAZD NR 3 LINIA NR: " + busNames.get(2) + " ------ KIERUNEK: " + directionsNames.get(2) + " ------ PRZYSTANEK: " + busStopsNames.get(2) + " ------ GODZINA ODJAZDU: " + times.get(2) + "<br>"
                            + "ODJAZD NR 4 LINIA NR: " + busNames.get(3) + " ------ KIERUNEK: " + directionsNames.get(3) + " ------ PRZYSTANEK: " + busStopsNames.get(3) + " ------ GODZINA ODJAZDU: " + times.get(3) + "<br></html>");
                }
                if (busStopsNames.size() == 3) {
                    label29.setText("<html>ODJAZD NR 1 LINIA NR: " + busNames.get(0) + " ------ KIERUNEK: " + directionsNames.get(0) + " ------ PRZYSTANEK: " + busStopsNames.get(0) + " ------ GODZINA ODJAZDU: " + times.get(0) + "<br>"
                            + "ODJAZD NR 2 LINIA NR: " + busNames.get(1) + " ------ KIERUNEK: " + directionsNames.get(1) + " ------ PRZYSTANEK: " + busStopsNames.get(1) + " ------ GODZINA ODJAZDU: " + times.get(1) + "<br>"
                            + "ODJAZD NR 3 LINIA NR: " + busNames.get(2) + " ------ KIERUNEK: " + directionsNames.get(2) + " ------ PRZYSTANEK: " + busStopsNames.get(2) + " ------ GODZINA ODJAZDU: " + times.get(2) + "<br></html>");
                }
                if (busStopsNames.size() == 2) {
                    label29.setText("<html>ODJAZD NR 1 LINIA NR: " + busNames.get(0) + " ------ KIERUNEK: " + directionsNames.get(0) + " ------ PRZYSTANEK: " + busStopsNames.get(0) + " ------ GODZINA ODJAZDU: " + times.get(0) + "<br>"
                            + "ODJAZD NR 2 LINIA NR: " + busNames.get(1) + " ------ KIERUNEK: " + directionsNames.get(1) + " ------ PRZYSTANEK: " + busStopsNames.get(1) + " ------ GODZINA ODJAZDU: " + times.get(1) + "<br></html>");
                }
                if (busStopsNames.size() == 1) {
                    label29.setText("<html>ODJAZD NR 1 LINIA NR: " + busNames.get(0) + " ------ KIERUNEK: " + directionsNames.get(0) + " ------ PRZYSTANEK: " + busStopsNames.get(0) + " ------ GODZINA ODJAZDU: " + times.get(0) + "<br></html>");
                }
                if (busStopsNames.size() > 4) {
                    label29.setText("<html>ODJAZD NR 1 LINIA NR: " + busNames.get(0) + " ------ KIERUNEK: " + directionsNames.get(0) + " ------ PRZYSTANEK: " + busStopsNames.get(0) + " ------ GODZINA ODJAZDU: " + times.get(0) + "<br>"
                            + "ODJAZD NR 2 LINIA NR: " + busNames.get(1) + " ------ KIERUNEK: " + directionsNames.get(1) + " ------ PRZYSTANEK: " + busStopsNames.get(1) + " ------ GODZINA ODJAZDU: " + times.get(1) + "<br>"
                            + "ODJAZD NR 3 LINIA NR: " + busNames.get(2) + " ------ KIERUNEK: " + directionsNames.get(2) + " ------ PRZYSTANEK: " + busStopsNames.get(2) + " ------ GODZINA ODJAZDU: " + times.get(2) + "<br>"
                            + "ODJAZD NR 4 LINIA NR: " + busNames.get(3) + " ------ KIERUNEK: " + directionsNames.get(3) + " ------ PRZYSTANEK: " + busStopsNames.get(3) + " ------ GODZINA ODJAZDU: " + times.get(3) + "<br>"
                            + "ODJAZD NR 5 LINIA NR: " + busNames.get(4) + " ------ KIERUNEK: " + directionsNames.get(4) + " ------ PRZYSTANEK: " + busStopsNames.get(4) + " ------ GODZINA ODJAZDU: " + times.get(4) + "</html>");
                }
            }
        } else if (source == button17) {
            comboBox8.removeAllItems();
            Set<String> original = new TreeSet<>(Arrays.asList(nameBusStops));
            for (String name : original) {
                comboBox8.addItem(name);
            }
        } else if (source == button16) {
            if (indexEight == -1) {
                JOptionPane.showMessageDialog(frame, "WYBIERZ PRZYSTANEK, ABY APLIKACJA PODALA INFORMACJE", "Nie Wybrano Wszystkich Wymaganych Opcji !!!", JOptionPane.WARNING_MESSAGE);
            } else {
                jTextArea2.setSize(1280, 250);
                jTextArea2.setLocation(0, 300);
                jTextArea2.setText(null);
                for (int k = 0; k < 10; k++) {
                    int busLine = k + 1;
                    for (int j = 0; j < 2; j++) {
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
                            if (k == 0 && i == 0 && j == 0) {
                                jTextArea2.setText("ODJAZDY Z PRZYSTANKU: " + comboBox8.getItemAt(comboBox8.getSelectedIndex()) + "\n");
                            }
                            if (nameBusStops[pom].equals(comboBox8.getItemAt(comboBox8.getSelectedIndex()))) {
                                jTextArea2.append("\nLINIA NUMER: " + busLine + "\tKIERUNEK: " + nameDirections[pom2] + "\tODJAZDY: " + nameStops[pom].getDepartureOneTime() + ",  " + nameStops[pom].getDepartureTwoTime() + ",  " +
                                        nameStops[pom].getDepartureThreeTime() + ",  " + nameStops[pom].getDepartureFourTime() + ",  " + nameStops[pom].getDepartureFiveTime());
                            }
                        }
                    }
                }
            }
        }
    }

    private static void addItemsForComboBox2(int index, Bus bus, Bus bus1, Bus bus2, Bus bus3, Bus bus4, Bus bus5, Bus bus6, Bus bus7, Bus bus8, Bus bus9)
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

    private static void addItemsForComboBox5(int index, Bus bus, Bus bus1, Bus bus2, Bus bus3, Bus bus4, Bus bus5, Bus bus6, Bus bus7, Bus bus8, Bus bus9)
    {
        if (index == 0) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus.getDirectionOne());
            comboBox5.addItem(bus.getDirectionTwo());
        } else if (index == 1) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus1.getDirectionOne());
            comboBox5.addItem(bus1.getDirectionTwo());
        } else if (index == 2) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus2.getDirectionOne());
            comboBox5.addItem(bus2.getDirectionTwo());
        } else if (index == 3) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus3.getDirectionOne());
            comboBox5.addItem(bus3.getDirectionTwo());
        } else if (index == 4) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus4.getDirectionOne());
            comboBox5.addItem(bus4.getDirectionTwo());
        } else if (index == 5) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus5.getDirectionOne());
            comboBox5.addItem(bus5.getDirectionTwo());
        } else if (index == 6) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus6.getDirectionOne());
            comboBox5.addItem(bus6.getDirectionTwo());
        } else if (index == 7) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus7.getDirectionOne());
            comboBox5.addItem(bus7.getDirectionTwo());
        } else if (index == 8) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus8.getDirectionOne());
            comboBox5.addItem(bus8.getDirectionTwo());
        } else if (index == 9) {
            comboBox5.removeAllItems();
            comboBox5.addItem(bus9.getDirectionOne());
            comboBox5.addItem(bus9.getDirectionTwo());
        }
    }

    private static void addItemsForComboBox3(int index, int indexTwo)
    {
        String[] busStopsOne = {busStop15.getBusStopName(), busStop16.getBusStopName(), busStop17.getBusStopName(), busStop18.getBusStopName(), busStop19.getBusStopName(), busStop20.getBusStopName(), busStop21.getBusStopName()}, busStopsTwo = {busStop22.getBusStopName(), busStop23.getBusStopName(), busStop24.getBusStopName(), busStop25.getBusStopName(), busStop26.getBusStopName(), busStop27.getBusStopName(), busStop28.getBusStopName()}, busStopsThree = {busStop36.getBusStopName(), busStop37.getBusStopName(), busStop38.getBusStopName(), busStop39.getBusStopName(), busStop40.getBusStopName(), busStop41.getBusStopName(), busStop42.getBusStopName()}, busStopsFour = {busStop29.getBusStopName(), busStop30.getBusStopName(), busStop31.getBusStopName(), busStop32.getBusStopName(), busStop33.getBusStopName(), busStop34.getBusStopName(), busStop35.getBusStopName()}, busStopsFive = {busStop43.getBusStopName(), busStop44.getBusStopName(), busStop45.getBusStopName(), busStop46.getBusStopName(), busStop47.getBusStopName(), busStop48.getBusStopName(), busStop49.getBusStopName()}, busStopsSix = {busStop50.getBusStopName(), busStop51.getBusStopName(), busStop52.getBusStopName(), busStop53.getBusStopName(), busStop54.getBusStopName(), busStop55.getBusStopName(), busStop56.getBusStopName()}, busStopsSeven = {busStop57.getBusStopName(), busStop58.getBusStopName(), busStop59.getBusStopName(), busStop60.getBusStopName(), busStop61.getBusStopName(), busStop62.getBusStopName(), busStop63.getBusStopName()}, busStopsEight = {busStop64.getBusStopName(), busStop65.getBusStopName(), busStop66.getBusStopName(), busStop67.getBusStopName(), busStop68.getBusStopName(), busStop69.getBusStopName(), busStop70.getBusStopName()}, busStopsNine = {busStop8.getBusStopName(), busStop9.getBusStopName(), busStop10.getBusStopName(), busStop11.getBusStopName(), busStop12.getBusStopName(), busStop13.getBusStopName(), busStop14.getBusStopName()}, busStopsTen = {busStop1.getBusStopName(), busStop2.getBusStopName(), busStop3.getBusStopName(), busStop4.getBusStopName(), busStop5.getBusStopName(), busStop6.getBusStopName(), busStop7.getBusStopName()}, busStopsEleven = {busStop71.getBusStopName(), busStop72.getBusStopName(), busStop73.getBusStopName(), busStop74.getBusStopName(), busStop75.getBusStopName(), busStop76.getBusStopName(), busStop77.getBusStopName()}, busStopsTwelve = {busStop78.getBusStopName(), busStop79.getBusStopName(), busStop80.getBusStopName(), busStop81.getBusStopName(), busStop82.getBusStopName(), busStop83.getBusStopName(), busStop84.getBusStopName()}, busStopsThreeteen = {busStop85.getBusStopName(), busStop86.getBusStopName(), busStop87.getBusStopName(), busStop88.getBusStopName(), busStop89.getBusStopName(), busStop90.getBusStopName(), busStop91.getBusStopName()}, busStopsFourteen = {busStop92.getBusStopName(), busStop93.getBusStopName(), busStop94.getBusStopName(), busStop95.getBusStopName(), busStop96.getBusStopName(), busStop97.getBusStopName(), busStop98.getBusStopName()}, busStopsFiveteen = {busStop99.getBusStopName(), busStop100.getBusStopName(), busStop101.getBusStopName(), busStop102.getBusStopName(), busStop103.getBusStopName(), busStop104.getBusStopName(), busStop105.getBusStopName()}, busStopsSixteen = {busStop106.getBusStopName(), busStop107.getBusStopName(), busStop108.getBusStopName(), busStop109.getBusStopName(), busStop110.getBusStopName(), busStop111.getBusStopName(), busStop112.getBusStopName()}, busStopsSeventeen = {busStop113.getBusStopName(), busStop114.getBusStopName(), busStop115.getBusStopName(), busStop116.getBusStopName(), busStop117.getBusStopName(), busStop118.getBusStopName(), busStop119.getBusStopName()}, busStopsEightteen = {busStop120.getBusStopName(), busStop121.getBusStopName(), busStop122.getBusStopName(), busStop123.getBusStopName(), busStop124.getBusStopName(), busStop125.getBusStopName(), busStop126.getBusStopName()}, busStopsNineteen = {busStop127.getBusStopName(), busStop128.getBusStopName(), busStop129.getBusStopName(), busStop130.getBusStopName(), busStop131.getBusStopName(), busStop132.getBusStopName(), busStop133.getBusStopName()}, busStopsTwenty = {busStop134.getBusStopName(), busStop135.getBusStopName(), busStop136.getBusStopName(), busStop137.getBusStopName(), busStop138.getBusStopName(), busStop139.getBusStopName(), busStop140.getBusStopName()};
        if (index == 0 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsOne) {
                comboBox3.addItem(bus);
            }
        } else if (index == 0 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsTwo) {
                comboBox3.addItem(bus);
            }
        } else if (index == 1 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsThree) {
                comboBox3.addItem(bus);
            }
        } else if (index == 1 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsFour) {
                comboBox3.addItem(bus);
            }
        } else if (index == 2 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsFive) {
                comboBox3.addItem(bus);
            }
        } else if (index == 2 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsSix) {
                comboBox3.addItem(bus);
            }
        } else if (index == 3 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsSeven) {
                comboBox3.addItem(bus);
            }
        } else if (index == 3 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsEight) {
                comboBox3.addItem(bus);
            }
        } else if (index == 4 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsNine) {
                comboBox3.addItem(bus);
            }
        } else if (index == 4 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsTen) {
                comboBox3.addItem(bus);
            }
        }
        if (index == 5 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsEleven) {
                comboBox3.addItem(bus);
            }
        } else if (index == 5 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsTwelve) {
                comboBox3.addItem(bus);
            }
        } else if (index == 6 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsThreeteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 6 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsFourteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 7 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsFiveteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 7 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsSixteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 8 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsSeventeen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 8 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsEightteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 9 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (String bus : busStopsNineteen) {
                comboBox3.addItem(bus);
            }
        } else if (index == 9 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (String bus : busStopsTwenty) {
                comboBox3.addItem(bus);
            }
        }
    }
}