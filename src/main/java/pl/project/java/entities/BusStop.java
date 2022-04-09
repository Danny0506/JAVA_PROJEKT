package pl.project.java.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Daniel Palak
 * Adnotacja @Entity oznacza traktowanie klasy jako pojedyncza encje w bazie danych
 * Klasa BusStop przedstawia wzor informacji dla przystanka
 */
@Entity
@NoArgsConstructor
public class BusStop {

    /**
     * Adnotacja @Id oznacza tarktowanie pola w klasie id jako unikalny numer
     * Adnotacja @GeneratedValue generuje automatycznie klucze id jako unikalne numery w strategii IDENTITY
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Prywatne pola w klasie oznaczajace piec czasow odjazdow z przystanku dla konkretnego autobusu
     */
    private String departureOneTime;
    private String departureTwoTime;
    private String departureThreeTime;
    private String departureFourTime;
    private String departureFiveTime;
    /**
     * Prywatne pole w klasie oznaczajace nazwe przystanku
     */
    private String busStopName;
    /**
     * Prywatne pole w klasie oznaczajace numer linii
     */
    private int busLineNumber;
    /**
     * Prywatne pole w klasie oznaczajace kierunek, w ktorym jedzie autobus
     */
    private String direction;

    /**
     * Adnotacja @ManyToOne oznacza, ze wiele autobusow moze jezdzic do konkretnego jednego przystanku
     * Prywatne pole bus oznacza obiekt z klasy Bus
     */
    @ManyToOne
    private Bus bus;

    /**
     * Konstruktor z osmioma parametrami klasy BusStop
     * @param departureOneTime oznacza pierwszy czas odjazdu z przystanku
     * @param departureTwoTime oznacza drugi czas odjazdu z przystanku
     * @param departureThreeTime oznacza trzeci czas odjazdu z przystanku
     * @param departureFourTime oznacza czwarty czas odjazdu z przystanku
     * @param departureFiveTime oznacza piaty czas odjazdu z przystanku
     * @param busStopName oznacza nazwe przystanku
     * @param busLineNumber oznacza numer linii
     * @param direction oznacza kierunek, w ktorym jedzie autobus
     */
    public BusStop(String departureOneTime, String departureTwoTime, String departureThreeTime, String departureFourTime, String departureFiveTime, String busStopName, int busLineNumber, String direction)
    {
        this.busLineNumber = busLineNumber;
        this.busStopName = busStopName;
        this.departureOneTime = departureOneTime;
        this.departureTwoTime = departureTwoTime;
        this.departureThreeTime = departureThreeTime;
        this.departureFourTime = departureFourTime;
        this.departureFiveTime = departureFiveTime;
        this.direction = direction;
    }

    /**
     * Getter dla pola ID
     * @return zwraca wartosc id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter dla pola ID
     * @param id oznacza identyfikator danego obiektu, ktory musi byc unikalny
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter dla pola DepartureOneTime
     * @return zwraca wartosc pierwszego odjazdu z przystanku
     */
    public String getDepartureOneTime() {
        return departureOneTime;
    }

    /**
     * Setter dla pola departureOneTime
     * @param departureOneTime oznacza pierwszy odjazd z przystanku
     */
    public void setDepartureOneTime(String departureOneTime) {
        this.departureOneTime = departureOneTime;
    }

    /**
     * Getter dla pola DepartureTwoTime
     * @return zwraca wartosc drugiego odjazdu z przystanku
     */
    public String getDepartureTwoTime() {
        return departureTwoTime;
    }

    /**
     * Setter dla pola departureTwoTime
     * @param departureTwoTime oznacza drugi odjazd z przystanku
     */
    public void setDepartureTwoTime(String departureTwoTime) {
        this.departureTwoTime = departureTwoTime;
    }

    /**
     * Getter dla pola DepartureThreeTime
     * @return zwraca wartosc trzecieo odjazdu z przystanku
     */
    public String getDepartureThreeTime() {
        return departureThreeTime;
    }

    /**
     * Setter dla pola departureThreeTime
     * @param departureThreeTime oznacza trzeci odjazd z przystanku
     */
    public void setDepartureThreeTime(String departureThreeTime) {
        this.departureThreeTime = departureThreeTime;
    }

    /**
     * Getter dla pola DepartureFourTime
     * @return zwraca wartosc czwartego odjazdu z przystanku
     */
    public String getDepartureFourTime() {
        return departureFourTime;
    }

    /**
     * Setter dla pola departureFourTime
     * @param departureFourTime oznacza czwarty odjazd z przystanku
     */
    public void setDepartureFourTime(String departureFourTime) {
        this.departureFourTime = departureFourTime;
    }

    /**
     * Getter dla pola DepartureFiveTime
     * @return zwraca wartosc piatego odjazdu z przystanku
     */
    public String getDepartureFiveTime() {
        return departureFiveTime;
    }

    /**
     * Setter dla pola departureFiveTime
     * @param departureFiveTime oznacza piaty odjazd z przystanku
     */
    public void setDepartureFiveTime(String departureFiveTime) {
        this.departureFiveTime = departureFiveTime;
    }

    /**
     * Getter dla pola BusLineNumber
     * @return zwraca numer linii autobusowej
     */
    public int getBusLineNumber() {
        return busLineNumber;
    }

    /**
     * Setter dla pola BusLineNumber
     * @param busLineNumber oznacza numer linii autobusowej
     */
    public void setBusLineNumber(int busLineNumber) {
        this.busLineNumber = busLineNumber;
    }

    /**
     * Getter dla pola BusStopName
     * @return zwraca nazwe przystanku
     */
    public String getBusStopName() {
        return busStopName;
    }

    /**
     * Setter dla pola busStopName
     * @param busStopName oznacza nazwe przystanku
     */
    public void setBusStopName(String busStopName) {
        this.busStopName = busStopName;
    }

    /**
     * Getter dla pola direction
     * @return zwraca nazwe kierunku
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Setter dla pola direction
     * @param direction oznacza nazwe kierunku
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}
