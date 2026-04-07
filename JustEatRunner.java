class JustEatRunner {

    public static void main(String[] args) {

        int unitPrice = JustEat.getMealPrice("soup");
        System.out.println("Single Price: " + unitPrice);

        int finalAmount = JustEat.generateBillAmount("soup", unitPrice, 3);
        System.out.println("Total Price: " + finalAmount);
    }
}