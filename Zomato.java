class Zomato {

    static int findFoodCost(String foodName) {

        int cost = 0;

        if (foodName.equals("biryani")) {
            System.out.println("Food selected: " + foodName);
            cost = 250;

        } else if (foodName.equals("pizza")) {
            System.out.println("Food selected: " + foodName);
            cost = 300;

        } else if (foodName.equals("burger")) {
            System.out.println("Food selected: " + foodName);
            cost = 150;

        } else if (foodName.equals("pasta")) {
            System.out.println("Food selected: " + foodName);
            cost = 200;

        } else if (foodName.equals("noodles")) {
            System.out.println("Food selected: " + foodName);
            cost = 180;

        } else {
            System.out.println("Food not available");
            return 0;
        }

        return cost;
    }

    static int computeTotalAmount(String foodName, int unitCost, int orderQuantity) {

        int billAmount = 0;

        if (unitCost > 0) {
            billAmount = unitCost * orderQuantity;
        } else {
            System.out.println("Invalid order");
        }

        return billAmount;
    }
}