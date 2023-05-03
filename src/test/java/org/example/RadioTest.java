package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldGetMinRadioStation() {
        Radio cond = new Radio();
        cond.setNumberRadioStation(0);
        int expected = 1;
        int actual = cond.getNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxRadioStation() {
        Radio cond = new Radio();
        cond.setNumberRadioStation(9);
        int expected = 9;
        int actual = cond.getNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetInTheRangeRadioStation() {
        Radio cond = new Radio();
        cond.setNumberRadioStation(8);
        int expected = 9;
        int actual = cond.getNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAboveTheRangeRadioStation() {
        Radio cond = new Radio();
        cond.setNumberRadioStation(10);
        int expected = 0;
        int actual = cond.getNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetBelowTheRangeRadioStation() {
        Radio cond = new Radio();
        cond.setNumberRadioStation(-2);
        int expected = 9;
        int actual = cond.getNumberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioSoundVolumeInTheRange() {
        Radio cond = new Radio();
        cond.setRadioSoundVolume(10);
        int expected = 11;
        int actual = cond.getRadioSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioSoundVolumeMax() {
        Radio cond = new Radio();
        cond.setRadioSoundVolume(100);
        int expected = 100;
        int actual = cond.getRadioSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioSoundVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setRadioSoundVolume(101);
        int expected = 100;
        int actual = cond.getRadioSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioSoundVolumeMin() {
        Radio cond = new Radio();
        cond.setRadioSoundVolume(0);
        int expected = 0;
        int actual = cond.getRadioSoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRadioSoundVolumeBelowMin() {
        Radio cond = new Radio();
        cond.setRadioSoundVolume(-1);
        int expected = 0;
        int actual = cond.getRadioSoundVolume;

        Assertions.assertEquals(expected, actual);
    }
}