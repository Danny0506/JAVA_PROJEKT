package pl.project.java.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Daniel Palak
 * Klasa BusStopRepository, ktora dziedziczy po klasie BusRepository
 * Pole statyczne, prywatne EntityManagerFactory factory, ktoremu przypisane jest stworzenie EntityManagerFactory dla nazwy bazy danych BusBase
 * Pole statyczne, prywatne EntityManager theManager, ktoremu przypisane jest stworzenie EntityManagera
 * Pole statyczne, prywatne EntityTransaction transaction, ktoremu przypisane jest stworzenie menadzera transakcji
 */
public class BusStopRepository extends BusRepository {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("BusBase");
    private static final EntityManager theManager = factory.createEntityManager();
    private static final EntityTransaction transaction = theManager.getTransaction();
    private static final int NUMBER_OF_OBJECTS = 140;

    /**
     * Konstruktor klasy BusStopRepository, któremu wywoływana jest konstrukcja super dzieki ktorej wywolujemy konstruktor klasy nadrzednej
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     */
    public BusStopRepository() throws UnsupportedAudioFileException {
        super();
    }

    /**
     * Metoda addNewBusStop odpowiada za dodanie do bazy danych obiektow jako przystankow
     * transaction.begin() rozpoczyna mozliwosc dodania do bazy danych danych
     * za pomoca theManager.persist() dodajemy obiekt do bazy danych wpisujac jako parametr metody persist() nazwe obiektu. Robimy to dla 140 przystankow
     * po skonczeniu dodawania obiektow do bazy danych wywolujemy metode commit(), aby zatwierdzic dodane dane
     */
    public void addNewBusStop()
    {
        transaction.begin();
        for(int counter = 0; counter < NUMBER_OF_OBJECTS; counter++)
        {
            if(counter == 0)
            {
                for(int nestedCounter = 56; nestedCounter < 70; nestedCounter++)
                {
                    theManager.persist(nameStops[nestedCounter]);
                }
            }
            if(counter == 56)
            {
                counter += 14;
            }
            theManager.persist(nameStops[counter]);
        }
        transaction.commit();
    }
}
