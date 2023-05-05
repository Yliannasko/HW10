package org.example.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberNow() {
        Radio radio = new Radio();
        radio.setNumberNow(10);
        radio.getNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberNow2() {
        Radio radio = new Radio();
        radio.setNumberNow(5);
        radio.getNumberRadioStation();
        int expected = 5;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setNextNumber(10);
        radio.getNumberRadioStation();
        int expected = 0;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber2() {
        Radio radio = new Radio();
        radio.setNextNumber(8);
        radio.getNumberRadioStation();
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.setPrevNumber(5);
        radio.getNumberRadioStation();
        int expected = 4;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber2() {
        Radio radio = new Radio();
        radio.setPrevNumber(-2);
        radio.getNumberRadioStation();
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume() {
        Radio radio = new Radio();
        radio.setChangeVolume(88);
        radio.getVolume();
        int expected = 88;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume2() {
        Radio radio = new Radio();
        radio.setChangeVolume(101);
        radio.getVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChangeVolume3() {
        Radio radio = new Radio();
        radio.setChangeVolume(-2);
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setNextVolume(50);
        radio.getVolume();
        int expected = 51;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume2() {
        Radio radio = new Radio();
        radio.setNextVolume(101);
        radio.getVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio radio = new Radio();
        radio.setPrevVolume(40);
        radio.getVolume();
        int expected = 39;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume2() {
        Radio radio = new Radio();
        radio.setPrevVolume(-5);
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume3() {
        Radio radio = new Radio();
        radio.setPrevVolume(101);
        radio.getVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}

