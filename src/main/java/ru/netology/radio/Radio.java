package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 50;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
