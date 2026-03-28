class KTMBike {

    static byte bikeSpeed(byte lowSpeed, byte highSpeed) {

        System.out.println("Checking the KTM bike speed");
        byte normalSpeed = 60;

        System.out.println("Comparing the speeds");

        if (lowSpeed > highSpeed) {
            System.out.println("Low speed value is higher");
            System.out.println("Bike is running in normal mode");
            return normalSpeed;
        } else {
            System.out.println("High speed value is higher");
            System.out.println("Bike is running very fast");
            return 90;
        }
    }
}