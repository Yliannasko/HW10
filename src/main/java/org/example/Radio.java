package org.example;

public class Radio {
    public int getNumberRadioStation;

    // private int numberRadioStation;
    public int getNumberRadioStation() {
        return getNumberRadioStation;
    }

    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation > 9) {
            return; //newNumberRadioStation = 0;
        }
        if (newNumberRadioStation < 0) {
            newNumberRadioStation = 9;
        }
        if (newNumberRadioStation < 9) {
            newNumberRadioStation = newNumberRadioStation + 1;
        }
        if (newNumberRadioStation == 9) {
            newNumberRadioStation = newNumberRadioStation;
        }
        getNumberRadioStation = newNumberRadioStation;
    }

    public int getRadioSoundVolume;

    public int getRadioSoundVolume() {
        return getRadioSoundVolume;
    }

    public void setRadioSoundVolume(int newRadioSoundVolume) {
        if (newRadioSoundVolume > 100) {
            newRadioSoundVolume = 100;
        }
        if (newRadioSoundVolume == 100) {
            newRadioSoundVolume = newRadioSoundVolume;
        }
        if (newRadioSoundVolume <= 0) {
            newRadioSoundVolume = 0;
            return;
        }
        if (newRadioSoundVolume < 100) {
            newRadioSoundVolume = newRadioSoundVolume + 1;
        }
        getRadioSoundVolume = newRadioSoundVolume;
    }


}
