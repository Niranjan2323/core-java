class Box {
    int getLength() {
        int length = 15;
        System.out.println("Length is: " + length + " cm");
        return length;
    }
    void displayMaterial(String material) {
        System.out.println("Material is: " + material);

        int l = getLength();
        System.out.println("Returned Length: " + l);
    }
    void showDetails() {
        System.out.println("Box details");
        displayMaterial("Wood");
    }
}

