package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 0;
        this.maxStation = 9;
    }

    public Radio(int numberOfStations) {
        if (numberOfStations < 1) {
            throw new IllegalArgumentException("Количество станций должно быть больше 0");
        }
        this.maxStation = numberOfStations - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 100) {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= maxStation) {
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

    public int getMaxStation () {
        return maxStation;
    }
}
