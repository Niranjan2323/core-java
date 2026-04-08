class Bike {

    int getSpeed() {
        int speed = 120;
        System.out.println("Speed is: " + speed);
        return speed;
    }

    void displayModel(String model) {
        System.out.println("Model is: " + model);

        int s = getSpeed();
        System.out.println("Returned Speed: " + s);
    }

    void showDetails() {
        System.out.println("Bike details");

        displayModel("KTM RC 390");
    }
}

