package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void increaseVolumeWithMinVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        int actual = cond.increaseVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeWithMaxVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        int actual = cond.increaseVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWithMinVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        int actual = cond.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWithMaxVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        int actual = cond.decreaseVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void nextChannelWithFirstChannel() {
        Radio cond = new Radio();
        cond.setCurrentChannel(0);
        int actual = cond.nextChannel();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void nextChannelWithLastChannel() {
        Radio cond = new Radio();
        cond.setCurrentChannel(9);
        int actual = cond.nextChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithFirstChannel() {
        Radio cond = new Radio();
        cond.setCurrentChannel(0);
        int actual = cond.prevChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithLastChannel() {
        Radio cond = new Radio();
        cond.setCurrentChannel(9);
        int actual = cond.prevChannel();
        int expected = 8;
        assertEquals(expected, actual);
    }
}