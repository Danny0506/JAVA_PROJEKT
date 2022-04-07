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
        theManager.persist(busStop1);
        theManager.persist(busStop2);
        theManager.persist(busStop3);
        theManager.persist(busStop4);
        theManager.persist(busStop5);
        theManager.persist(busStop6);
        theManager.persist(busStop7);
        theManager.persist(busStop8);
        theManager.persist(busStop9);
        theManager.persist(busStop10);
        theManager.persist(busStop11);
        theManager.persist(busStop12);
        theManager.persist(busStop13);
        theManager.persist(busStop14);
        theManager.persist(busStop15);
        theManager.persist(busStop16);
        theManager.persist(busStop17);
        theManager.persist(busStop18);
        theManager.persist(busStop19);
        theManager.persist(busStop20);
        theManager.persist(busStop21);
        theManager.persist(busStop22);
        theManager.persist(busStop23);
        theManager.persist(busStop24);
        theManager.persist(busStop25);
        theManager.persist(busStop26);
        theManager.persist(busStop27);
        theManager.persist(busStop28);
        theManager.persist(busStop29);
        theManager.persist(busStop30);
        theManager.persist(busStop31);
        theManager.persist(busStop32);
        theManager.persist(busStop33);
        theManager.persist(busStop34);
        theManager.persist(busStop35);
        theManager.persist(busStop36);
        theManager.persist(busStop37);
        theManager.persist(busStop38);
        theManager.persist(busStop39);
        theManager.persist(busStop40);
        theManager.persist(busStop41);
        theManager.persist(busStop42);
        theManager.persist(busStop43);
        theManager.persist(busStop44);
        theManager.persist(busStop45);
        theManager.persist(busStop46);
        theManager.persist(busStop47);
        theManager.persist(busStop48);
        theManager.persist(busStop49);
        theManager.persist(busStop50);
        theManager.persist(busStop51);
        theManager.persist(busStop52);
        theManager.persist(busStop53);
        theManager.persist(busStop54);
        theManager.persist(busStop55);
        theManager.persist(busStop56);
        theManager.persist(busStop57);
        theManager.persist(busStop58);
        theManager.persist(busStop59);
        theManager.persist(busStop60);
        theManager.persist(busStop61);
        theManager.persist(busStop62);
        theManager.persist(busStop63);
        theManager.persist(busStop64);
        theManager.persist(busStop65);
        theManager.persist(busStop66);
        theManager.persist(busStop67);
        theManager.persist(busStop68);
        theManager.persist(busStop69);
        theManager.persist(busStop70);
        theManager.persist(busStop71);
        theManager.persist(busStop72);
        theManager.persist(busStop73);
        theManager.persist(busStop74);
        theManager.persist(busStop75);
        theManager.persist(busStop76);
        theManager.persist(busStop77);
        theManager.persist(busStop78);
        theManager.persist(busStop79);
        theManager.persist(busStop80);
        theManager.persist(busStop81);
        theManager.persist(busStop82);
        theManager.persist(busStop83);
        theManager.persist(busStop84);
        theManager.persist(busStop85);
        theManager.persist(busStop86);
        theManager.persist(busStop87);
        theManager.persist(busStop88);
        theManager.persist(busStop89);
        theManager.persist(busStop90);
        theManager.persist(busStop91);
        theManager.persist(busStop92);
        theManager.persist(busStop93);
        theManager.persist(busStop94);
        theManager.persist(busStop95);
        theManager.persist(busStop96);
        theManager.persist(busStop97);
        theManager.persist(busStop98);
        theManager.persist(busStop99);
        theManager.persist(busStop100);
        theManager.persist(busStop101);
        theManager.persist(busStop102);
        theManager.persist(busStop103);
        theManager.persist(busStop104);
        theManager.persist(busStop105);
        theManager.persist(busStop106);
        theManager.persist(busStop107);
        theManager.persist(busStop108);
        theManager.persist(busStop109);
        theManager.persist(busStop110);
        theManager.persist(busStop111);
        theManager.persist(busStop112);
        theManager.persist(busStop113);
        theManager.persist(busStop114);
        theManager.persist(busStop115);
        theManager.persist(busStop116);
        theManager.persist(busStop117);
        theManager.persist(busStop118);
        theManager.persist(busStop119);
        theManager.persist(busStop120);
        theManager.persist(busStop121);
        theManager.persist(busStop122);
        theManager.persist(busStop123);
        theManager.persist(busStop124);
        theManager.persist(busStop125);
        theManager.persist(busStop126);
        theManager.persist(busStop127);
        theManager.persist(busStop128);
        theManager.persist(busStop129);
        theManager.persist(busStop130);
        theManager.persist(busStop131);
        theManager.persist(busStop132);
        theManager.persist(busStop133);
        theManager.persist(busStop134);
        theManager.persist(busStop135);
        theManager.persist(busStop136);
        theManager.persist(busStop137);
        theManager.persist(busStop138);
        theManager.persist(busStop139);
        theManager.persist(busStop140);
        transaction.commit();
    }
}
