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
    public static BusStop[] createNewBusStop() {

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

        BusStop busStop15 = new BusStop("05:29", "08:55", "14:21", "18:24", "20:55", "Pietraszki", 1, "Bukowka");
        BusStop busStop16 = new BusStop("05:45", "09:11", "14:40", "18:11", "21:11", "Kolonia I", 1, "Bukowka");
        BusStop busStop17 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Fabryczna", 1, "Bukowka");
        BusStop busStop18 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Krakowska Biesak", 1, "Bukowka");
        BusStop busStop19 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Jagielońska", 1, "Bukowka");
        BusStop busStop20 = new BusStop("06:52", "09:55", "15:51", "18:58", "21:58", "Zytnia", 1, "Bukowka");
        BusStop busStop21 = new BusStop("07:11", "10:17", "16:15", "19:11", "22:22", "Bukowka", 1, "Bukowka");
        BusStop busStop22 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Bukowka", 1, "Pietraszki");
        BusStop busStop23 = new BusStop("07:51", "11:21", "16:32", "19:35", "22:40", "Zytnia", 1, "Pietraszki");
        BusStop busStop24 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Jagielońska", 1, "Pietraszki");
        BusStop busStop25 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Krakowska Biesak", 1, "Pietraszki");
        BusStop busStop26 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Fabryczna", 1, "Pietraszki");
        BusStop busStop27 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Kolonia I", 1, "Pietraszki");
        BusStop busStop28 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Pietraszki", 1, "Pietraszki");

        BusStop busStop29 = new BusStop("05:45", "08:55", "14:14", "18:17", "21:37", "Kolberga", 2, "Sukowska");
        BusStop busStop30 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Hoza", 2, "Sukowska");
        BusStop busStop31 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Jagielonska", 2, "Sukowska");
        BusStop busStop32 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Zytnia", 2, "Sukowska");
        BusStop busStop33 = new BusStop("06:32", "09:40", "15:13", "19:26", "22:25", "Sciegiennego", 2, "Sukowska");
        BusStop busStop34 = new BusStop("06:51", "10:11", "15:24", "19:33", "22:39", "Kalinowa", 2, "Sukowska");
        BusStop busStop35 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Sukowska", 2, "Sukowska");
        BusStop busStop36 = new BusStop("07:21", "10:51", "16:10", "19:55", "22:58", "Sukowska", 2, "Kolberga");
        BusStop busStop37 = new BusStop("07:39", "11:12", "16:24", "20:15", "23:15", "Kalinowa", 2, "Kolberga");
        BusStop busStop38 = new BusStop("07:55", "11:30", "16:41", "20:24", "23:26", "Sciegiennego", 2, "Kolberga");
        BusStop busStop39 = new BusStop("08:14", "12:21", "16:59", "20:49", "23:43", "Zytnia", 2, "Kolberga");
        BusStop busStop40 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Jagielońska", 2, "Kolberga");
        BusStop busStop41 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Hoza", 2, "Kolberga");
        BusStop busStop42 = new BusStop("08:35", "13:55", "18:14", "21:26", "23:59", "Kolberga", 2, "Kolberga");

        BusStop busStop43 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Kaczmarka", 3, "Borkow");
        BusStop busStop44 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Zytnia", 3, "Borkow");
        BusStop busStop45 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "IX Wiekow Kielc", 3, "Borkow");
        BusStop busStop46 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Tarnowska", 3, "Borkow");
        BusStop busStop47 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Wrzosowa", 3, "Borkow");
        BusStop busStop48 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Sukow", 3, "Borkow");
        BusStop busStop49 = new BusStop("06:26", "10:17", "15:13", "18:14", "21:11", "Borkow", 3, "Borkow");
        BusStop busStop50 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Borkow", 3, "Kaczmarka");
        BusStop busStop51 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Sukow", 3, "Kaczmarka");
        BusStop busStop52 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Wrzosowa", 3, "Kaczmarka");
        BusStop busStop53 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Tarnowska", 3, "Kaczmarka");
        BusStop busStop54 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "IX Wiekow Kielc", 3, "Kaczmarka");
        BusStop busStop55 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Zytnia", 3, "Kaczmarka");
        BusStop busStop56 = new BusStop("08:13", "13:10", "16:55", "19:42", "23:44", "Kaczmarka", 3, "Kaczmarka");

        BusStop busStop57 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "al. Na Stadion", 4, "Zagnanska Areszt");
        BusStop busStop58 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Pakosz", 4, "Zagnanska Areszt");
        BusStop busStop59 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Krakowska", 4, "Zagnanska Areszt");
        BusStop busStop60 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Seminaryjska", 4, "Zagnanska Areszt");
        BusStop busStop61 = new BusStop("04:45", "07:55", "14:58", "18:45", "21:21", "Tarnowska", 4, "Zagnanska Areszt");
        BusStop busStop62 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Jesionowa", 4, "Zagnanska Areszt");
        BusStop busStop63 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Zagnanska Areszt", 4, "Zagnanska Areszt");
        BusStop busStop64 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Zagnanska Areszt", 4, "al. Na Stadion");
        BusStop busStop65 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Jesionowa", 4, "al. Na Stadion");
        BusStop busStop66 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Tarnowska", 4, "al. Na Stadion");
        BusStop busStop67 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Seminaryjska", 4, "al. Na Stadion");
        BusStop busStop68 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Krakowska", 4, "al. Na Stadion");
        BusStop busStop69 = new BusStop("06:10", "13:13", "16:52", "20:20", "22:47", "Pakosz", 4, "al. Na Stadion");
        BusStop busStop70 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "al. Na Stadion", 4, "al. Na Stadion");

        BusStop busStop71 = new BusStop("05:15", "07:18", "13:45", "15:57", "18:32", "Dworzec Autobusowy", 6, "Niestachów petla");
        BusStop busStop72 = new BusStop("05:18", "07:25", "13:58", "16:10", "18:40", "Czarnowska", 6, "Niestachów petla");
        BusStop busStop73 = new BusStop("05:24", "07:48", "14:10", "16:21", "18:53", "Sandomierska", 6, "Niestachów petla");
        BusStop busStop74 = new BusStop("05:33", "08:21", "14:21", "16:33", "19:11", "Cedzyna", 6, "Niestachów petla");
        BusStop busStop75 = new BusStop("05:45", "08:55", "14:38", "16:41", "19:21", "Radlin", 6, "Niestachów petla");
        BusStop busStop76 = new BusStop("05:59", "09:41", "14:55", "16:57", "19:32", "Radlin/Niestachow", 6, "Niestachów petla");
        BusStop busStop77 = new BusStop("06:10", "10:22", "15:11", "17:11", "19:42", "Niestachów petla", 6, "Niestachów petla");
        BusStop busStop78 = new BusStop("06:20", "11:44", "15:18", "17:25", "19:50", "Niestachów petla", 6, "Dworzec Autobusowy");
        BusStop busStop79 = new BusStop("06:37", "12:12", "15:29", "17:35", "19:59", "Radlin/Niestachów", 6, "Dworzec Autobusowy");
        BusStop busStop80 = new BusStop("06:48", "12:30", "15:37", "17:47", "20:12", "Radlin", 6, "Dworzec Autobusowy");
        BusStop busStop81 = new BusStop("06:57", "12:46", "15:45", "17:59", "20:23", "Cedzyna", 6, "Dworzec Autobusowy");
        BusStop busStop82 = new BusStop("06:59", "12:57", "15:48", "18:11", "20:35", "Sandomierska", 6, "Dworzec Autobusowy");
        BusStop busStop83 = new BusStop("07:10", "13:13", "15:52", "18:20", "20:47", "Czarnowska", 6, "Dworzec Autobusowy");
        BusStop busStop84 = new BusStop("07:13", "13:27", "15:55", "18:26", "20:51", "Dworzec Autobusowy", 6, "Dworzec Autobusowy");

        BusStop busStop85 = new BusStop("05:29", "08:55", "14:21", "18:17", "20:55", "Dworzec Autobusowy", 7, "Zagnansk Szkola");
        BusStop busStop86 = new BusStop("05:45", "09:11", "14:40", "18:21", "21:11", "Czarnowska", 7, "Zagnansk Szkola");
        BusStop busStop87 = new BusStop("05:53", "09:18", "14:57", "18:23", "21:22", "Jesionowa", 7, "Zagnansk Szkola");
        BusStop busStop88 = new BusStop("06:11", "09:29", "15:17", "18:33", "21:30", "Warszawska/Uroczysko", 7, "Zagnansk Szkola");
        BusStop busStop89 = new BusStop("06:29", "09:42", "15:35", "18:51", "21:52", "Dabrowa", 7, "Zagnansk Szkola");
        BusStop busStop90 = new BusStop("06:52", "09:55", "15:51", "18:57", "21:58", "Kajetanów", 7, "Zagnansk Szkola");
        BusStop busStop91 = new BusStop("07:11", "10:17", "16:12", "19:11", "22:22", "Zagnansk Szkola", 7, "Zagnansk Szkola");
        BusStop busStop92 = new BusStop("07:20", "10:29", "16:23", "19:23", "22:32", "Zagnansk Szkola", 7, "Dworzec Autobusowy");
        BusStop busStop93 = new BusStop("07:51", "11:11", "16:32", "19:35", "22:40", "Kajetanow", 7, "Dworzec Autobusowy");
        BusStop busStop94 = new BusStop("07:59", "11:45", "16:55", "19:47", "22:47", "Dabrowa", 7, "Dworzec Autobusowy");
        BusStop busStop95 = new BusStop("08:10", "12:12", "16:59", "19:59", "22:58", "Warszawska/Uroczysko", 7, "Dworzec Autobusowy");
        BusStop busStop96 = new BusStop("08:16", "12:56", "17:28", "20:10", "23:14", "Jesionowa", 7, "Dworzec Autobusowy");
        BusStop busStop97 = new BusStop("08:22", "13:44", "17:46", "20:25", "23:24", "Czarnowska", 7, "Dworzec Autobusowy");
        BusStop busStop98 = new BusStop("08:34", "13:58", "18:11", "20:41", "23:47", "Dworzec Autobusowy", 7, "Dworzec Autobusowy");

        BusStop busStop99 = new BusStop("05:45", "08:55", "14:12", "18:17", "21:37", "Os. Slichowice", 8, "Zniwna");
        BusStop busStop100 = new BusStop("05:53", "09:11", "14:21", "18:29", "21:47", "Grunwaldzka", 8, "Zniwna");
        BusStop busStop101 = new BusStop("06:10", "09:19", "14:34", "18:43", "21:59", "Zytnia", 8, "Zniwna");
        BusStop busStop102 = new BusStop("06:21", "09:21", "14:55", "19:11", "22:17", "Seminaryjska", 8, "Zniwna");
        BusStop busStop103 = new BusStop("06:32", "09:40", "15:15", "19:26", "22:25", "Zagorska", 8, "Zniwna");
        BusStop busStop104 = new BusStop("06:51", "10:10", "15:24", "19:33", "22:39", "Poleska", 8, "Zniwna");
        BusStop busStop105 = new BusStop("06:59", "10:26", "15:45", "19:41", "22:53", "Zniwna", 8, "Zniwna");
        BusStop busStop106 = new BusStop("07:21", "10:51", "16:13", "19:55", "22:58", "Zniwna", 8, "Os. Slichowice");
        BusStop busStop107 = new BusStop("07:39", "11:12", "16:24", "20:12", "23:15", "Poleska", 8, "Os. Slichowice");
        BusStop busStop108 = new BusStop("07:48", "11:30", "16:41", "20:24", "23:26", "Zagorska", 8, "Os. Slichowice");
        BusStop busStop109 = new BusStop("08:14", "12:17", "16:59", "20:49", "23:43", "Seminaryjska", 8, "Os. Slichowice");
        BusStop busStop110 = new BusStop("08:20", "12:45", "17:23", "20:58", "23:48", "Zytnia", 8, "Os. Slichowice");
        BusStop busStop111 = new BusStop("08:24", "13:27", "17:52", "21:10", "23:57", "Grunwaldzka", 8, "Os. Slichowice");
        BusStop busStop112 = new BusStop("08:35", "13:55", "18:11", "21:26", "23:59", "Os. Slichowice", 8, "Os. Slichowice");

        BusStop busStop113 = new BusStop("04:45", "08:24", "13:23", "17:17", "19:55", "Os. Ślichowice", 9, "Cminsk");
        BusStop busStop114 = new BusStop("04:58", "08:32", "13:47", "17:28", "20:11", "Czarnowska", 9, "Cminsk");
        BusStop busStop115 = new BusStop("05:11", "08:48", "13:59", "17:40", "20:23", "Zagnanska", 9, "Cminsk");
        BusStop busStop116 = new BusStop("05:26", "08:59", "14:21", "17:53", "20:35", "Lodzka", 9, "Cminsk");
        BusStop busStop117 = new BusStop("05:49", "09:11", "14:45", "17:59", "20:46", "Kostomloty", 9, "Cminsk");
        BusStop busStop118 = new BusStop("06:12", "09:30", "14:57", "18:11", "20:59", "Miedziana Gora", 9, "Cminsk");
        BusStop busStop119 = new BusStop("06:26", "10:16", "15:13", "18:14", "21:11", "Cminsk", 9, "Cminsk");
        BusStop busStop120 = new BusStop("06:47", "10:34", "15:26", "18:26", "21:26", "Cminsk", 9, "Os. Slichowice");
        BusStop busStop121 = new BusStop("06:59", "11:12", "15:45", "18:37", "21:45", "Miedziana Gora", 9, "Os. Slichowice");
        BusStop busStop122 = new BusStop("07:11", "11:30", "15:54", "18:44", "21:58", "Kostomloty", 9, "Os. Slichowice");
        BusStop busStop123 = new BusStop("07:27", "11:41", "16:12", "18:59", "22:16", "Lodzka", 9, "Os. Slichowice");
        BusStop busStop124 = new BusStop("07:44", "11:58", "16:28", "19:11", "22:55", "Zagnanska", 9, "Os. Slichowice");
        BusStop busStop125 = new BusStop("07:56", "12:41", "16:42", "19:23", "23:12", "Czarnowska", 9, "Os. Slichowice");
        BusStop busStop126 = new BusStop("08:13", "13:13", "16:55", "19:42", "23:44", "Os. Slichowice", 9, "Os. Slichowice");

        BusStop busStop127 = new BusStop("04:15", "06:18", "13:52", "17:37", "20:32", "Dworzec Autobusowy", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop128 = new BusStop("04:18", "06:25", "14:15", "17:59", "20:40", "Czarnowska", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop129 = new BusStop("04:24", "06:48", "14:26", "18:26", "20:53", "Sandomierska", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop130 = new BusStop("04:33", "07:21", "14:48", "18:33", "21:10", "Cedzyna", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop131 = new BusStop("04:45", "07:55", "15:11", "18:45", "21:21", "Leszczyny", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop132 = new BusStop("04:59", "08:41", "15:15", "18:57", "21:32", "Machocice", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop133 = new BusStop("05:11", "09:22", "15:26", "19:11", "21:42", "Ciekoty Zeromszczyzna", 10, "Ciekoty Zeromszczyzna");
        BusStop busStop134 = new BusStop("05:20", "10:44", "15:45", "19:25", "21:50", "Ciekoty Zeromszczyzna", 10, "Dworzec Autobusowy");
        BusStop busStop135 = new BusStop("05:37", "11:12", "15:59", "19:35", "21:59", "Machocice", 10, "Dworzec Autobusowy");
        BusStop busStop136 = new BusStop("05:48", "11:30", "16:12", "19:47", "22:12", "Leszczyny", 10, "Dworzec Autobusowy");
        BusStop busStop137 = new BusStop("05:57", "11:46", "16:23", "19:59", "22:23", "Cedzyna", 10, "Dworzec Autobusowy");
        BusStop busStop138 = new BusStop("05:59", "12:57", "16:45", "20:11", "22:35", "Sandomierska", 10, "Dworzec Autobusowy");
        BusStop busStop139 = new BusStop("06:10", "13:14", "16:52", "20:20", "22:47", "Czarnowska", 10, "Dworzec Autobusowy");
        BusStop busStop140 = new BusStop("06:13", "13:27", "16:59", "20:26", "22:51", "Dworzec Autobusowy", 10, "Dworzec Autobusowy");

        return new BusStop[]{busStop15, busStop16, busStop17, busStop18, busStop19, busStop20, busStop21, busStop22, busStop23, busStop24, busStop25, busStop26, busStop27, busStop28, busStop29, busStop30, busStop31, busStop32, busStop33, busStop34, busStop35, busStop36, busStop37, busStop38, busStop39, busStop40, busStop41, busStop42, busStop43, busStop44, busStop45, busStop46, busStop47, busStop48, busStop49, busStop50, busStop51, busStop52, busStop53, busStop54, busStop55, busStop56, busStop57, busStop58, busStop59, busStop60, busStop61, busStop62, busStop63, busStop64, busStop65, busStop66, busStop67, busStop68, busStop69, busStop70, busStop1, busStop2, busStop3, busStop4, busStop5, busStop6, busStop7, busStop8, busStop9, busStop10, busStop11, busStop12, busStop13, busStop14, busStop71, busStop72, busStop73, busStop75, busStop74, busStop76, busStop77, busStop78, busStop79, busStop80, busStop81, busStop82, busStop83, busStop84, busStop85, busStop86, busStop87, busStop88, busStop89, busStop90, busStop91, busStop92, busStop93, busStop94, busStop95, busStop96, busStop97, busStop98, busStop99, busStop100, busStop101, busStop102, busStop103, busStop104, busStop105, busStop106, busStop107, busStop108, busStop109, busStop110, busStop111, busStop112, busStop113, busStop114, busStop115, busStop116, busStop117, busStop118, busStop119, busStop120, busStop121, busStop122, busStop123, busStop124, busStop125, busStop126, busStop127, busStop128, busStop129, busStop130, busStop131, busStop132, busStop133, busStop134, busStop135, busStop136, busStop137, busStop138, busStop139, busStop140};
    }

    /**
     * W metodzie createNewBus tworzymy 10 obiektow autobusow, ktore przechowuja dane odpowiednie dla siebie
     */
    public static Bus[] createNewBus() {
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

        return new Bus[] {bus, bus1, bus2, bus3, bus4, bus5, bus6, bus7, bus8, bus9};
    }
}
