package ru.netology;

public class Radio {
    private int currentVolume = 5;
    private int currentChannel = 0;

    public int getCurrentVolume() {return currentVolume;}
    public int getCurrentChannel() {return currentChannel;}

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume > 10 || newCurrentVolume < 0){
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void setCurrentChannel(int newCurrentChannel){
        if (newCurrentChannel > 9 || newCurrentChannel < 0){
            return;
        }
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
        else if (currentChannel == 9) {
            currentChannel = 0;
        }
        return currentChannel;
    }
    public int prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        else if (currentChannel == 0) {
            currentChannel = 9;
        }
        return currentChannel;
    }
}
