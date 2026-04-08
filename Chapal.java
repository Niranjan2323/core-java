class chapal {
    int getSize() {
        int size = 9;
        System.out.println("Size is: " + size + " inches");
        return size;
    }
    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int s = getSize();
        System.out.println("Returned Size: " + s);
    }
    void showDetails() {
        System.out.println("Chapal details");
        displayBrand("Bata");
    }
}

