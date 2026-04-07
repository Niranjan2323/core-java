class JustEat {

    static int getMealPrice(String mealName) {

        int mealCost = 0;

        if (mealName.equals("soup")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 150;

        } else if (mealName.equals("panner chilli")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 180;

        } else if (mealName.equals("friedRice")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 200;

        } else if (mealName.equals("noodles")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 170;

        } else if (mealName.equals("burger")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 120;

        } else if (mealName.equals("sandwich")) {
            System.out.println("Meal is: " + mealName);
            mealCost = 130;

        } else {
            System.out.println("Meal not available");
            return 0;
        }

        return mealCost;
    }

    static int generateBillAmount(String mealName, int pricePerUnit, int quantityOrdered) {

        int totalCost = 0;

        if (pricePerUnit > 0) {
            totalCost = pricePerUnit * quantityOrdered;
        } else {
            System.out.println("Invalid order");
        }

        return totalCost;
    }
}