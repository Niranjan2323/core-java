class Airplane {

    static byte airplaneSpeed(byte lowSpeed, byte highSpeed) {

        System.out.println("Checking the airplane speed");
        byte normalSpeed = 100;

        System.out.println("Comparing the speeds");

        if (lowSpeed > highSpeed) {
            System.out.println("Low speed value is higher");
            System.out.println("Airplane is flying in normal mode");
            return normalSpeed;
        } else {
            System.out.println("High speed value is higher");
            System.out.println("Airplane is flying very fast");
            return 120;
        }
    }
}