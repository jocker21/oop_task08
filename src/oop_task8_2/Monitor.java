package oop_task8_2;


    class Monitor extends Device {
        private int resolutionX;
        private int resolutionY;

        public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
            super(manufacturer, price, serialNumber);
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }

        public int getResolutionX() {
            return resolutionX;
        }

        public int getResolutionY() {
            return resolutionY;
        }

        @Override
        public String toString() {
            return super.toString() + ", Resolution: " + resolutionX + "x" + resolutionY;
        }
    }

