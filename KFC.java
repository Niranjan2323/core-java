class KFC {

    static int getFoodCost(String foodName) {

        int costPerItem = 0;

        if (foodName.equals("zingerBurger")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 180;

        } else if (foodName.equals("chickenBucket")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 600;

        } else if (foodName.equals("popcornChicken")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 250;

        } else if (foodName.equals("chickenRoll")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 120;

        } else if (foodName.equals("vegBurger")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 100;

        } else if (foodName.equals("fries")) {
            System.out.println("Food item: " + foodName);
            costPerItem = 90;

        } else {
            System.out.println("Food not available");
            return 0;
        }

        return costPerItem;
    }

    static int calculateTotalPrice(String foodName, int unitPrice, int quantityValue) {

        int finalPrice = 0;

        if (unitPrice > 0) {
            finalPrice = unitPrice * quantityValue;
        } else {
            System.out.println("Invalid order");
        }

        return finalPrice;
    }
}