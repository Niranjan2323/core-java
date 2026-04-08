class cycle {

    int getSpeed() {
        int speed = 20;
        System.out.println("Speed is: " + speed + " km/h");
        return speed;
    }
    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);

        int s = getSpeed();
        System.out.println("Returned Speed: " + s);
    }
    void showDetails() {
        System.out.println("Cycle details");

        // calling next method
        displayBrand("Hero");
    }
}

