class Door {

    int getHeight() {
        int height = 7;
        System.out.println("Height is: " + height + " feet");
        return height;
    }
    void displayMaterial(String material) {
        System.out.println("Material is: " + material);
        int h = getHeight();
        System.out.println("Returned Height: " + h);
    }
    void showDetails() {
        System.out.println("Door details");
        displayMaterial("Wood");
    }
}


