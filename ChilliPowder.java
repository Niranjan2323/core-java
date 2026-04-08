class ChilliPowder {

    int getQuantity() {
        int quantity = 200;
        System.out.println("Quantity is: " + quantity + " grams");
        return quantity;
    }
    void displaySpiceLevel(String level) {
        System.out.println("Spice level is: " + level);
        int q = getQuantity();
        System.out.println("Returned Quantity: " + q);
    }
    void showDetails() {
        System.out.println("Chilli Powder details");
        displaySpiceLevel("High");
    }
}

