package org.example.Radio;

public class Radio {
    private int numberRadioStation;
    private int volume;
    public int getVolume;
    public int getNumberRadioStation;


    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberNow(int newNumberNow) {
        if (newNumberNow < 10) {
            newNumberNow = newNumberNow;
        } else {
            newNumberNow = 0;
        }
        numberRadioStation = newNumberNow;
    }

    public void setNextNumber(int newNextNumber) {
        if (newNextNumber < 9) {
            newNextNumber = newNextNumber + 1;
        } else {
            newNextNumber = 0;
        }
        numberRadioStation = newNextNumber;
    }

    public void setPrevNumber(int newPrevNumber) {
        if (newPrevNumber > 0) {
            newPrevNumber = newPrevNumber - 1;
        }
        if (newPrevNumber < 0) {
            newPrevNumber = 9;
        }
        numberRadioStation = newPrevNumber;
    }

    public void setChangeVolume(int newChangeVolume) {
        if (newChangeVolume > 100) {
            newChangeVolume = 100;
        }
        if (newChangeVolume < 100) {
            newChangeVolume = newChangeVolume;
        }
        if (newChangeVolume < 0) {
            newChangeVolume = 0;
        }
        if (newChangeVolume > 0) {
            newChangeVolume = newChangeVolume;
        }
        volume = newChangeVolume;
    }

    public void setNextVolume(int newNextVolume) {
        if (newNextVolume < 100) {
            newNextVolume = newNextVolume + 1;
        }
        if (newNextVolume > 100) {
            newNextVolume = 100;
        }
        volume = newNextVolume;
    }

    public void setPrevVolume(int newPrevVolume) {
        if (newPrevVolume < 100) {
            newPrevVolume = newPrevVolume - 1;
        }
        if (newPrevVolume > 100) {
            newPrevVolume = 100;
        }
        if (newPrevVolume < 0) {
            newPrevVolume = 0;
        }
        volume = newPrevVolume;
    }
}
