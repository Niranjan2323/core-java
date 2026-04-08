class Train {

    int getSpeed() {
        int speed = 90;
        System.out.println("Speed is: " + speed + " km/h");
        return speed;
    }
    void displayName(String trainName) {
        System.out.println("Train Name is: " + trainName);

        int s = getSpeed();
        System.out.println("Returned Speed: " + s);
    }

    void showDetails() {
        System.out.println("Train details");
        displayName("Express");
    }
}

