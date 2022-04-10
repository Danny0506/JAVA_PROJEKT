package pl.project.java.main;

import pl.project.java.repositories.BusStopRepository;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Daniel Palak
 * Klasa programu głównego, w którym wywołują się dwie metody dla obiektu BusStopRepository
 */
public class Main
{
    /**
     * @param args parametr metody statycznej main, ktory moze przyjmowac tablice, liczby czy obiekty
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     * Utworzenie w metodzie main obiektu busStopRepository
     * Wywolanie metody addNewBusStop dla obiektu busStopRepository
     * Wywolanie metody addNewBus dla obiektu busStopRepository
     */
    public static void main(String [] args) throws UnsupportedAudioFileException {
        BusStopRepository busStopRepository = new BusStopRepository();
        busStopRepository.addNewBusStop();
        busStopRepository.addNewBus();
    }
}
