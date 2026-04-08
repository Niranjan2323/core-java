class Chicken {

    int getWeight() {
        int weight = 2;
        System.out.println("Weight is: " + weight + " kg");
        return weight;
    }
    void displayType(String type) {
        System.out.println("Chicken type is: " + type);
		
        int w = getWeight();
        System.out.println("Returned Weight: " + w);
    }
    void showDetails() {
        System.out.println("Chicken details");
        displayType("Broiler");
    }
}

