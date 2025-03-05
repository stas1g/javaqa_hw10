package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void testInitialState() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        // Проверка на максимальную громкость
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        // Проверка на минимальную громкость
        for (int i = 0; i < 100; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        // Проверка перехода с 9 на 0
        for (int i = 0; i < 9; i++) {
            radio.nextStation();
        }
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testPrevStation() {
        Radio radio = new Radio();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());

        // Проверка перехода с 0 на 9
        for (int i = 0; i < 9; i++) {
            radio.prevStation();
        }
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

        // Проверка на недопустимые значения
        radio.setCurrentStation(-1);
        assertEquals(5, radio.getCurrentStation()); // Не должно измениться

        radio.setCurrentStation(10);
        assertEquals(5, radio.getCurrentStation()); // Не должно измениться
    }



    @Test
    void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(75);
        assertEquals(75, radio.getCurrentVolume());

        // Проверка на недопустимые значения
        radio.setCurrentVolume(-1);
        assertEquals(75, radio.getCurrentVolume()); // Не должно измениться

        radio.setCurrentVolume(101);
        assertEquals(75, radio.getCurrentVolume()); // Не должно измениться
    }

    @Test
    void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void testCustomConstructor() {
        Radio radio = new Radio(15);
        assertEquals(14, radio.getMaxStation());
    }

    @Test
    void testNextStationWithCustomMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testPrevStationWithCustomMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(14, radio.getCurrentStation());
    }
}

