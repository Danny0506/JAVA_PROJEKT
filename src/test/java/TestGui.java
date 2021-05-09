import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.project.java.entities.Bus;
import pl.project.java.gui.MyJPanel;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestGui {

    @Test
    public void testAudio()
    {
        File soundFile = new File("src/main/resources/songs/Jason Derulo - Lifestyle (feat. Adam Levine) [Official Dance Video].wav");
        File soundFile2 = new File("src/main/resources/songs/Jason-Derulo-Take-You-Dancing-_Official-Dance-Video_.wav");
        Assertions.assertNotNull(soundFile);
        Assertions.assertNotNull(soundFile2);
        Assertions.assertNotEquals(soundFile, soundFile2);

        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(soundFile2);
            AudioInputStream appendedFiles = new AudioInputStream(new SequenceInputStream(audioIn2, audioIn), audioIn2.getFormat(), audioIn2.getFrameLength() + audioIn.getFrameLength());
            Clip clip = AudioSystem.getClip();
            clip.open(appendedFiles);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10.0f);
            clip.start();
            clip.loop(5000);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateNewBus()
    {
        Bus bus = new Bus(1, "Bukówka", "Pietraszki");
        Bus bus1 = new Bus(2, "Sukowska", "Kolberga");
        Bus bus2 = new Bus(3, "Borków", "Kaczmarka");
        Bus bus3 = new Bus(4, "Zagnańska Areszt", "al. Na Stadion");
        Bus bus4 = new Bus(5, "Szybowcowa", "Kolberga");
        Bus bus5 = new Bus(6, "Niestachów pętla", "Dworzec Autobusowy");
        Bus bus6 = new Bus(7, "Zagnańsk Szkoła", "Dworzec Autobusowy");
        Bus bus7 = new Bus(8, "Żniwna", "Os. Ślichowice");
        Bus bus8 = new Bus(9, "Ćmińsk", "Os. Ślichowice");
        Bus bus9 = new Bus(10, "Ciekoty Żeromszczyzna", "Dworzec Autobusowy");

        Assertions.assertNotNull(bus);
        Assertions.assertNotNull(bus1);
        Assertions.assertNotNull(bus2);
        Assertions.assertNotNull(bus3);
        Assertions.assertNotNull(bus4);
        Assertions.assertNotNull(bus5);
        Assertions.assertNotNull(bus6);
        Assertions.assertNotNull(bus7);
        Assertions.assertNotNull(bus8);
        Assertions.assertNotNull(bus9);
        Assertions.assertNotEquals(bus, bus1);
        Assertions.assertNotEquals(bus, bus2);
        Assertions.assertNotEquals(bus, bus3);
        Assertions.assertNotEquals(bus, bus4);
        Assertions.assertNotEquals(bus, bus5);
        Assertions.assertNotEquals(bus, bus6);
        Assertions.assertNotEquals(bus, bus7);
        Assertions.assertNotEquals(bus, bus8);
        Assertions.assertNotEquals(bus, bus9);
        Assertions.assertNotEquals(bus1, bus2);
        Assertions.assertNotEquals(bus1, bus3);
        Assertions.assertNotEquals(bus1, bus4);
        Assertions.assertNotEquals(bus1, bus5);
        Assertions.assertNotEquals(bus1, bus6);
        Assertions.assertNotEquals(bus1, bus7);
        Assertions.assertNotEquals(bus1, bus8);
        Assertions.assertNotEquals(bus1, bus9);
        Assertions.assertNotEquals(bus2, bus3);
        Assertions.assertNotEquals(bus2, bus4);
        Assertions.assertNotEquals(bus2, bus5);
        Assertions.assertNotEquals(bus2, bus6);
        Assertions.assertNotEquals(bus2, bus7);
        Assertions.assertNotEquals(bus2, bus8);
        Assertions.assertNotEquals(bus2, bus9);
        Assertions.assertNotEquals(bus3, bus4);
        Assertions.assertNotEquals(bus3, bus5);
        Assertions.assertNotEquals(bus3, bus6);
        Assertions.assertNotEquals(bus3, bus7);
        Assertions.assertNotEquals(bus3, bus8);
        Assertions.assertNotEquals(bus3, bus9);
        Assertions.assertNotEquals(bus4, bus5);
        Assertions.assertNotEquals(bus4, bus6);
        Assertions.assertNotEquals(bus4, bus7);
        Assertions.assertNotEquals(bus4, bus8);
        Assertions.assertNotEquals(bus4, bus9);
        Assertions.assertNotEquals(bus5, bus6);
        Assertions.assertNotEquals(bus5, bus7);
        Assertions.assertNotEquals(bus5, bus8);
        Assertions.assertNotEquals(bus5, bus9);
        Assertions.assertNotEquals(bus6, bus7);
        Assertions.assertNotEquals(bus6, bus8);
        Assertions.assertNotEquals(bus6, bus9);
        Assertions.assertNotEquals(bus7, bus8);
        Assertions.assertNotEquals(bus7, bus9);
        Assertions.assertNotEquals(bus8, bus9);
    }

    @Test
    public void testInitLayouts()
    {
        MyJPanel myJPanel = new MyJPanel();
        MyJPanel myJPanel2  = new MyJPanel();
        MyJPanel myJPanel3 = new MyJPanel();
        MyJPanel myJPanel4  = new MyJPanel();
        MyJPanel myJPanel5  = new MyJPanel();
        MyJPanel myJPanel6  = new MyJPanel();
        Assertions.assertNotNull(myJPanel);
        Assertions.assertNotNull(myJPanel2);
        Assertions.assertNotNull(myJPanel3);
        Assertions.assertNotNull(myJPanel4);
        Assertions.assertNotNull(myJPanel5);
        Assertions.assertNotNull(myJPanel6);

        myJPanel.setLayout(null);
        myJPanel2.setLayout(null);
        myJPanel3.setLayout(null);
        myJPanel4.setLayout(new GridLayout(6, 3, 0, 0));
        myJPanel5.setLayout(null);
        myJPanel6.setLayout(null);
    }
}
