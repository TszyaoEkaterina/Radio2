package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int currentChannel;
    private int channelNumber = 10;

    public Radio(int currentChannel, int channelNumber) {
        this.currentChannel = currentChannel;
        this.channelNumber = channelNumber;
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
        }
        else if (currentChannel == channelNumber - 1) {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        else if (currentChannel == 0) {
            currentChannel = channelNumber - 1;
        }
        return currentChannel;
    }
}
