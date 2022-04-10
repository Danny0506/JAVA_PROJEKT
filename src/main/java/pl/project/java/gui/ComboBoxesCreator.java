package pl.project.java.gui;

import pl.project.java.entities.Bus;
import pl.project.java.entities.BusStop;

import javax.sound.sampled.UnsupportedAudioFileException;

public final class ComboBoxesCreator extends Gui{
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
    public ComboBoxesCreator() throws UnsupportedAudioFileException {
    }

    static void addItemsForComboBox2(int index, Bus[] buses)
    {
        if (index == 0) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[0].getDirectionOne());
            comboBox2.addItem(buses[0].getDirectionTwo());
        } else if (index == 1) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[1].getDirectionOne());
            comboBox2.addItem(buses[1].getDirectionTwo());
        } else if (index == 2) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[2].getDirectionOne());
            comboBox2.addItem(buses[2].getDirectionTwo());
        } else if (index == 3) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[3].getDirectionOne());
            comboBox2.addItem(buses[3].getDirectionTwo());
        } else if (index == 4) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[4].getDirectionOne());
            comboBox2.addItem(buses[4].getDirectionTwo());
        } else if (index == 5) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[5].getDirectionOne());
            comboBox2.addItem(buses[5].getDirectionTwo());
        } else if (index == 6) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[6].getDirectionOne());
            comboBox2.addItem(buses[6].getDirectionTwo());
        } else if (index == 7) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[7].getDirectionOne());
            comboBox2.addItem(buses[7].getDirectionTwo());
        } else if (index == 8) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[8].getDirectionOne());
            comboBox2.addItem(buses[8].getDirectionTwo());
        } else if (index == 9) {
            comboBox2.removeAllItems();
            comboBox2.addItem(buses[9].getDirectionOne());
            comboBox2.addItem(buses[9].getDirectionTwo());
        }
    }

    static void addItemsForComboBox5(int index, Bus[] buses)
    {
        if (index == 0) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[0].getDirectionOne());
            comboBox5.addItem(buses[0].getDirectionTwo());
        } else if (index == 1) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[1].getDirectionOne());
            comboBox5.addItem(buses[1].getDirectionTwo());
        } else if (index == 2) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[2].getDirectionOne());
            comboBox5.addItem(buses[2].getDirectionTwo());
        } else if (index == 3) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[3].getDirectionOne());
            comboBox5.addItem(buses[3].getDirectionTwo());
        } else if (index == 4) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[4].getDirectionOne());
            comboBox5.addItem(buses[4].getDirectionTwo());
        } else if (index == 5) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[5].getDirectionOne());
            comboBox5.addItem(buses[5].getDirectionTwo());
        } else if (index == 6) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[6].getDirectionOne());
            comboBox5.addItem(buses[6].getDirectionTwo());
        } else if (index == 7) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[7].getDirectionOne());
            comboBox5.addItem(buses[7].getDirectionTwo());
        } else if (index == 8) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[8].getDirectionOne());
            comboBox5.addItem(buses[8].getDirectionTwo());
        } else if (index == 9) {
            comboBox5.removeAllItems();
            comboBox5.addItem(buses[9].getDirectionOne());
            comboBox5.addItem(buses[9].getDirectionTwo());
        }
    }

    static void addItemsForComboBox3(int index, int indexTwo, BusStop[] busStops)
    {
        if (index == 0 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 0; i < 7; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 0 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 7; i < 14; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 1 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 14; i < 21; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 1 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 21; i < 28; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 2 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 28; i < 35; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 2 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 35; i < 42; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 3 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 42; i < 49; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 3 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 49; i < 56; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 4 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 63; i < 70; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 4 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 56; i < 63; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        }
        if (index == 5 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 70; i < 77; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 5 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 77; i < 84; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 6 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 84; i < 91; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 6 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 91; i < 98; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 7 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 98; i < 105; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 7 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 105; i < 112; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 8 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 112; i < 119; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 8 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 119; i < 126; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 9 && indexTwo == 0) {
            comboBox3.removeAllItems();
            for (int i = 126; i < 133; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        } else if (index == 9 && indexTwo == 1) {
            comboBox3.removeAllItems();
            for (int i = 133; i < 140; i++) {
                comboBox3.addItem(busStops[i].getBusStopName());
            }
        }
    }
}
