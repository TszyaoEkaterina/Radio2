package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio cond = new Radio();

    @Test
    public void increaseVolumeWithMinVolume() {
        cond.setCurrentVolume(0);
        int actual = cond.increaseVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWithMaxVolume() {
        cond.setCurrentVolume(10);
        int actual = cond.increaseVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWithMinVolume() {
        cond.setCurrentVolume(0);
        int actual = cond.decreaseVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWithMaxVolume() {
        cond.setCurrentVolume(10);
        int actual = cond.decreaseVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void nextChannelWithFirstChannel() {
        cond.setCurrentChannel(0);
        int actual = cond.nextChannel();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void nextChannelWithLastChannel() {
        cond.setCurrentChannel(9);
        int actual = cond.nextChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevChannelWithFirstChannel() {
        cond.setCurrentChannel(0);
        int actual = cond.prevChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevChannelWithLastChannel() {
        cond.setCurrentChannel(9);
        int actual = cond.prevChannel();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void nextChannelWithSecondLastChannel() {
        cond.setCurrentChannel(8);
        int actual = cond.nextChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void prevChannelWithSecondChannel() {
        cond.setCurrentChannel(1);
        int actual = cond.prevChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevChannelWithSecondLastChannel() {
        cond.setCurrentChannel(8);
        int actual = cond.prevChannel();
        int expected = 7;
        assertEquals(expected, actual);
    }
}