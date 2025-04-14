package oop_task8_2;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 299.99f, "SN12345", 1920, 1080);
        EthernetAdapter adapter = new EthernetAdapter("TP-Link", 49.99f, "SN67890", 1000, "00:1A:2B:3C:4D:5E");

        System.out.println(monitor);
        System.out.println(adapter);
    }
}


