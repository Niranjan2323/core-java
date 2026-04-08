class Doll {
    int getCost() {
        int cost = 800;
        System.out.println("Cost is: " + cost);
        return cost;
   }
   
    void displayType(String type) {
        System.out.println("Type is: " + type);

        int c = getCost();
        System.out.println("Returned Cost: " + c);
    }

    void showDetails() {
        System.out.println("Doll details");
        displayType("Barbie");
    }
}

