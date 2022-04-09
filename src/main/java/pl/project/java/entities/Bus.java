package pl.project.java.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Daniel Palak
 * Adnotacja @Entity oznacza traktowanie klasy jako pojedyncza encje w bazie danych
 * Klasa Bus przedstawia wzor informacji dla autobusu
 */
@Entity
@NoArgsConstructor
public class Bus
{
    /**
     * Adnotacja @Id oznacza tarktowanie pola w klasie id jako unikalny numer
     * Adnotacja @GeneratedValue generuje automatycznie klucze id jako unikalne numery w strategii IDENTITY
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Prywatne pole w klasie oznaczajace numer linii
     */
    private int busLineNumber;
    /**
     * Prywatne pole w klasie oznaczajace pierwszy kierunek autobusu
     */
    private String directionOne;
    /**
     * Prywatne pole w klasie oznaczajace drugi kierunek autobusu
     */
    private String directionTwo;

    /**
     * Adnotacja @OneToMany oznacza, ze jeden autobus moze jezdzic do wielu przystankow
     * Prywatne pole w klasie oznaczajace zbior przystankow
     */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BusStop> busStopSet;

    /**
     * Konstruktor z trzema parametrami klasy Bus
     * @param busLineNumber oznacza numer linii
     * @param directionOne oznacza pierwszy kierunek autobusu
     * @param directionTwo oznacza drugi kierunek autobusu
     */
    public Bus(int busLineNumber, String directionOne, String directionTwo)
    {
        this.busLineNumber = busLineNumber;
        this.directionOne = directionOne;
        this.directionTwo = directionTwo;
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
     * Getter dla pola directionOne
     * @return zwraca pierwszy kierunek autobusu
     */
    public String getDirectionOne() {
        return directionOne;
    }

    /**
     * Setter dla pola directionOne
     * @param directionOne oznacza pierwszy kierunek autobusu
     */
    public void setDirectionOne(String directionOne) {
        this.directionOne = directionOne;
    }

    /**
     * Getter dla pola directionTwo
     * @return zwraca drugi kierunek autobusu
     */
    public String getDirectionTwo() {
        return directionTwo;
    }

    /**
     * Setter dla pola directionTwo
     * @param directionTwo oznacza drugi kierunek autobusu
     */
    public void setDirectionTwo(String directionTwo) {
        this.directionTwo = directionTwo;
    }
}
