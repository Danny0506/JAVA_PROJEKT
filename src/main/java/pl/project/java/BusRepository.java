package pl.project.java;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sound.sampled.UnsupportedAudioFileException;

public class BusRepository extends Gui
{
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("BusBase");
    private static final EntityManager theManager = factory.createEntityManager();
    private static final EntityTransaction transaction = theManager.getTransaction();

    public BusRepository() throws UnsupportedAudioFileException {
        super();
    }

    public void addNewBus()
    {
        transaction.begin();
        theManager.persist(bus);
        theManager.persist(bus1);
        theManager.persist(bus2);
        theManager.persist(bus3);
        theManager.persist(bus4);
        theManager.persist(bus5);
        theManager.persist(bus6);
        theManager.persist(bus7);
        theManager.persist(bus8);
        theManager.persist(bus9);
        transaction.commit();
    }
}