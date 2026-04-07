class McDonalds {

    static int getBurgerPrice(String foodItem) {

        int itemCost = 0;

        if (foodItem.equals("cheesy burger meals")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 80;

        } else if (foodItem.equals("chicken burger")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 120;

        } else if (foodItem.equals("Chicken big mac")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 150;

        } else if (foodItem.equals("SpicyPaneer")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 140;

        } else if (foodItem.equals("fries")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 100;

        } else if (foodItem.equals("coke")) {
            System.out.println("Item is: " + foodItem);
            itemCost = 60;

        } else {
            System.out.println("Item not available");
            return 0;
        }

        return itemCost;
    }

    static int calculateTotal(String foodItem, int unitCost, int quantityCount) {

        int totalAmount = 0;

        if (unitCost > 0) {
            totalAmount = unitCost * quantityCount;
        } else {
            System.out.println("Invalid item");
        }

        return totalAmount;
    }
}