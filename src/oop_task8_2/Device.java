package oop_task8_2;

import java.util.Objects;

class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return Float.compare(device.price, price) == 0 &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}


