package pl.project.java.gui;

import pl.project.java.entities.Bus;
import pl.project.java.entities.BusStop;

import javax.sound.sampled.UnsupportedAudioFileException;

public final class CreatorObjectsToDatabase extends Gui {

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
    public CreatorObjectsToDatabase() throws UnsupportedAudioFileException {
    }

    /**
     * W metodzie createNewBusStop tworzymy 140 obiektow przystankow, ktore przechowuja dane odpowiednie dla siebie
     */
    static void createNewBusStop() {

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
        busStop14 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Kolberga", 5, "Kolberga");

        busStop15 = new BusStop("05:29", "08:55", "14:21", "18:24", "20:55", "Pietraszki", 1, "Bukowka");
        busStop16 = new BusStop("05:45", "09:11", "14:40", "18:11", "21:11", "Kolonia I", 1, "Bukowka");
        busStop17 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Fabryczna", 1, "Bukowka");
        busStop18 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Krakowska Biesak", 1, "Bukowka");
        busStop19 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Jagielońska", 1, "Bukowka");
        busStop20 = new BusStop("06:52", "09:55", "15:51", "18:58", "21:58", "Zytnia", 1, "Bukowka");
        busStop21 = new BusStop("07:11", "10:17", "16:15", "19:11", "22:22", "Bukowka", 1, "Bukowka");
        busStop22 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Bukowka", 1, "Pietraszki");
        busStop23 = new BusStop("07:51", "11:21", "16:32", "19:35", "22:40", "Zytnia", 1, "Pietraszki");
        busStop24 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Jagielońska", 1, "Pietraszki");
        busStop25 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Krakowska Biesak", 1, "Pietraszki");
        busStop26 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Fabryczna", 1, "Pietraszki");
        busStop27 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Kolonia I", 1, "Pietraszki");
        busStop28 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Pietraszki", 1, "Pietraszki");

        busStop29 = new BusStop("05:45", "08:55", "14:14", "18:17", "21:37", "Kolberga", 2, "Sukowska");
        busStop30 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Hoza", 2, "Sukowska");
        busStop31 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Jagielonska", 2, "Sukowska");
        busStop32 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Zytnia", 2, "Sukowska");
        busStop33 = new BusStop("06:32", "09:40", "15:13", "19:26", "22:25", "Sciegiennego", 2, "Sukowska");
        busStop34 = new BusStop("06:51", "10:11", "15:24", "19:33", "22:39", "Kalinowa", 2, "Sukowska");
        busStop35 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Sukowska", 2, "Sukowska");
        busStop36 = new BusStop("07:21", "10:51", "16:10", "19:55", "22:58", "Sukowska", 2, "Kolberga");
        busStop37 = new BusStop("07:39", "11:12", "16:24", "20:15", "23:15", "Kalinowa", 2, "Kolberga");
        busStop38 = new BusStop("07:55", "11:30", "16:41", "20:24", "23:26", "Sciegiennego", 2, "Kolberga");
        busStop39 = new BusStop("08:14", "12:21", "16:59", "20:49", "23:43", "Zytnia", 2, "Kolberga");
        busStop40 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Jagielońska", 2, "Kolberga");
        busStop41 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Hoza", 2, "Kolberga");
        busStop42 = new BusStop("08:35", "13:55", "18:14", "21:26", "23:59", "Kolberga", 2, "Kolberga");

        busStop43 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Kaczmarka", 3, "Borkow");
        busStop44 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Zytnia", 3, "Borkow");
        busStop45 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "IX Wiekow Kielc", 3, "Borkow");
        busStop46 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Tarnowska", 3, "Borkow");
        busStop47 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Wrzosowa", 3, "Borkow");
        busStop48 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Sukow", 3, "Borkow");
        busStop49 = new BusStop("06:26", "10:17", "15:13", "18:14", "21:11", "Borkow", 3, "Borkow");
        busStop50 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Borkow", 3, "Kaczmarka");
        busStop51 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Sukow", 3, "Kaczmarka");
        busStop52 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Wrzosowa", 3, "Kaczmarka");
        busStop53 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Tarnowska", 3, "Kaczmarka");
        busStop54 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "IX Wiekow Kielc", 3, "Kaczmarka");
        busStop55 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Zytnia", 3, "Kaczmarka");
        busStop56 = new BusStop("08:13", "13:10", "16:55", "19:42", "23:44", "Kaczmarka", 3, "Kaczmarka");

        busStop57 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "al. Na Stadion", 4, "Zagnanska Areszt");
        busStop58 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Pakosz", 4, "Zagnanska Areszt");
        busStop59 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Krakowska", 4, "Zagnanska Areszt");
        busStop60 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Seminaryjska", 4, "Zagnanska Areszt");
        busStop61 = new BusStop("04:45", "07:55", "14:58", "18:45", "21:21", "Tarnowska", 4, "Zagnanska Areszt");
        busStop62 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Jesionowa", 4, "Zagnanska Areszt");
        busStop63 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Zagnanska Areszt", 4, "Zagnanska Areszt");
        busStop64 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Zagnanska Areszt", 4, "al. Na Stadion");
        busStop65 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Jesionowa", 4, "al. Na Stadion");
        busStop66 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Tarnowska", 4, "al. Na Stadion");
        busStop67 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Seminaryjska", 4, "al. Na Stadion");
        busStop68 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Krakowska", 4, "al. Na Stadion");
        busStop69 = new BusStop("06:10", "13:13", "16:52", "20:20", "22:47", "Pakosz", 4, "al. Na Stadion");
        busStop70 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "al. Na Stadion", 4, "al. Na Stadion");

        busStop71 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Dworzec Autobusowy", 6, "Niestachów petla");
        busStop72 = new BusStop("05:18", "07:25", "13:58", "16:10", "18:40", "Czarnowska", 6, "Niestachów petla");
        busStop73 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "Sandomierska", 6, "Niestachów petla");
        busStop74 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:11", "Cedzyna", 6, "Niestachów petla");
        busStop75 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radlin", 6, "Niestachów petla");
        busStop76 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Radlin/Niestachow", 6, "Niestachów petla");
        busStop77 = new BusStop("06:10", "10:22", "15:11", "17:11", "19:42", "Niestachów petla", 6, "Niestachów petla");
        busStop78 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Niestachów petla", 6, "Dworzec Autobusowy");
        busStop79 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Radlin/Niestachów", 6, "Dworzec Autobusowy");
        busStop80 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radlin", 6, "Dworzec Autobusowy");
        busStop81 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Cedzyna", 6, "Dworzec Autobusowy");
        busStop82 = new BusStop("06:59", "12:57", "15:48", "18:11", "20:35", "Sandomierska", 6, "Dworzec Autobusowy");
        busStop83 = new BusStop("07:10", "13:13", "15:52", "18:20", "20:47", "Czarnowska", 6, "Dworzec Autobusowy");
        busStop84 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Dworzec Autobusowy", 6, "Dworzec Autobusowy");

        busStop85 = new BusStop("05:29", "08:55", "14:21", "18:17", "20:55", "Dworzec Autobusowy", 7, "Zagnansk Szkola");
        busStop86 = new BusStop("05:45", "09:11", "14:40", "18:21", "21:11", "Czarnowska", 7, "Zagnansk Szkola");
        busStop87 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Jesionowa", 7, "Zagnansk Szkola");
        busStop88 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Warszawska/Uroczysko", 7, "Zagnansk Szkola");
        busStop89 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Dabrowa", 7, "Zagnansk Szkola");
        busStop90 = new BusStop("06:52", "09:55", "15:51", "18:57", "21:58", "Kajetanów", 7, "Zagnansk Szkola");
        busStop91 = new BusStop("07:11", "10:17", "16:12", "19:11", "22:22", "Zagnansk Szkola", 7, "Zagnansk Szkola");
        busStop92 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Zagnansk Szkola", 7, "Dworzec Autobusowy");
        busStop93 = new BusStop("07:51", "11:11", "16:32", "19:35", "22:40", "Kajetanow", 7, "Dworzec Autobusowy");
        busStop94 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Dabrowa", 7, "Dworzec Autobusowy");
        busStop95 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Warszawska/Uroczysko", 7, "Dworzec Autobusowy");
        busStop96 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Jesionowa", 7, "Dworzec Autobusowy");
        busStop97 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Czarnowska", 7, "Dworzec Autobusowy");
        busStop98 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Dworzec Autobusowy", 7, "Dworzec Autobusowy");

        busStop99 = new BusStop("05:45", "08:55", "14:12", "18:17", "21:37", "Os. Slichowice", 8, "Zniwna");
        busStop100 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Grunwaldzka", 8, "Zniwna");
        busStop101 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Zytnia", 8, "Zniwna");
        busStop102 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Seminaryjska", 8, "Zniwna");
        busStop103 = new BusStop("06:32", "09:40", "15:15", "19:26", "22:25", "Zagorska", 8, "Zniwna");
        busStop104 = new BusStop("06:51", "10:10", "15:24", "19:33", "22:39", "Poleska", 8, "Zniwna");
        busStop105 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Zniwna", 8, "Zniwna");
        busStop106 = new BusStop("07:21", "10:51", "16:13", "19:55", "22:58", "Zniwna", 8, "Os. Slichowice");
        busStop107 = new BusStop("07:39", "11:12", "16:24", "20:12", "23:15", "Poleska", 8, "Os. Slichowice");
        busStop108 = new BusStop("07:48", "11:30", "16:41", "20:24", "23:26", "Zagorska", 8, "Os. Slichowice");
        busStop109 = new BusStop("08:14", "12:17", "16:59", "20:49", "23:43", "Seminaryjska", 8, "Os. Slichowice");
        busStop110 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Zytnia", 8, "Os. Slichowice");
        busStop111 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Grunwaldzka", 8, "Os. Slichowice");
        busStop112 = new BusStop("08:35", "13:55", "18:11", "21:26", "23:59", "Os. Slichowice", 8, "Os. Slichowice");

        busStop113 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Os. Ślichowice", 9, "Cminsk");
        busStop114 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Czarnowska", 9, "Cminsk");
        busStop115 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "Zagnanska", 9, "Cminsk");
        busStop116 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Lodzka", 9, "Cminsk");
        busStop117 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Kostomloty", 9, "Cminsk");
        busStop118 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Miedziana Gora", 9, "Cminsk");
        busStop119 = new BusStop("06:26", "10:16", "15:13", "18:14", "21:11", "Cminsk", 9, "Cminsk");
        busStop120 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Cminsk", 9, "Os. Slichowice");
        busStop121 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Miedziana Gora", 9, "Os. Slichowice");
        busStop122 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Kostomloty", 9, "Os. Slichowice");
        busStop123 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Lodzka", 9, "Os. Slichowice");
        busStop124 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "Zagnanska", 9, "Os. Slichowice");
        busStop125 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Czarnowska", 9, "Os. Slichowice");
        busStop126 = new BusStop("08:13", "13:13", "16:55", "19:42", "23:44", "Os. Slichowice", 9, "Os. Slichowice");

        busStop127 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "Dworzec Autobusowy", 10, "Ciekoty Zeromszczyzna");
        busStop128 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Czarnowska", 10, "Ciekoty Zeromszczyzna");
        busStop129 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Sandomierska", 10, "Ciekoty Zeromszczyzna");
        busStop130 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Cedzyna", 10, "Ciekoty Zeromszczyzna");
        busStop131 = new BusStop("04:45", "07:55", "15:11", "18:45", "21:21", "Leszczyny", 10, "Ciekoty Zeromszczyzna");
        busStop132 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Machocice", 10, "Ciekoty Zeromszczyzna");
        busStop133 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Ciekoty Zeromszczyzna", 10, "Ciekoty Zeromszczyzna");
        busStop134 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Ciekoty Zeromszczyzna", 10, "Dworzec Autobusowy");
        busStop135 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Machocice", 10, "Dworzec Autobusowy");
        busStop136 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Leszczyny", 10, "Dworzec Autobusowy");
        busStop137 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Cedzyna", 10, "Dworzec Autobusowy");
        busStop138 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Sandomierska", 10, "Dworzec Autobusowy");
        busStop139 = new BusStop("06:10", "13:14", "16:52", "20:20", "22:47", "Czarnowska", 10, "Dworzec Autobusowy");
        busStop140 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "Dworzec Autobusowy", 10, "Dworzec Autobusowy");
    }

    /**
     * W metodzie createNewBus tworzymy 10 obiektow autobusow, ktore przechowuja dane odpowiednie dla siebie
     */
    static void createNewBus() {
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
}
