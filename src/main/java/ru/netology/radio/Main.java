package ru.netology.radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        // Устанавливаем радиостанцию и громкость через сеттеры
        radio.setCurrentStation(5);
        radio.setCurrentVolume(75);

        // Получаем текущую радиостанцию и громкость через геттеры
        System.out.println("Текущая радиостанция: " + radio.getCurrentStation());
        System.out.println("Текущая громкость: " + radio.getCurrentVolume());

        // Увеличиваем громкость
        radio.increaseVolume();
        System.out.println("Громкость после увеличения: " + radio.getCurrentVolume());

        // Переключаем на следующую радиостанцию
        radio.nextStation();
        System.out.println("Радиостанция после переключения: " + radio.getCurrentStation());
    }
}