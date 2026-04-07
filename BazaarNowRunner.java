class BazaarNowRunner {

    public static void main(String[] args) {

        int unitPrice = BazaarNow.getProductRate("soap");
        System.out.println("Single Price: " + unitPrice);

        int totalAmount = BazaarNow.generateTotalBill("soap", unitPrice, 5);
        System.out.println("Total Price: " + totalAmount);
    }
}