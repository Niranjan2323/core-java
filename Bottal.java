class Bottal {

    int getCapacity() {
        int capacity = 2;
        System.out.println("Capacity is: " + capacity + " liters");
        return capacity;
    }
    void displayMaterial(String material) {
        System.out.println("Material is: " + material);

        int c = getCapacity();
        System.out.println("Returned Capacity: " + c);
    }

    void showDetails() {
        System.out.println("Bottal details");
        displayMaterial("Plastic");
    }
}

