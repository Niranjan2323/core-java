class Car {

    static byte carSpeed(byte lowSpeed, byte highSpeed) 
    {
        System.out.println("Checking the car speed");
        byte normalSpeed = 60;

        System.out.println("Comparing the speeds");

        if (lowSpeed > highSpeed) {
            System.out.println("Low speed value is higher");
            System.out.println("Car is running in normal mode");
            return normalSpeed;
        } else {
            System.out.println("High speed value is higher");
            System.out.println("Car is running fast");
            return 80;
        }
    }
}