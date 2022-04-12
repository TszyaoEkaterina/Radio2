package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentChannel;

    public void setCurrentVolume(int newCurrentVolume){
        currentVolume = newCurrentVolume;
    }
    public void setCurrentChannel(int newCurrentChannel){
        currentChannel = newCurrentChannel;
    }
    public int increaseVolume() {
        if (currentVolume < 10) {
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
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == 9) {
            currentChannel = 0;
        }
        return currentChannel;
    }
    public int prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == 0) {
            currentChannel = 9;
        }
        return currentChannel;
    }
}
