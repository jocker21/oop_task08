package oop_task8_2;

import java.util.Objects;

class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }



    @Override
    public String toString() {
        return super.toString() + ", X=" + resolutionX + ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Monitor monitor = (Monitor) obj;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}
