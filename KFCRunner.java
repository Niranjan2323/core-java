class KFCRunner {

    public static void main(String[] args) {

        int unitPrice = KFC.getFoodCost("chickenRoll");
        System.out.println("Single Price: " + unitPrice);

        int totalAmount = KFC.calculateTotalPrice("chickenRoll", unitPrice, 2);
        System.out.println("Total Price: " + totalAmount);
    }
}