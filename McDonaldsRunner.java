class McDonaldsRunner {

    public static void main(String[] args) {

        int unitCost = McDonalds.getBurgerPrice("Chicken big mac");
        System.out.println("Single Price: " + unitCost);

        int finalBill = McDonalds.calculateTotal("Chicken big mac", unitCost, 2);
        System.out.println("Total Price: " + finalBill);
    }
}