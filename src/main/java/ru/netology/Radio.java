package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentChannel;

    public void setCurrentVolume(int newCurrentVolume){
        currentVolume = newCurrentVolume;
    }
    public void setCurrentChannel(int newCurrentChannel){
        currentVolume = newCurrentChannel;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel == 9) {
            currentChannel = 0;
        }
    }
    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == 0) {
            currentChannel = 9;
        }
    }
}
