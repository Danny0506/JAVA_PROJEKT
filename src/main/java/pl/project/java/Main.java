package pl.project.java;

import javax.sound.sampled.UnsupportedAudioFileException;

public class Main
{
    public static void main(String [] args) throws UnsupportedAudioFileException {

        BusStopRepository busStopRepository = new BusStopRepository();
        busStopRepository.addNewBusStop();
        busStopRepository.addNewBus();
    }
}
