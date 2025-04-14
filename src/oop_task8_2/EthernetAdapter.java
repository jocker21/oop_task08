package oop_task8_2;


    class EthernetAdapter extends Device {
        private int speed;
        private String mac;

        public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
            super(manufacturer, price, serialNumber);
            this.speed = speed;
            this.mac = mac;
        }

        public int getSpeed() {
            return speed;
        }

        public String getMac() {
            return mac;
        }

        @Override
        public String toString() {
            return super.toString() + ", Speed: " + speed + " Mbps, MAC: " + mac;
        }
    }

