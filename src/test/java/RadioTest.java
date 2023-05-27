import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeStation() {
        Radio radio = new Radio();

        radio.setRadioStation(-77);
        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBoarderStationMax() {
        Radio radio = new Radio();

        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetboarderStationMin() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(56);

        int expected = 56;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeVolume() {
        Radio radio = new Radio();

        radio.setRadioVolume(-4);
        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBoardervolumeMax() {
        Radio radio = new Radio();

        radio.setRadioVolume(101);
        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetboarderVolumeMin() {
        Radio radio = new Radio();

        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setRadioStation(3);

        radio.next();
        int expected = 4;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextIfStationMax() {
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.next();
        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);

        radio.prev();
        int expected = 8;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevIfStationMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() {
        Radio radio = new Radio();
        radio.setRadioVolume(66);

        radio.volumeUp();
        int expected = 67;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setRadioVolume(100);

        radio.volumeUp();
        int expected = 100;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDown() {
        Radio radio = new Radio();
        radio.setRadioVolume(100);

        radio.volumeDown();
        int expected = 99;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();
        radio.setRadioVolume(0);

        radio.volumeDown();
        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
