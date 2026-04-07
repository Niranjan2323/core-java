class DominosRunner {

    public static void main(String[] args) {

        int unitPrice = Dominos.getPizzaPrice("cheesy dip");
        System.out.println("Single Price: " + unitPrice);

        int totalBill = Dominos.generateBill("cheesy dip", unitPrice, 3);
        System.out.println("Total Price: " + totalBill);
    }
}