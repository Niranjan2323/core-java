class Ambulance {

    static byte ambulanceSpeed(byte lowSpeed, byte highSpeed) {

        System.out.println("Checking the ambulance speed");
        byte normalSpeed = 60;

        System.out.println("Comparing the speeds");

        if (lowSpeed > highSpeed) {
            System.out.println("Low speed value is higher");
            System.out.println("Ambulance is moving in normal mode");
            return normalSpeed;
        } else {
            System.out.println("High speed value is higher");
            System.out.println("Ambulance is moving fast for emergency");
            return 80;
        }
    }
}