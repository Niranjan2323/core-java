class TV {

    int getScreenSize() {
        int size = 55;
        System.out.println("Screen Size is: " + size + " inches");
        return size;
    }

    void displayBrand(String company) {
        System.out.println("Company is: " + company);

        int s = getScreenSize();
        System.out.println("Returned Screen Size: " + s);
    }

    void showDetails() {
        System.out.println("TV details");
        displayBrand("Sony");
    }
}

