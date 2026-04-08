class CoffeePowder {

    int getWeight() {
        int weight = 250;
        System.out.println("Weight is: " + weight + " grams");
        return weight;
    }
    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int w = getWeight();
        System.out.println("Returned Weight: " + w);
    }
    void showDetails() {
        System.out.println("Coffee Powder details");
        displayBrand("Nescafe");
    }
}

