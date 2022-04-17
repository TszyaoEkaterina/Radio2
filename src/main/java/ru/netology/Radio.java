package ru.netology;

public class Radio {
    private int currentVolume = 50;
    private int currentChannel = 0;
    private int channelNumber = 10;

    public Radio() {}
    public Radio(int currentChannel, int channelNumber) {
        this.currentChannel = currentChannel;
        this.channelNumber = channelNumber;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100 || newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > channelNumber - 1 || newCurrentChannel < 0) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int nextChannel() {
        if (currentChannel < channelNumber - 1) {
            currentChannel = currentChannel + 1;
        } else if (currentChannel == channelNumber - 1) {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else if (currentChannel == 0) {
            currentChannel = channelNumber - 1;
        }
        return currentChannel;
    }
}
