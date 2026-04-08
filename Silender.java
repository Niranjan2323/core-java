class Silender {

    double getVolume() {
        double volume = 314.9;
        System.out.println("Volume is: " + volume);
        return volume;
    }

    void displayMaterial(String material) {
        System.out.println("Material is: " + material);

        double v = getVolume();
        System.out.println("Returned Volume: " + v);
    }

    void showDetails() {
        System.out.println("Silender details");
        displayMaterial("Steel");
    }
}

