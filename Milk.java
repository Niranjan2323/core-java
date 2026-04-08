class Milk {

    int getQuantity() {
        int quantity = 2;
        System.out.println("Quantity is: " + quantity + " liters");
        return quantity;
    }

    void displayType(String type) {
        System.out.println("Milk type is: " + type);

        int q = getQuantity();
        System.out.println("Returned Quantity: " + q);
    }

    void showDetails() {
        System.out.println("Milk details");
        displayType("Full Cream");
    }
}

