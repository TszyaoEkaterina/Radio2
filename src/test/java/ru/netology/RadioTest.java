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
        cond.setCurrentVolume(100);
        int actual = cond.increaseVolume();
        int expected = 100;
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
        cond.setCurrentVolume(100);
        int actual = cond.decreaseVolume();
        int expected = 99;
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
    void nextChannelWithLastChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(9);
        int actual = cond.nextChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithFirstChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(0);
        int actual = cond.prevChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithLastChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(9);
        int actual = cond.prevChannel();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    void nextChannelWithLastChannelWithChangedChannelNumber() {
        Radio cond = new Radio(19,20);
        int actual = cond.nextChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithFirstChannelWithChangedChannelNumber() {
        Radio cond = new Radio(0,20);
        int actual = cond.prevChannel();
        int expected = 19;
        assertEquals(expected, actual);
    }
    @Test
    void nextChannelWithSecondLastChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(8);
        int actual = cond.nextChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithSecondChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(1);
        int actual = cond.prevChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithSecondLastChannelWithUnchangedChannelNumber() {
        cond.setCurrentChannel(8);
        int actual = cond.prevChannel();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    void nextChannelWithSecondLastChannelWithChangedChannelNumber() {
        Radio cond = new Radio(18,20);
        int actual = cond.nextChannel();
        int expected = 19;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWitSecondChannelWithChangedChannelNumber() {
        Radio cond = new Radio(1,20);
        int actual = cond.prevChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void prevChannelWithSecondLastChannelWithChangedChannelNumber() {
        Radio cond = new Radio(18,20);
        int actual = cond.prevChannel();
        int expected = 17;
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetChannelOnlyBetweenLimits() {
        cond.setCurrentChannel(10);
        int actual = cond.nextChannel();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetVolumeOnlyFrom0to100() {
        cond.setCurrentVolume(101);
        int actual = cond.increaseVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }
}