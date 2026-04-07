class DoorDash {

    static int getFoodPrice(String dishName) {

        int dishCost = 0;

        if (dishName.equals("big mac")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 180;

        } else if (dishName.equals("burger")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 150;

        } else if (dishName.equals("pizza")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 300;

        } else if (dishName.equals("sandwich")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 120;

        } else if (dishName.equals("pasta")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 220;

        } else if (dishName.equals("fries")) {
            System.out.println("Dish is: " + dishName);
            dishCost = 100;

        } else {
            System.out.println("Dish not available");
            return 0;
        }

        return dishCost;
    }

    static int calculateFinalBill(String dishName, int unitCost, int quantityOrdered) {

        int totalBillAmount = 0;

        if (unitCost > 0) {
            totalBillAmount = unitCost * quantityOrdered;
        } else {
            System.out.println("Invalid order");
        }

        return totalBillAmount;
    }
}