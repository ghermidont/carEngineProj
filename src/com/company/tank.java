package com.company;

public class tank {
    private Float volume;

    //у бака есть максимальный обьем - 200 литров

    public tank(Float volume) {
        this.volume = volume;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "tank{" +
                "volume=" + volume +
                '}';
    }
}
