package pl.project.java.repositories;

import pl.project.java.entities.Bus;
import pl.project.java.gui.Gui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Daniel Palak
 * Klasa BusRepository, ktora dziedziczy po klasie Gui
 * Pole statyczne, prywatne EntityManagerFactory factory, ktoremu przypisane jest stworzenie EntityManagerFactory dla nazwy bazy danych BusBase
 * Pole statyczne, prywatne EntityManager theManager, ktoremu przypisane jest stworzenie EntityManagera
 * Pole statyczne, prywatne EntityTransaction transaction, ktoremu przypisane jest stworzenie menadzera transakcji
 */
public class BusRepository extends Gui
{
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("BusBase");
    private static final EntityManager theManager = factory.createEntityManager();
    private static final EntityTransaction transaction = theManager.getTransaction();
    private static final int NUMBER_OF_OBJECTS = 10;

    /**
     * Konstruktor klasy BusRepository, któremu wywoływana jest konstrukcja super dzieki ktorej wywolujemy konstruktor klasy nadrzednej
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     */
    public BusRepository() throws UnsupportedAudioFileException {
        super();
    }

    /**
     * Metoda addNewBus odpowiada za dodanie do bazy danych obiektow jako autobusow
     * transaction.begin() rozpoczyna mozliwosc dodania do bazy danych danych
     * za pomoca theManager.persist() dodajemy obiekt do bazy danych wpisujac jako parametr metody persist() nazwe obiektu. Robimy to dla 10 autobusow
     * po skonczeniu dodawania obiektow do bazy danych wywolujemy metode commit(), aby zatwierdzic dodane dane
     */
    public void addNewBus()
    {
        transaction.begin();
        for(int counter = 0; counter < NUMBER_OF_OBJECTS; counter++)
        {
            theManager.persist(buses[counter]);
        }
        transaction.commit();
    }
}