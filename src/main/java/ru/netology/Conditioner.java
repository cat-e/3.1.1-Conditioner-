package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 25;
    private int minTemperature = 16;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature() {
            currentTemperature = currentTemperature + 1;
        if (currentTemperature >= maxTemperature) {
            currentTemperature = maxTemperature;
            return;
        }
    }

    public void decreaseCurrentTemperature() {
            currentTemperature = currentTemperature - 1;
        if (currentTemperature <= minTemperature) {
            currentTemperature = minTemperature;
            return;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


