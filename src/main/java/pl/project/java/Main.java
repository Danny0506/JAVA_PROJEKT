package pl.project.java;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Daniel Palak
 * Klasa programu głównego, w którym wywołują się dwie metody dla obiektu BusStopRepository
 */
public class Main
{
    /**
     * @param args parametr metody, ktory moze przyjmowac tablice, liczby czy obiekty
     * @throws UnsupportedAudioFileException wyrzucenie wyjatku gdy mamy do czynienia z plikiem audio, ktorego format nie jest wspierany
     */
    public static void main(String [] args) throws UnsupportedAudioFileException {

        BusStopRepository busStopRepository = new BusStopRepository(); /** Utworzenie obiektu busStopRepository*/
        busStopRepository.addNewBusStop(); /** Wywolanie metody addNewBusStop dla obiektu busStopRepository*/
        busStopRepository.addNewBus();  /** Wywolanie metody addNewBus dla obiektu busStopRepository*/
    }
}
