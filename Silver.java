class Silver {

    int getWeight() {
        int weight = 500;
        System.out.println("Weight is: " + weight + " grams");
        return weight;
    }

    void displayType(String type) {
        System.out.println("Type is: " + type);

        int w = getWeight();
        System.out.println("Returned Weight: " + w);
    }
    void showDetails() {
        System.out.println("Silver details");
        displayType("Sterling Silver");
    }
}

