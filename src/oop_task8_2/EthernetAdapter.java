package oop_task8_2;
import java.util.Objects;

class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        EthernetAdapter adapter = (EthernetAdapter) obj;
        return speed == adapter.speed && Objects.equals(mac, adapter.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
